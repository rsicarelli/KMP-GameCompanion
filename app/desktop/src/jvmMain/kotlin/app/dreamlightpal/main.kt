package app.dreamlightpal

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import app.dreamlightpal.compose.DreamlightPalScaffold

fun main() = singleWindowApplication(
    title = "Dreamlight Pal",
    state = WindowState(width = 1280.dp, height = 768.dp),
) {
    DreamlightPalScaffold()
}
