package app.dreamlightpal.list

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.list.ListComponent.ListState
import app.dreamlightpal.ui.theme.DreamlightPalTheme

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listComponent: ListComponent,
) {
    val listState: ListState by listComponent.state.collectAsState()

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(listState.collectionItems, ListState.CollectionListItem::itemId) { listItem ->
            Text(
                text = listItem.localizedNameKey,
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = true,
                        onClick = {

                        }
                    )
                    .padding(16.dp)
            )

            Divider()
        }
    }
}

@Preview
@Composable
private fun ListScreenPreview() {
    DreamlightPalTheme {

    }
}
