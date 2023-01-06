package app.dreamlightpal.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
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
import androidx.compose.material.icons.rounded.FilterList
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listComponent: ListComponent,
    onItemClick: (String) -> Unit,
) {
    val listState: ListState by listComponent.state.collectAsState()

    Box(
        modifier = modifier.fillMaxSize().statusBarPadding(),
    ) {
        LazyCollectionList(
            modifier = Modifier.fillMaxSize(),
            itemList = listState.collectionItems,
            onItemClick = onItemClick
        )

        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
            shape = FloatingActionButtonDefaults.largeShape,
            onClick = {},
            content = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Rounded.FilterList,
                    contentDescription = "Filter"
                )

            }
        )
    }
}

@Composable
private fun LazyCollectionList(
    modifier: Modifier = Modifier,
    itemList: List<ListState.Item>,
    onItemClick: (String) -> Unit,
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
            key = ListState.Item::hashCode
        ) { listItem ->
            BoxWithConstraints {
                ListItem(
                    modifier = Modifier.clickable { onItemClick(listItem.name) },
                    item = listItem
                )
            }
        }
    }
}

@Composable
private fun ListItem(
    modifier: Modifier = Modifier,
    item: ListState.Item,
) {

    val interactionSource = remember { MutableInteractionSource() }
    val active by interactionSource.collectIsHoveredAsState()

    ElevatedCard(
        modifier = modifier.fillMaxWidth().aspectRatio(1F).padding(8.dp).hoverable(interactionSource).indication(interactionSource, LocalIndication.current),
        shape = RoundedCornerShape(28.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        elevation = if (active) CardDefaults.cardElevation(
            defaultElevation = 16.dp,
        ) else {
            CardDefaults.cardElevation(
                defaultElevation = 3.dp,
            )
        }

    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp).then(Modifier.padding(top = 24.dp, bottom = 8.dp)),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxWidth()
                    .weight(0.72F),
                painter = rememberAsyncImagePainter(item.imageUrl),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
            )

            Text(
                modifier = Modifier.padding(horizontal = ListScreenTokens.ListItemHorizontalPadding)
                    .weight(0.27F)
                    .align(Alignment.CenterHorizontally),
                text = item.name,
                maxLines = 1,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

private object ListScreenTokens {

    const val ListItemAspectRatio = 0.78F
    @Stable val GridArrangement = Arrangement.spacedBy(16.dp)
    @Stable val GridPaddingValues = PaddingValues(16.dp)
    @Stable val GridColumns = GridCells.Adaptive(180.dp)
    @Stable val ListItemElevation = 3.dp
    @Stable val ListItemTopPadding = 16.dp
    @Stable val ListItemHorizontalPadding = 8.dp
}
