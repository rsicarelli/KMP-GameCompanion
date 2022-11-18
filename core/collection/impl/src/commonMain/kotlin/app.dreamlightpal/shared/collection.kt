package app.dreamlightpal.shared

import kotlinx.serialization.Serializable

const val Json =
    "{\"total\":1040,\"items\":[{\"itemId\":\"123\",\"parentGroupId\":\"456\",\"parentGroupIndex\":-1,\"localizedNameKey\":\"some_key\",\"localizedDescriptionKey\":\"some_key\",\"imageUrl\":\"www.image.com\",\"locationIds\":[\"1234\",\"3445\"],\"types\":[\"MEMORY\",\"CHARACTER\",\"CRAFTING\",\"CRITTER\",\"FISH\",\"FORAGING\",\"INGREDIENT\",\"MEAL\",\"GEM\",\"CLOTHING\",\"FURNITURE\"],\"externalTypeRefId\":\"234\",\"activityIds\":[\"123\",\"123\"],\"collectionRecipeIds\":[\"123\",\"456\"],\"starCount\":5,\"energyValue\":4334,\"buyPrice\":434,\"sellPrice\":23434}]}"

@Serializable
data class Collection(
    val total: Int,
    val items: List<CollectionItem>,
)

@Serializable
data class CollectionItem(
    val itemId: String,
    val parentGroupId: String,
    val parentGroupIndex: String,
    val localizedNameKey: String,
    val localizedDescriptionKey: String,
    val imageUrl: String,
    val locationIds: List<String>,
    val types: List<CollectionType>,
    val externalTypeRefId: List<String>,
    val activityIds: List<String>,
    val collectionRecipeIds: List<String>,
    val starCount: Int,
    val energyValue: Int,
    val buyPrice: Int,
    val sellPrice: Int,
)

enum class CollectionType {
    MEMORY, CHARACTER, CRAFTING, CRITTER,
    FISH, FORAGING, INGREDIENT, MEAL,
    GEM, CLOTHING, FURNITURE;
}

