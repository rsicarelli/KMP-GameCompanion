package app.dreamlightpal.collection.domain.model

import java.net.URLEncoder
import kotlinx.serialization.Serializable

@JvmInline @Serializable
value class CollectionItemId(val value: String)

sealed interface CollectionItem {

    val id: CollectionItemId
    val name: String
    val description: String?
    val imageUrl: String
    val types: List<CollectionType>
}

val CollectionItem.wikiUrl: String
    get() = "https://dreamlightvalleywiki.com/${URLEncoder.encode(name.replace(" ", "_"), "utf-8")}"

@Serializable
enum class CollectionType {

    Character, Clothing, Crafting,
    Critter, Fish, Flooring,
    Foraging, Furniture, Gem,
    Ingredient, Landscape, Meal,
    Memory, Motif, Wallpaper;

    companion object {

        fun fromString(typeAsString: String) = values().asSequence()
            .first { it.name.equals(typeAsString, ignoreCase = true) }
    }

}
