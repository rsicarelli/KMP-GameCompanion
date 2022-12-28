package app.dreamlightpal.root

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import app.dreamlightpal.navigation.HomeComponent
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState

@Composable
fun HomeContent(homeComponent: HomeComponent) {
    BoxWithConstraints(modifier = Modifier) {
        val model by homeComponent.models.subscribeAsState()

        Text(model.isMultiPane.toString())
    }
}
