package app.dreamlightpal.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CollectionItem(
    @SerialName("itemId") val itemId: String,
    @SerialName("parentGroupId") val parentGroupId: String,
    @SerialName("parentGroupIndex") val parentGroupIndex: String,
    @SerialName("localizedNameKey") val localizedNameKey: String,
    @SerialName("localizedDescriptionKey") val localizedDescriptionKey: String,
    @SerialName("imageUrl") val imageUrl: String,
    @SerialName("locationIds") val locationIds: List<String>,
    @SerialName("types") val types: List<CollectionType>,
    @SerialName("externalTypeRefId") val externalTypeRefId: List<String>,
    @SerialName("activityIds") val activityIds: List<String>,
    @SerialName("collectionRecipeIds") val collectionRecipeIds: List<String>,
    @SerialName("starCount") val starCount: Int,
    @SerialName("energyValue") val energyValue: Int,
    @SerialName("buyPrice") val buyPrice: Int,
    @SerialName("sellPrice") val sellPrice: Int,
)

@Serializable
enum class CollectionType {

    MEMORY, CHARACTER, CRAFTING, CRITTER,
    FISH, FORAGING, INGREDIENT, MEAL,
    GEM, CLOTHING, FURNITURE;
}
