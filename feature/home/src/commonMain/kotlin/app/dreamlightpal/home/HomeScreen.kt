package app.dreamlightpal.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.detail.DetailScreen
import app.dreamlightpal.home.HomeScreenDefaults.FullScreenWeight
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

    Row(modifier = Modifier.fillMaxSize()) {
        ListPane(
            stack = homeComponent.listStack,
            modifier = Modifier.weight(FullScreenWeight),
        )
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
