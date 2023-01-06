package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("energy") val energy: String,
    @SerialName("growTime") val growTime: String,
    @SerialName("water") val water: String,
    @SerialName("yield") val yield: String,
    @SerialName("locations") val locations: String,
    @SerialName("sources") val sources: String,
) : CollectionItem

sealed interface IngredientRepository {

    val collection: SharedFlow<List<Ingredient>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Ingredient?
    suspend fun addAll(clothingList: List<Ingredient>)
}
