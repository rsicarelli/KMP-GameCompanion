package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Memory(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("entry") val entry: String,
    @SerialName("location") val location: String,
    @SerialName("details") val details: String,
    @SerialName("groupName") val groupName: String,
) : CollectionItem

sealed interface MemoryRepository {

    val collection: SharedFlow<List<Memory>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Memory?
    suspend fun addAll(clothingList: List<Memory>)
}
