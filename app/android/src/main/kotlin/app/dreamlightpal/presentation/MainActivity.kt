package app.dreamlightpal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.dreamlightpal.compose.DreamlightPalScaffold

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DreamlightPalScaffold()
        }
    }
}
