@file:Suppress("InvalidPackageDeclaration")

package app.dreamlightpal.shared.api

data class Collection(
    val total: Int,
    val items: List<CollectionItem>,
)

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

