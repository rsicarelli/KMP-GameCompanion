package app.dreamlightpal.collection.data

import app.dreamlightpal.collection.domain.CollectionItem
import app.dreamlightpal.collection.domain.CollectionItem.Type.CRAFTING
import app.dreamlightpal.collection.domain.CollectionItem.Type.FORAGING
import app.dreamlightpal.collection.domain.CollectionRepository
import app.dreamlightpal.threading.ContextProvider
import co.touchlab.kermit.Logger
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.getAndUpdate
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.withContext

internal class CollectionRepositoryImpl(
    contextProvider: ContextProvider,
) : CollectionRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> Logger.e("Got new exception on CollectionRepositoryImpl", e) }
    )

    private val _collection: MutableStateFlow<List<CollectionItem>?> = MutableStateFlow(Fakes.Fake_Collections)
    override val collection: SharedFlow<List<CollectionItem>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int?
        get() = TODO("Not yet implemented")

    override suspend fun findById(collectionItemId: String): CollectionItem? =
        withContext(scope.coroutineContext) {
            _collection.value?.firstOrNull { (itemId) -> itemId == collectionItemId }
        }

    override suspend fun addAll(collectionItems: List<CollectionItem>) {
        withContext(scope.coroutineContext) {
            _collection.getAndUpdate { current ->
                val mutableList = current?.toMutableList() ?: mutableListOf()
                mutableList.addAll(collectionItems)
                mutableList
            }
        }
    }
}

private object Fakes {

    val Fake_Collections = listOf(
        CollectionItem(
            itemId = "clay",
            parentGroupId = "",
            parentGroupIndex = "",
            localizedNameKey = "Clay",
            localizedDescriptionKey = "Clay is a foraged material which can be found by digging the ground in the Glade of Trust, Sunlit Plateau, and Forgotten Lands.\nIt also has a chance to be found for sale at Kristoff's Stall.",
            imageUrl = "https://dreamlightvalleywiki.com/File:Clay.png",
            locationIds = listOf(),
            types = listOf(FORAGING),
            externalTypeRefId = listOf(),
            activityIds = listOf(),
            collectionRecipeIds = listOf(),
            starCount = 0,
            energyValue = 0,
            buyPrice = 0,
            sellPrice = 20
        ),
        CollectionItem(
            itemId = "brick",
            parentGroupId = "",
            parentGroupIndex = "",
            localizedNameKey = "Brick",
            localizedDescriptionKey = "Brick is a refined material which can be crafted using a crafting station. It also has a chance to be found for sale at Kristoff's Stall.",
            imageUrl = "https://dreamlightvalleywiki.com/File:Brick.png",
            locationIds = listOf(),
            types = listOf(CRAFTING),
            externalTypeRefId = listOf(),
            activityIds = listOf(),
            collectionRecipeIds = listOf(),
            starCount = 0,
            energyValue = 0,
            buyPrice = 130,
            sellPrice = 130
        ),
        CollectionItem(
            itemId = "Jubilant-Topiary",
            parentGroupId = "",
            parentGroupIndex = "",
            localizedNameKey = "Jubilant Topiary",
            localizedDescriptionKey = "Jubilant Topiary is a piece of craftable furniture.\n" +
                "\n" +
                "Because it's possible to craft it using a crafting station it's tracked in the Crafted collection tab instead of the Furniture tab. It can be registered to the Collection either by crafting it or picking it up.",
            imageUrl = "https://dreamlightvalleywiki.com/File:Jubilant_Topiary.png",
            locationIds = listOf(),
            types = listOf(CRAFTING),
            externalTypeRefId = listOf(),
            activityIds = listOf(),
            collectionRecipeIds = listOf(),
            starCount = 0,
            energyValue = 0,
            buyPrice = 0,
            sellPrice = 0
        ),
        CollectionItem(
            itemId = "Gold Ingot",
            parentGroupId = "",
            parentGroupIndex = "",
            localizedNameKey = "Gold Ingot",
            localizedDescriptionKey = "Gold Ingot is a refined material which can be crafted using a crafting station.\n" +
                "It also has a chance to be found for sale at Kristoff's Stall.\n",
            imageUrl = "https://dreamlightvalleywiki.com/File:Gold_Ingot.png",
            locationIds = listOf(),
            types = listOf(CRAFTING),
            externalTypeRefId = listOf(),
            activityIds = listOf(),
            collectionRecipeIds = listOf(),
            starCount = 0,
            energyValue = 0,
            buyPrice = 0,
            sellPrice = 130
        ),
        CollectionItem(
            itemId = "Golden Brick Road",
            parentGroupId = "",
            parentGroupIndex = "",
            localizedNameKey = "Golden Brick Road",
            localizedDescriptionKey = "Golden Brick Road is a paving type which can be crafted using a crafting station.\n" +
                "It can be placed on the ground to create pathing and decoration.\n",
            imageUrl = "https://dreamlightvalleywiki.com/File:Golden_Brick_Road.png",
            locationIds = listOf(),
            types = listOf(CRAFTING),
            externalTypeRefId = listOf(),
            activityIds = listOf(),
            collectionRecipeIds = listOf(),
            starCount = 0,
            energyValue = 0,
            buyPrice = 0,
            sellPrice = 130
        )
    )
}
