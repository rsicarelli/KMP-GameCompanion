package app.dreamlightpal

import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import app.dreamlightpal.collection.CollectionModule
import app.dreamlightpal.detail.DetailModule
import app.dreamlightpal.home.HomeScreen
import app.dreamlightpal.list.ListModule
import app.dreamlightpal.threading.ThreadingModule
import app.dreamlightpal.ui.theme.DreamlightPalTheme
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import org.kodein.di.DI

fun main() = singleWindowApplication(
    title = "Dreamlight Pal",
    state = WindowState(width = 1280.dp, height = 768.dp),
) {

    val di = remember { DI { importAll(CollectionModule, ThreadingModule, DetailModule, ListModule) } }
    val lifecycle = remember { LifecycleRegistry() }
    val componentContext = remember(lifecycle) { DefaultComponentContext(lifecycle) }

    DreamlightPalTheme {
        HomeScreen(componentContext, di)
    }
}
