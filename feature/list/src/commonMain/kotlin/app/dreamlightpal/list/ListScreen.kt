package app.dreamlightpal.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActionScope
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import app.dreamlightpal.compose.rememberAsyncImagePainter
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

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Hi, Pal!",
            style = MaterialTheme.typography.displayLarge
        )

        SearchBar(
            modifier = Modifier.padding(8.dp),
            hint = "Search...",
            contentDescription = "",
            onTextChanged = {

            },
            onDone = {
            }
        )

        LazyCollectionList(
            itemList = listState.collectionItems
        )
    }

}

@Composable
private fun LazyCollectionList(
    modifier: Modifier = Modifier,
    itemList: List<ListState.CollectionListItem>,
) {
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridColumns,
        verticalArrangement = GridArrangement,
        horizontalArrangement = GridArrangement,
        contentPadding = GridPaddingValues,
    ) {
        items(
            items = itemList,
            key = ListState.CollectionListItem::itemId
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
    shape = MaterialTheme.shapes.large,
    elevation = CardDefaults.cardElevation(defaultElevation = ListItemElevation)
) {
    Column {
        Image(
            modifier = Modifier.fillMaxWidth()
                .heightIn(min = 88.dp)
                .weight(0.68F)
                .padding(horizontal = 24.dp)
                .then(Modifier.padding(top = 24.dp)),
            painter = rememberAsyncImagePainter(collectionListItem.imageUrl),
            contentDescription = null
        )

        Text(
            modifier = Modifier.padding(horizontal = ListScreenTokens.ListItemHorizontalPadding).weight(0.32F).padding(16.dp).align(Alignment.CenterHorizontally),
            text = collectionListItem.localizedNameKey,
            maxLines = 1,
            style = MaterialTheme.typography.titleLarge,
            overflow = TextOverflow.Ellipsis,
        )
    }

    //
    //    Column(
    //        modifier = Modifier.fillMaxSize().padding(top = 16.dp),
    //        verticalArrangement = Arrangement.spacedBy(16.dp),
    //        horizontalAlignment = Alignment.CenterHorizontally
    //    ) {
    //
    //    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    hint: String,
    contentDescription: String,
    saver: Saver<MutableState<TextFieldValue>, String> = Saver(
        save = { it.value.text },
        restore = { mutableStateOf(TextFieldValue(it)) }
    ),
    onTextChanged: (input: String) -> Unit,
    onDone: (KeyboardActionScope.() -> Unit),
) {
    val textState = rememberSaveable(saver = saver) { mutableStateOf(TextFieldValue()) }

    BasicTextField(
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12F),
                shape = CircleShape,
            )
            .padding(12.dp)
            .fillMaxWidth(),
        value = textState.value,
        onValueChange = {
            textState.value = it
            onTextChanged(it.text)
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            autoCorrect = false,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(onDone = onDone),
        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
        textStyle = MaterialTheme.typography.bodyLarge,
        decorationBox = { innerTextField ->
            SearchDecorationBox(
                contentDescription = contentDescription,
                textState = textState.value,
                hint = hint,
                innerTextField = innerTextField
            )
        }
    )
}

@Composable
private fun SearchDecorationBox(
    contentDescription: String,
    textState: TextFieldValue,
    hint: String,
    innerTextField: @Composable () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = contentDescription,
            tint = Color(0xFF3D4B6F)
        )

        if (textState.text.isEmpty()) {
            Box(Modifier.weight(1f)) {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(0xFF3D4B6F)
                )
                innerTextField()
            }
        } else {
            innerTextField()
        }
    }
}

private object ListScreenTokens {

    const val ListItemAspectRatio = 0.78F
    @Stable val GridArrangement = Arrangement.spacedBy(16.dp)
    @Stable val GridPaddingValues = PaddingValues(16.dp)
    @Stable val GridColumns = GridCells.Adaptive(180.dp)
    @Stable val ListItemElevation = 3.dp
    @Stable val ListItemImageSize = 88.dp
    @Stable val ListItemTopPadding = 16.dp
    @Stable val ListItemHorizontalPadding = 8.dp
}
