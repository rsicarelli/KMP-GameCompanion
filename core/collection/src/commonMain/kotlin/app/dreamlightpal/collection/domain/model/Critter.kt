package app.dreamlightpal.collection.domain.model

import app.dreamlightpal.threading.ContextProvider
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch
import kotlinx.serialization.Contextual
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.okio.decodeFromBufferedSource
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.buffer

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
    suspend fun load()
}

internal class CritterRepositoryImpl(
    contextProvider: ContextProvider,
) : CritterRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Critter>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Critter>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Critter? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Critter>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_critter.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Critter>>(source.buffer())
            _collection.value = result
        }
    }
}
