package app.dreamlightpal.list

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dreamlightpal.compose.rememberAsyncImagePainter
import app.dreamlightpal.list.ListComponent.ListState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listComponent: ListComponent,
) {
    val listState: ListState by listComponent.state.collectAsState()

    val quickPicksLazyGridState = rememberLazyGridState()

    val arrangement = Arrangement.spacedBy(16.dp)

    LazyVerticalGrid(
        state = quickPicksLazyGridState,
        columns = GridCells.Adaptive(130.dp),
        verticalArrangement = arrangement,
        horizontalArrangement = arrangement,
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier.fillMaxSize()

    ) {
        items(listState.collectionItems, ListState.CollectionListItem::itemId) { listItem ->
            ListItem(collectionListItem = listItem)
        }
    }
}

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    collectionListItem: ListState.CollectionListItem,
) {
    Card(
        modifier = modifier.fillMaxWidth().aspectRatio(0.78F),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(defaultElevation = 16.dp)
    ) {

        Image(
            modifier = Modifier.size(72.dp).align(Alignment.CenterHorizontally).padding(top = 8.dp),
            painter = rememberAsyncImagePainter(collectionListItem.imageUrl),
            contentDescription = ""
        )

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 8.dp).then(Modifier.padding(horizontal = 8.dp)),
            text = collectionListItem.localizedNameKey
        )

    }
}

