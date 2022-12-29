package app.dreamlightpal.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import coil.compose.rememberAsyncImagePainter

@Composable
actual fun rememberAsyncImagePainter(url: String): Painter = rememberAsyncImagePainter(url)
