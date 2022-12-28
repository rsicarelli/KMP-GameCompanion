package app.dreamlightpal

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import app.dreamlightpal.compose.DreamlightPalScaffold
import app.dreamlightpal.root.DefaultHomeComponent
import app.dreamlightpal.root.DefaultRootComponent
import app.dreamlightpal.root.HomeContent
import app.dreamlightpal.root.RootContent
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry

fun main() = singleWindowApplication(
    title = "Dreamlight Pal",
    state = WindowState(width = 1280.dp, height = 768.dp),
) {

    val lifecycle = LifecycleRegistry()

    val root = DefaultRootComponent(
        componentContext = DefaultComponentContext(lifecycle = lifecycle),
        homeFactory = ::DefaultHomeComponent
    )

    DreamlightPalScaffold {
        RootContent(
            component = root,
            modifier = Modifier.fillMaxSize(),
            content = { HomeContent(it) }
        )
    }
}
