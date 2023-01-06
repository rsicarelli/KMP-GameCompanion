package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Clothing(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
    @SerialName("category") val category: String,
    @SerialName("tags") val tags: Sequence<String>,
    @SerialName("from") val from: String,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("rewardFrom") val rewardFrom: String,
    @SerialName("realm") val realm: String,
) : CollectionItem

sealed interface ClothingRepository {

    val collection: SharedFlow<List<Clothing>?>
    val version: Int?
    suspend fun findOrNull(collectionItemId: CollectionItemId): Clothing?
    suspend fun addAll(clothingList: List<Clothing>)
}
