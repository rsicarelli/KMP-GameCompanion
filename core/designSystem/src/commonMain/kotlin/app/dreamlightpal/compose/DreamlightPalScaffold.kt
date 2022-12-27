package app.dreamlightpal.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.dreamlightpal.ui.theme.DreamlightPalTheme

@Composable
fun DreamlightPalScaffold() {
    DreamlightPalTheme {
        Surface {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Hi Pal!",
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    }
}
