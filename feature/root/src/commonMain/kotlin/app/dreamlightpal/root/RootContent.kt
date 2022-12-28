package app.dreamlightpal.root

import androidx.compose.foundation.layout.fillMaxSize
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
    content: @Composable (HomeComponent) -> Unit,
) {
    val childStack by component.childStack.subscribeAsState()

    Children(
        stack = childStack,
        modifier = Modifier.fillMaxSize(),
    ) {
        when (val child = it.instance) {
            is RootComponent.Child.Home -> content(child.component)
        }
    }
}
