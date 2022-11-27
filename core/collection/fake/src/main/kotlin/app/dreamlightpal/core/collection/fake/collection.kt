package app.dreamlightpal.core.collection.fake

import app.dreamlightpal.core.collection.api.shared.domain.CollectionItem
import app.dreamlightpal.core.collection.api.shared.domain.CollectionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow

val Fake_CollectionItem =
    CollectionItem(
        itemId = "0",
        parentGroupId = "",
        parentGroupIndex = "",
        localizedNameKey = "",
        localizedDescriptionKey = "",
        imageUrl = "",
        locationIds = listOf(),
        types = listOf(),
        externalTypeRefId = listOf(),
        activityIds = listOf(),
        collectionRecipeIds = listOf(),
        starCount = 0,
        energyValue = 0,
        buyPrice = 0,
        sellPrice = 0
    )

val Fake_Collection = listOf(Fake_CollectionItem)
val FakeFlow_Collection = MutableStateFlow<List<CollectionItem>?>(null)
val Fake_CollectionRepository = object : CollectionRepository {
    override val collection: SharedFlow<List<CollectionItem>?> = FakeFlow_Collection
    override suspend fun findById(collectionItemId: String): CollectionItem? = null
    override suspend fun addAll(collectionItems: List<CollectionItem>) = Unit
}
