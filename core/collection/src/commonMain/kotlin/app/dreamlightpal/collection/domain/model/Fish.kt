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

@Serializable
data class Fish(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("seedIndex") val seedIndex: Int,
    @SerialName("ripples") val ripples: String,
    @SerialName("weather") val weather: String,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("energy") val energy: String,
    @SerialName("locations") val locations: String,
) : CollectionItem

sealed interface FishRepository {

    val collection: SharedFlow<List<Fish>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Fish?
    suspend fun addAll(clothingList: List<Fish>)
    suspend fun load()
}

internal class FishRepositoryImpl(
    contextProvider: ContextProvider,
) : FishRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Fish>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Fish>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Fish? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Fish>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_fish.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Fish>>(source.buffer())
            _collection.value = result
        }
    }
}

