package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Meal(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: Sequence<CollectionType>,
    @SerialName("type") val type: String,
    @SerialName("stars") val stars: String,
    @SerialName("energy") val energy: String,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("ingredients") val ingredients: String,
) : CollectionItem

sealed interface MealRepository {

    val collection: SharedFlow<List<Meal>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Meal?
    suspend fun addAll(clothingList: List<Meal>)
}
