package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Gem(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("locations") val locations: String,
    @SerialName("referenced") val referenced: String,
) : CollectionItem

sealed interface GemRepository {

    val collection: SharedFlow<List<Gem>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Gem?
    suspend fun addAll(clothingList: List<Gem>)
}
