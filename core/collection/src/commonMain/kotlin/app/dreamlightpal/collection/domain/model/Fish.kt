package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fish(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
    @SerialName("seedIndex") val seedIndex: Int,
    @SerialName("ripples") val ripples: String,
    @SerialName("weather") val weather: String,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("energy") val energy: String,
    @SerialName("locations") val locations: String,
) : CollectionItem

sealed interface FishRepository {

    val collection: SharedFlow<List<Fish>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Fish?
    suspend fun addAll(clothingList: List<Fish>)
}
