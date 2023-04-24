package app.dreamlightpal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.core.view.WindowCompat
import app.dreamlightpal.collection.CollectionModule
import app.dreamlightpal.detail.DetailModule
import app.dreamlightpal.home.HomeScreen
import app.dreamlightpal.list.ListModule
import app.dreamlightpal.ui.theme.DreamlightPalTheme
import com.arkivanov.decompose.defaultComponentContext
import com.rsicarelli.kmplatform.threading.ThreadingModule
import org.kodein.di.DI
import org.kodein.di.DIAware

class MainActivity : ComponentActivity(), DIAware {

    override val di: DI = DI {
        importAll(CollectionModule, ThreadingModule, DetailModule, ListModule)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val componentContext = remember { defaultComponentContext() }

            DreamlightPalTheme {
                HomeScreen(
                    componentContext = componentContext,
                    di = di,
                    onToggleTheme = {},
                )
            }
        }
    }
}
