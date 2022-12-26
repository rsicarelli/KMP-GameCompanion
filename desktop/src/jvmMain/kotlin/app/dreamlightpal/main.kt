package app.dreamlightpal

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import app.dreamlightpal.presentation.DreamlightPalScaffold

fun main() = singleWindowApplication(
    title = "Code Viewer",
    state = WindowState(width = 1280.dp, height = 768.dp),
) {
    DreamlightPalScaffold()
}