package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Flooring(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
    @SerialName("tags") val tags: List<String> = emptyList(),
    @SerialName("location") val location: String,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("rewardFrom") val rewardFrom: String,
    @SerialName("realm") val realm: String,
) : CollectionItem

sealed interface FlooringRepository {

    val collection: SharedFlow<List<Flooring>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Flooring?
    suspend fun addAll(clothingList: List<Flooring>)
}
