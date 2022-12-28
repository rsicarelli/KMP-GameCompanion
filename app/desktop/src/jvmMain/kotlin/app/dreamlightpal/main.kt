package app.dreamlightpal

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import app.dreamlightpal.collection.CollectionModule
import app.dreamlightpal.compose.DreamlightPalScaffold
import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.detail.DetailModule
import app.dreamlightpal.home.DefaultHomeComponent
import app.dreamlightpal.home.HomeContent
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.list.ListModule
import app.dreamlightpal.threading.ThreadingModule
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import org.kodein.di.DI
import org.kodein.di.compose.withDI
import org.kodein.di.instance

val di = DI {
    importAll(CollectionModule, ThreadingModule, DetailModule, ListModule)
}

fun main() = singleWindowApplication(
    title = "Dreamlight Pal",
    state = WindowState(width = 1280.dp, height = 768.dp),
) {

    val lifecycle = LifecycleRegistry()
    App(lifecycle)
}

@Composable
fun App(lifecycleRegistry: LifecycleRegistry) = withDI(di) {
    val listComponentFactory by di.instance<ListComponentFactory>()
    val detailComponentFactory by di.instance<DetailComponentFactory>()

    val homeComponent = DefaultHomeComponent(
        componentContext = DefaultComponentContext(lifecycle = lifecycleRegistry),
        listComponentFactory = listComponentFactory,
        detailComponentFactory = detailComponentFactory
    )

    DreamlightPalScaffold {
        HomeContent(homeComponent)
    }
}
