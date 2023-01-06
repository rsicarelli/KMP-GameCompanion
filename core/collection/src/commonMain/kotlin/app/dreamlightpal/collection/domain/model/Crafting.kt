package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crafting(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("buyPrice") val buyPrice: String?,
    @SerialName("sellPrice") val sellPrice: String?,
    @SerialName("soldAt") @Contextual val soldAt: LocationId?,
    @SerialName("craftingRecipe") val craftingRecipe: String?,
) : CollectionItem

sealed interface CraftingRepository {

    val collection: SharedFlow<List<Crafting>?>
    val version: Int?
    suspend fun findOrNull(collectionItemId: CollectionItemId): Crafting?
    suspend fun addAll(clothingList: List<Crafting>)
}
