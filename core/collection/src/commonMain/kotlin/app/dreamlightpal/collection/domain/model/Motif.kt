package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Motif(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
) : CollectionItem

sealed interface MotifRepository {

    val collection: SharedFlow<List<Motif>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Motif?
    suspend fun addAll(clothingList: List<Motif>)
}
