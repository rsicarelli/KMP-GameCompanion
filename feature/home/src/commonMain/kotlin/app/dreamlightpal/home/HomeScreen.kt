package app.dreamlightpal.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.detail.DetailScreen
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.list.ListScreen
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import org.kodein.di.DI
import org.kodein.di.compose.rememberInstance
import org.kodein.di.compose.withDI

private val MULTI_PANE_WIDTH_THRESHOLD = 800.dp
private const val LIST_PANE_WEIGHT = 0.4F
private const val DETAILS_PANE_WEIGHT = 0.6F

@Composable
fun HomeScreen(componentContext: ComponentContext, di: DI) = withDI(di) {
    val listComponentFactory by rememberInstance<ListComponentFactory>()
    val detailComponentFactory by rememberInstance<DetailComponentFactory>()

    val homeComponent = remember(componentContext, listComponentFactory, detailComponentFactory) {
        HomeComponentHolder(componentContext, listComponentFactory, detailComponentFactory)
    }

    BoxWithConstraints(modifier = Modifier) {
        val model by homeComponent.models.subscribeAsState()
        val isMultiPane = model.isMultiPane

        Row(modifier = Modifier.fillMaxSize()) {
            ListPane(
                stack = homeComponent.listStack,
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
                stack = homeComponent.detailStack,
                modifier = Modifier.weight(if (isMultiPane) DETAILS_PANE_WEIGHT else 1F),
            )
        }

        val isMultiPaneRequired = this@BoxWithConstraints.maxWidth >= MULTI_PANE_WIDTH_THRESHOLD

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
