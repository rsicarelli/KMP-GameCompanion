package app.dreamlightpal.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.compose.rememberAsyncImagePainter
import app.dreamlightpal.list.ListComponent.ListState
import app.dreamlightpal.list.ListScreenDefaults.GridArrangement
import app.dreamlightpal.list.ListScreenDefaults.GridColumns
import app.dreamlightpal.list.ListScreenDefaults.GridPaddingValues
import app.dreamlightpal.list.ListScreenDefaults.ListItemAspectRatio
import app.dreamlightpal.list.ListScreenDefaults.ListItemElevation
import app.dreamlightpal.list.ListScreenDefaults.ListItemHorizontalPadding
import app.dreamlightpal.list.ListScreenDefaults.ListItemImageSize
import app.dreamlightpal.list.ListScreenDefaults.ListItemTopPadding

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listComponent: ListComponent,
) {
    val listState: ListState by listComponent.state.collectAsState()

    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridColumns,
        verticalArrangement = GridArrangement,
        horizontalArrangement = GridArrangement,
        contentPadding = GridPaddingValues,
    ) {
        items(
            items = listState.collectionItems,
            key = ListState.CollectionListItem::itemId
        ) { listItem ->
            ListItem(collectionListItem = listItem)
        }
    }
}

@Composable
private fun ListItem(
    modifier: Modifier = Modifier,
    collectionListItem: ListState.CollectionListItem,
) {
    Card(
        modifier = modifier.fillMaxWidth().aspectRatio(ListItemAspectRatio),
        shape = MaterialTheme.shapes.large,
        elevation = ListItemElevation
    ) {

        Image(
            modifier = Modifier
                .size(ListItemImageSize)
                .align(Alignment.CenterHorizontally)
                .padding(top = ListItemTopPadding),
            painter = rememberAsyncImagePainter(collectionListItem.imageUrl),
            contentDescription = null
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = ListItemTopPadding)
                .then(Modifier.padding(horizontal = ListItemHorizontalPadding)),

            text = collectionListItem.localizedNameKey
        )

    }
}

private object ListScreenDefaults {

    const val ListItemAspectRatio = 0.78F

    @Stable
    val GridArrangement = Arrangement.spacedBy(16.dp)

    @Stable
    val GridPaddingValues = PaddingValues(16.dp)

    @Stable
    val GridColumns = GridCells.Adaptive(130.dp)

    @Stable
    val ListItemElevation = CardDefaults.cardElevation(defaultElevation = 3.dp)

    @Stable
    val ListItemImageSize = 72.dp

    @Stable
    val ListItemTopPadding = 8.dp

    @Stable
    val ListItemHorizontalPadding = 8.dp
}
