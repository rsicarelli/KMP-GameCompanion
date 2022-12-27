package app.dreamlightpal.compose

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import app.dreamlightpal.ui.theme.DreamlightPalTheme

@Composable
fun DreamlightPalScaffold(content: @Composable () -> Unit) {
    DreamlightPalTheme {
        Surface(content = content)
    }
}
