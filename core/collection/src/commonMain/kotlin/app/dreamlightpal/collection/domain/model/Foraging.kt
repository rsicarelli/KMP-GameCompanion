package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Foraging(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    val sellPrice: String,
    val locations: String,
) : CollectionItem

sealed interface ForagingRepository {

    val collection: SharedFlow<List<Foraging>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Foraging?
    suspend fun addAll(clothingList: List<Foraging>)
}
