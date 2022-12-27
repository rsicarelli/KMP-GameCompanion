package app.dreamlightpal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import app.dreamlightpal.compose.DreamlightPalScaffold
import app.dreamlightpal.home.DefaultHomeComponent
import app.dreamlightpal.home.DefaultRootComponent
import app.dreamlightpal.home.HomeContent
import app.dreamlightpal.home.RootContent
import com.arkivanov.decompose.defaultComponentContext

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = DefaultRootComponent(
            componentContext = defaultComponentContext(),
            homeFactory = ::DefaultHomeComponent
        )

        setContent {
            DreamlightPalScaffold {
                RootContent(
                    component = root,
                    modifier = Modifier.fillMaxSize(),
                    homeContent = ::HomeContent
                )
            }
        }
    }
}
