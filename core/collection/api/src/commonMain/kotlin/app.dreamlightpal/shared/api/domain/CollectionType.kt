package app.dreamlightpal.shared.api.domain

import kotlinx.serialization.Serializable

@Serializable
enum class CollectionType {

    MEMORY, CHARACTER, CRAFTING, CRITTER,
    FISH, FORAGING, INGREDIENT, MEAL,
    GEM, CLOTHING, FURNITURE;
}
