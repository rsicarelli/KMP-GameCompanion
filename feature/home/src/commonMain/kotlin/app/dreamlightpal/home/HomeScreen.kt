package app.dreamlightpal.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import app.dreamlightpal.collection.domain.model.MealRepository
import app.dreamlightpal.compose.navigationBarPadding
import app.dreamlightpal.compose.rememberAsyncImagePainter
import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.detail.DetailScreen
import app.dreamlightpal.home.HomeScreenDefaults.FullScreenWeight
import app.dreamlightpal.home.HomeScreenDefaults.MultiPaneWidthThreshold
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.list.ListScreen
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import org.kodein.di.DI
import org.kodein.di.compose.rememberInstance
import org.kodein.di.compose.withDI

@Composable
fun HomeScreen(
    componentContext: ComponentContext,
    di: DI,
    isDarkMode: Boolean = isSystemInDarkTheme(),
    onToggleTheme: () -> Unit,
) = withDI(di) {
    val listComponentFactory by rememberInstance<ListComponentFactory>()
    val detailComponentFactory by rememberInstance<DetailComponentFactory>()
    val homeComponent = remember(componentContext, listComponentFactory, detailComponentFactory) {
        HomeComponentHolder(componentContext, listComponentFactory, detailComponentFactory)
    }

    Content(
        homeComponent = homeComponent,
        isDarkMode = isDarkMode,
        onToggleTheme = onToggleTheme
    )
}

