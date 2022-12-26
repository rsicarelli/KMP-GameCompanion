package app.dreamlightpal.presentation

import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DreamlightPalScaffold() {
    DisableSelection {
        MaterialTheme {
            Surface {
                Text("Hi!")
            }
        }
    }
}
