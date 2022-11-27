package app.dreamlightpal.core.collection.api.shared.domain

import kotlinx.serialization.Serializable

@Serializable
enum class CollectionType {

    MEMORY, CHARACTER, CRAFTING, CRITTER,
    FISH, FORAGING, INGREDIENT, MEAL,
    GEM, CLOTHING, FURNITURE;
}
