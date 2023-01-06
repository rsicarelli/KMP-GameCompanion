package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Wallpaper(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("tags") val tags: Sequence<String>,
    @SerialName("location") val location: String,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("rewardFrom") val rewardFrom: String,
    @SerialName("realm") val realm: String,
) : CollectionItem

sealed interface WallpaperRepository {

    val collection: SharedFlow<List<Wallpaper>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Wallpaper?
    suspend fun addAll(clothingList: List<Wallpaper>)
}
