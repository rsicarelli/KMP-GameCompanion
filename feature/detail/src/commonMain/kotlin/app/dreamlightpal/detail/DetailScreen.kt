package app.dreamlightpal.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rsicarelli.kmplatform.copan.compose.rememberAsyncImagePainter
import com.rsicarelli.kmplatform.copan.compose.rememberCopanResourcePainter
import com.rsicarelli.kmplatform.copan.compose.resource.SpikeBackground

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    detailComponent: DetailComponent,
    isSplitScreen: Boolean,
) {

    val gradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.primaryContainer,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.background
        ),
    )

    val widthFraction by remember { derivedStateOf { if (isSplitScreen) 0.35F else 1F } }
    val cardPadding by remember { derivedStateOf { if (isSplitScreen) 16.dp else 0.dp } }

    Card(
        modifier = modifier.padding(cardPadding)
            .fillMaxWidth(widthFraction)
            .fillMaxHeight(),
        shape = RoundedCornerShape(28.dp),
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize().background(gradient))

            Image(
                modifier = Modifier.fillMaxWidth().padding(top = 24.dp),
                painter = rememberCopanResourcePainter(SpikeBackground),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.background),
                contentDescription = null,
            )

            Column(
                modifier = Modifier.fillMaxWidth()
                    .wrapContentSize(Alignment.TopCenter).then(Modifier.padding(top = 24.dp))
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = rememberAsyncImagePainter("https://dreamlightvalleywiki.com/images/9/92/Golden_Sunbird.png"),
                    contentDescription = null,
                )

                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 24.dp),
                    textAlign = TextAlign.Center, // make text center horizontal
                    text = "Golden Sunbird",
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }

    }
    V1(modifier, isSplitScreen)
}

@Composable
private fun V1(modifier: Modifier, isSplitScreen: Boolean) {
    Column(modifier = modifier.background(MaterialTheme.colorScheme.primaryContainer).apply {
        if (isSplitScreen) then(fillMaxWidth()) else then(wrapContentWidth())
    }.fillMaxHeight()) {
        Column(
            modifier = Modifier.fillMaxWidth(fraction = 0.3F).fillMaxHeight()
        ) {
            Image(
                painter = rememberAsyncImagePainter(SpikeBackground.desktopRes!!),
                contentDescription = null,
            )
            Box(modifier = Modifier.background(Color(0xff20256E)).padding(16.dp)) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Beautiful cake",
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }
    }
}
