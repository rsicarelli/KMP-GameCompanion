package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Landscape(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
) : CollectionItem

sealed interface LandscapeRepository {

    val collection: SharedFlow<List<Landscape>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Landscape?
    suspend fun addAll(clothingList: List<Landscape>)
}
