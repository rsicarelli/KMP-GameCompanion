package app.dreamlightpal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import app.dreamlightpal.compose.DreamlightPalScaffold
import app.dreamlightpal.root.DefaultHomeComponent
import app.dreamlightpal.root.DefaultRootComponent
import app.dreamlightpal.root.HomeContent
import app.dreamlightpal.root.RootContent
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
                    content = { HomeContent(it) }
                )
            }
        }
    }
}
