package app.dreamlightpal.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    detailComponent: DetailComponent,
    isSplitScreen: Boolean,
) {
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer).apply {
        if (isSplitScreen) then(fillMaxWidth()) else then(width(500.dp))
    }.fillMaxHeight())
}