@Composable
private fun Meals(mealRepository: MealRepository) {
    val meals by mealRepository.collection.collectAsState(emptyList())

    LaunchedEffect(Unit) {
        mealRepository.load()
    }
    meals?.let {
        Box {
            LazyColumn {
                items(items = it) { listItem ->
                    val interactionSource = remember { MutableInteractionSource() }

                    ElevatedCard(
                        modifier = Modifier.size(200.dp).padding(16.dp),
                        shape = RoundedCornerShape(28.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        ),
                    ) {
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp).then(Modifier.padding(top = 24.dp, bottom = 8.dp)),
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(listItem.imageUrl),
                                contentDescription = null,
                                contentScale = ContentScale.FillHeight,
                            )

                            Text(
                                modifier = Modifier.padding(horizontal = 16.dp)
                                    .align(Alignment.CenterHorizontally),
                                text = listItem.name,
                                maxLines = 1,
                                style = MaterialTheme.typography.titleMedium,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Content(
    homeComponent: HomeComponentHolder,
    isDarkMode: Boolean,
    onToggleTheme: () -> Unit,
) {
    BoxWithConstraints(modifier = Modifier.navigationBarPadding()) {
        val isMultiPaneRequired by remember { derivedStateOf { maxWidth >= MultiPaneWidthThreshold } }

        val onItemClick: (String) -> Unit = remember(homeComponent) {
            { id -> homeComponent.onItemSelected(id, isMultiPaneRequired) }
        }

        Surface(
            color = NavigationBarDefaults.containerColor,
            contentColor = MaterialTheme.colorScheme.contentColorFor(NavigationBarDefaults.containerColor),
            tonalElevation = NavigationBarDefaults.Elevation,
        ) {
            val items = remember { listOf("Home", "Search", "Settings") }
            val icons = remember { listOf(Icons.Rounded.Home, Icons.Rounded.Search, Icons.Rounded.Settings) }

            if (isMultiPaneRequired) {
                SplitScreen(
                    items = items,
                    icons = icons,
                    isDarkMode = isDarkMode,
                    onToggleTheme = onToggleTheme,
                    homeComponent = homeComponent,
                    onItemClick = onItemClick
                )
            } else {
                FullScreen(homeComponent, onItemClick, items, icons)
            }
        }

        DisposableEffect(isMultiPaneRequired) {
            homeComponent.setMultiPane(isMultiPaneRequired)
            onDispose {}
        }
    }
}

@Composable
private fun FullScreen(
    homeComponent: HomeComponentHolder,
    onItemClick: (String) -> Unit,
    items: List<String>,
    icons: List<ImageVector>,
) {
    var selectedItem by remember { mutableStateOf(0) }
    val _onItemClick: (String) -> Unit = remember {
        {
            onItemClick(it)
        }
    }

    Column {
        ListPane(
            stack = homeComponent.listStack,
            modifier = Modifier.weight(FullScreenWeight),
            onItemClick = _onItemClick
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .selectableGroup(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    icon = { Icon(icons[index], contentDescription = item) },
                    label = { Text(item) },
                    selected = selectedItem == index,
                    onClick = { selectedItem = index }
                )
            }
        }
    }
}

@Composable
private fun SplitScreen(
    items: List<String>,
    icons: List<ImageVector>,
    isDarkMode: Boolean,
    onToggleTheme: () -> Unit,
    homeComponent: HomeComponentHolder,
    onItemClick: (String) -> Unit,
) {
    val selectedItem by remember { mutableStateOf(0) }
    var isSplitActive by remember { mutableStateOf(false) }

    Row {
        NavigationRail(
            items = items,
            icons = icons,
            selectedItem = selectedItem,
            isDarkMode = isDarkMode,
            onToggleTheme = onToggleTheme
        )

        val _onItemClick: (String) -> Unit = remember {
            {
                onItemClick(it)
                isSplitActive = !isSplitActive
            }
        }

        ListPane(
            modifier = Modifier.weight(FullScreenWeight).animateContentSize(),
            stack = homeComponent.listStack,
            onItemClick = _onItemClick
        )

        AnimatedVisibility(visible = isSplitActive) {
            DetailsPane(
                modifier = Modifier,
                stack = homeComponent.detailStack,
                isSplitScreen = true
            )
        }
    }
}

@Composable
private fun NavigationRail(
    items: List<String>,
    icons: List<ImageVector>,
    selectedItem: Int,
    isDarkMode: Boolean,
    onToggleTheme: () -> Unit,
) {
    var selectedItem1 = selectedItem
    Column(
        Modifier
            .fillMaxHeight()
            .widthIn(min = 80.dp, max = 300.dp)
            .padding(vertical = 24.dp),
    ) {
        Column(
            modifier = Modifier.selectableGroup().weight(1F),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items.forEachIndexed { index, item ->
                NavigationRailItem(
                    icon = {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = item
                        )
                    },
                    label = {
                        Text(
                            modifier = Modifier.padding(top = 8.dp),
                            text = item,
                            style = MaterialTheme.typography.labelLarge
                        )
                    },
                    selected = selectedItem1 == index,
                    onClick = { selectedItem1 = index }
                )
            }
        }

        NavigationRailItem(
            icon = {
                Icon(
                    imageVector = if (isDarkMode) Icons.Rounded.LightMode else Icons.Rounded.DarkMode,
                    contentDescription = "Toggle dark mode"
                )
            },
            selected = false,
            onClick = onToggleTheme
        )
    }
}

@OptIn(ExperimentalDecomposeApi::class)
@Composable
private fun ListPane(stack: Value<ChildStack<*, HomeComponent.ListFeatureStack>>, modifier: Modifier, onItemClick: (String) -> Unit) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        val isVisible by remember(it.instance) { derivedStateOf { it.instance is HomeComponent.ListFeatureStack.List } }

        AnimatedVisibility(isVisible) {
            ListScreen(listComponent = (it.instance as HomeComponent.ListFeatureStack.List).component, onItemClick = onItemClick)
        }
    }
}

@OptIn(ExperimentalDecomposeApi::class)
@Composable
private fun DetailsPane(stack: Value<ChildStack<*, HomeComponent.DetailFeatureStack>>, modifier: Modifier, isSplitScreen: Boolean = false) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is HomeComponent.DetailFeatureStack.Details -> DetailScreen(detailComponent = child.component, isSplitScreen = isSplitScreen)
            HomeComponent.DetailFeatureStack.Hidden -> Box {}
        }
    }
}

private object HomeScreenDefaults {

    @Stable
    val MultiPaneWidthThreshold = 800.dp
    const val FullScreenWeight = 1F
    const val ListPaneWeight = 0.3F
    const val DetailsPaneWeight = 0.7F
}
