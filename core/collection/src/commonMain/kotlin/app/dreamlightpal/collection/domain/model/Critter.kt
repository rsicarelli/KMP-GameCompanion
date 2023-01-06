package app.dreamlightpal.collection.domain.model

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class Critter(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("preferredGifts") val preferredGifts: Sequence<CollectionItemId>,
    @SerialName("preferredMealLevel") val preferredMealLevel: Int,
    @SerialName("locationId") @Contextual val locationId: LocationId,
    @SerialName("feedingMethod") val feedingMethod: String,
    @SerialName("dailySchedules") val dailySchedules: Sequence<CritterDailySchedule>,
) : CollectionItem

@Serializable
data class CritterDailySchedule(
    @SerialName("dayOfWeek") val dayOfWeek: Int,
    @SerialName("startTime") val startTime: Long?,
    @SerialName("endTime") val endTime: Long?,
)

sealed interface CritterRepository {

    val collection: SharedFlow<List<Critter>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Critter?
    suspend fun addAll(clothingList: List<Critter>)
}
