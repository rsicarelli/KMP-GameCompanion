package app.dreamlightpal.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.navigation.CollectionItemDetailsComponent
import app.dreamlightpal.navigation.CollectionItemListComponent
import app.dreamlightpal.navigation.HomeComponent
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

private val MULTI_PANE_WIDTH_THRESHOLD = 800.dp
private const val LIST_PANE_WEIGHT = 0.4F
private const val DETAILS_PANE_WEIGHT = 0.6F

@Composable
fun HomeContent(homeComponent: HomeComponent) {
    BoxWithConstraints(modifier = Modifier) {
        val model by homeComponent.models.subscribeAsState()

        val isMultiPane = model.isMultiPane

        Row(modifier = Modifier.fillMaxSize()) {
            ListPane(
                stack = homeComponent.listChildStack,
                modifier = Modifier.weight(if (isMultiPane) LIST_PANE_WEIGHT else 1F),
            )

            if (isMultiPane) {
                Box(modifier = Modifier.weight(DETAILS_PANE_WEIGHT))
            }
        }

        Row(modifier = Modifier.fillMaxSize()) {
            if (isMultiPane) {
                Box(modifier = Modifier.weight(LIST_PANE_WEIGHT))
            }

            DetailsPane(
                stack = homeComponent.detailsChildStack,
                modifier = Modifier.weight(if (isMultiPane) DETAILS_PANE_WEIGHT else 1F),
            )
        }

        val isMultiPaneRequired = this@BoxWithConstraints.maxWidth >= MULTI_PANE_WIDTH_THRESHOLD

        DisposableEffect(isMultiPaneRequired) {
            homeComponent.setMultiPane(isMultiPaneRequired)
            onDispose {

            }
        }
    }
}

@OptIn(ExperimentalDecomposeApi::class) @Composable private fun ListPane(
    stack: Value<ChildStack<*, HomeComponent.ListChild>>,
    modifier: Modifier,
) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is HomeComponent.ListChild.List -> ArticleListContent(component = child.component, modifier = Modifier.fillMaxSize())
            is HomeComponent.ListChild.None -> Box {}
        }.let {}
    }
}

@OptIn(ExperimentalDecomposeApi::class) @Composable private fun DetailsPane(
    stack: Value<ChildStack<*, HomeComponent.DetailsChild>>,
    modifier: Modifier,
) {
    Children(
        stack = stack,
        modifier = modifier,
        animation = stackAnimation(fade()),
    ) {
        when (val child = it.instance) {
            is HomeComponent.DetailsChild.None -> Box {}
            is HomeComponent.DetailsChild.Details -> ArticleDetailsContent(component = child.component, modifier = Modifier.fillMaxSize())
        }.let {}
    }
}

@Composable internal fun ArticleDetailsContent(component: CollectionItemDetailsComponent, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()

    Column(modifier = modifier) {

        Text(
            text = "isMemes: ${model.isMemes}", modifier = Modifier.fillMaxHeight().verticalScroll(rememberScrollState()).padding(16.dp)
        )
    }
}

@Composable internal fun ArticleListContent(component: CollectionItemListComponent, modifier: Modifier = Modifier) {
    val model: CollectionItemListComponent.Model by component.models.subscribeAsState()

    val _model = remember {
        listOf(model.isMemes, model.isMemes, model.isMemes, model.isMemes, model.isMemes, model.isMemes)
    }

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(_model.count()) { article ->
            val isSelected = _model.random()

            Text(
                text = "is memes: $isSelected",
                modifier = Modifier.fillMaxWidth()
                    .selectable(
                        selected = isSelected,
                        onClick = { //                            component.onItemDetailClick(id = article.id)
                        })
                    .padding(16.dp)
            )

            Divider()
        }
    }
}

