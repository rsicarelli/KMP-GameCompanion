package app.dreamlightpal.list

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import app.dreamlightpal.collection.domain.CollectionItem
import app.dreamlightpal.list.ListComponent.ListState
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Stable
interface ListComponent {

    val state: StateFlow<ListState>

    @Immutable
    data class ListState(
        val collectionItems: List<CollectionListItem>,
    ) {

        @Immutable
        data class CollectionListItem(
            val itemId: String,
            val localizedNameKey: String,
            val localizedDescriptionKey: String,
            val imageUrl: String,
            val types: List<CollectionItem.Type>,
            val starCount: Int,
            val energyValue: Int,
            val buyPrice: Int,
            val sellPrice: Int,
        )
    }
}

internal class ListComponentHolder(
    componentContext: ComponentContext,
    onItemSelected: OnItemSelected,
) : ListComponent, ComponentContext by componentContext {

    private val _state = MutableStateFlow(ListState(collectionItems = Fake_Collections))
    override val state: StateFlow<ListState> = _state.asStateFlow()
}

val Fake_Collections = listOf(
    ListState.CollectionListItem(
        itemId = "clay",
        localizedNameKey = "Clay",
        localizedDescriptionKey = "Clay is a foraged material which can be found by digging the ground in the Glade of Trust, Sunlit Plateau, and Forgotten Lands.\nIt also has a chance to be found for sale at Kristoff's Stall.",
        imageUrl = "https://dreamlightvalleywiki.com/images/a/a2/Clay.png",
        types = listOf(CollectionItem.Type.FORAGING),
        starCount = 0,
        energyValue = 0,
        buyPrice = 0,
        sellPrice = 20
    ),
    ListState.CollectionListItem(
        itemId = "brick",
        localizedNameKey = "Brick",
        localizedDescriptionKey = "Brick is a refined material which can be crafted using a crafting station. It also has a chance to be found for sale at Kristoff's Stall.",
        imageUrl = "https://dreamlightvalleywiki.com/images/5/58/Brick.png",
        types = listOf(CollectionItem.Type.CRAFTING),
        starCount = 0,
        energyValue = 0,
        buyPrice = 130,
        sellPrice = 130
    ),
    ListState.CollectionListItem(
        itemId = "Jubilant-Topiary",
        localizedNameKey = "Jubilant Topiary",
        localizedDescriptionKey = "Jubilant Topiary is a piece of craftable furniture.\n" +
            "\n" +
            "Because it's possible to craft it using a crafting station it's tracked in the Crafted collection tab instead of the Furniture tab. It can be registered to the Collection either by crafting it or picking it up.",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/25/Jubilant_Topiary.png",
        types = listOf(CollectionItem.Type.CRAFTING),
        starCount = 0,
        energyValue = 0,
        buyPrice = 0,
        sellPrice = 0
    ),
    ListState.CollectionListItem(
        itemId = "Gold Ingot",
        localizedNameKey = "Gold Ingot",
        localizedDescriptionKey = "Gold Ingot is a refined material which can be crafted using a crafting station.\n" +
            "It also has a chance to be found for sale at Kristoff's Stall.\n",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/22/Gold_Ingot.png",
        types = listOf(CollectionItem.Type.CRAFTING),
        starCount = 0,
        energyValue = 0,
        buyPrice = 0,
        sellPrice = 130
    ),
    ListState.CollectionListItem(
        itemId = "Golden Brick Road",
        localizedNameKey = "Golden Brick Road",
        localizedDescriptionKey = "Golden Brick Road is a paving type which can be crafted using a crafting station.\n" +
            "It can be placed on the ground to create pathing and decoration.\n",
        imageUrl = "https://dreamlightvalleywiki.com/images/2/21/Golden_Brick_Road.png",
        types = listOf(CollectionItem.Type.CRAFTING),
        starCount = 0,
        energyValue = 0,
        buyPrice = 0,
        sellPrice = 130
    )
)
