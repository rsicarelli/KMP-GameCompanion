package app.dreamlightpal.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
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
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.compose.navigationBarPadding
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
fun HomeScreen(componentContext: ComponentContext, di: DI) = withDI(di) {
    val listComponentFactory by rememberInstance<ListComponentFactory>()
    val detailComponentFactory by rememberInstance<DetailComponentFactory>()

    val homeComponent = remember(componentContext, listComponentFactory, detailComponentFactory) {
        HomeComponentHolder(componentContext, listComponentFactory, detailComponentFactory)
    }

    BoxWithConstraints(modifier = Modifier.navigationBarPadding()) {
        val isMultiPaneRequired by remember { derivedStateOf { maxWidth >= MultiPaneWidthThreshold } }
        var selectedItem by remember { mutableStateOf(0) }
        val items = listOf("Home", "Search", "Settings")
        val icons = listOf(Icons.Rounded.Home, Icons.Rounded.Search, Icons.Rounded.Settings)

        Surface(
            color = NavigationBarDefaults.containerColor,
            contentColor = MaterialTheme.colorScheme.contentColorFor(NavigationBarDefaults.containerColor),
            tonalElevation = NavigationBarDefaults.Elevation,
        ) {
            if (isMultiPaneRequired) {
                Row {
                    Column(
                        Modifier
                            .fillMaxHeight()
                            .widthIn(min = 80.dp)
                            .padding(vertical = 4.dp)
                            .selectableGroup(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        items.forEachIndexed { index, item ->
                            NavigationRailItem(
                                icon = { Icon(icons[index], contentDescription = item) },
                                label = { Text(item) },
                                selected = selectedItem == index,
                                onClick = { selectedItem = index }
                            )
                        }
                    }
                    ListPane(
                        stack = homeComponent.listStack,
                        modifier = Modifier.weight(FullScreenWeight),
                    )

                }
            } else {
                Column {
                    ListPane(
                        stack = homeComponent.listStack,
                        modifier = Modifier.weight(FullScreenWeight),
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
        }

        DisposableEffect(isMultiPaneRequired) {
            homeComponent.setMultiPane(isMultiPaneRequired)
            onDispose {}
        }
    }
}

@OptIn(ExperimentalDecomposeApi::class)
@Composable
private fun ListPane(stack: Value<ChildStack<*, HomeComponent.ListFeatureStack>>, modifier: Modifier) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is HomeComponent.ListFeatureStack.List -> ListScreen(listComponent = child.component)
        }
    }
}

@OptIn(ExperimentalDecomposeApi::class)
@Composable
private fun DetailsPane(stack: Value<ChildStack<*, HomeComponent.DetailFeatureStack>>, modifier: Modifier) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is HomeComponent.DetailFeatureStack.Details -> DetailScreen(child.component)
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
