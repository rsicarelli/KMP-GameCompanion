package app.dreamlightpal.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FilterAlt
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import app.dreamlightpal.compose.rememberAsyncImagePainter
import app.dreamlightpal.compose.statusBarPadding
import app.dreamlightpal.list.ListComponent.ListState
import app.dreamlightpal.list.ListScreenTokens.GridArrangement
import app.dreamlightpal.list.ListScreenTokens.GridColumns
import app.dreamlightpal.list.ListScreenTokens.GridPaddingValues
import app.dreamlightpal.list.ListScreenTokens.ListItemElevation

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listComponent: ListComponent,
) {
    val listState: ListState by listComponent.state.collectAsState()

    Box(
        modifier = modifier.fillMaxSize().statusBarPadding(),
    ) {
        LazyCollectionList(
            modifier = Modifier.fillMaxSize(),
            itemList = listState.collectionItems
        )

        ExtendedFloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
            onClick = {},
            content = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Rounded.FilterAlt,
                    contentDescription = "Filter"
                )

                Text(
                    modifier = Modifier.padding(horizontal = 8.dp),
                    text = "Filter",
                    style = MaterialTheme.typography.labelLarge
                )
            }
        )
    }
}

@Composable
private fun LazyCollectionList(
    modifier: Modifier = Modifier,
    itemList: List<ListState.CollectionListItem>,
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridColumns,
        verticalArrangement = GridArrangement,
        horizontalArrangement = GridArrangement,
        contentPadding = GridPaddingValues,
    ) {
        items(
            items = itemList,
            key = ListState.CollectionListItem::localizedNameKey
        ) { listItem ->
            BoxWithConstraints {
                ListItem(collectionListItem = listItem)
            }
        }
    }
}

@Composable
private fun ListItem(
    modifier: Modifier = Modifier,
    collectionListItem: ListState.CollectionListItem,
) = Card(
    modifier = modifier.fillMaxWidth().aspectRatio(1F),
    shape = RoundedCornerShape(28.dp),
    elevation = CardDefaults.cardElevation(defaultElevation = ListItemElevation)
) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxWidth()
                .weight(0.75F),
            painter = rememberAsyncImagePainter(collectionListItem.imageUrl),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
        )

        Text(
            modifier = Modifier.padding(horizontal = ListScreenTokens.ListItemHorizontalPadding)
                .weight(0.24F)
                .align(Alignment.CenterHorizontally),
            text = collectionListItem.localizedNameKey,
            maxLines = 1,
            style = MaterialTheme.typography.titleLarge,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

private object ListScreenTokens {

    const val ListItemAspectRatio = 0.78F
    @Stable val GridArrangement = Arrangement.spacedBy(16.dp)
    @Stable val GridPaddingValues = PaddingValues(16.dp)
    @Stable val GridColumns = GridCells.Adaptive(150.dp)
    @Stable val ListItemElevation = 3.dp
    @Stable val ListItemTopPadding = 16.dp
    @Stable val ListItemHorizontalPadding = 8.dp
}
