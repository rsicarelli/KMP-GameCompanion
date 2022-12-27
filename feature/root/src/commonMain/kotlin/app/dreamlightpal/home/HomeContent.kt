package app.dreamlightpal.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import app.dreamlightpal.navigation.HomeComponent
import app.dreamlightpal.navigation.RootComponent
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState

@OptIn(ExperimentalDecomposeApi::class)
@Composable
fun RootContent(
    component: RootComponent,
    modifier: Modifier = Modifier,
    homeContent: @Composable (HomeComponent) -> Unit,
) {
    val childStack by component.childStack.subscribeAsState()

    Column(modifier = modifier) {
        Children(
            stack = childStack,
            modifier = Modifier.weight(weight = 1F),
        ) {
            when (val child = it.instance) {
                is RootComponent.Child.Home -> homeContent(child.component)
            }
        }
    }
}
