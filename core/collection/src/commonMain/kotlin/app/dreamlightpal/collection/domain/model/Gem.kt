package app.dreamlightpal.collection.domain.model

import com.rsicarelli.kmplatform.threading.ContextProvider
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
data class Gem(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("locations") val locations: String,
    @SerialName("referenced") val referenced: String,
) : CollectionItem

sealed interface GemRepository {

    val collection: SharedFlow<List<Gem>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Gem?
    suspend fun addAll(clothingList: List<Gem>)
    suspend fun load()
}

internal class GemRepositoryImpl(
    contextProvider: ContextProvider,
) : GemRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Gem>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Gem>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Gem? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Gem>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_gem.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Gem>>(source.buffer())
            _collection.value = result
        }
    }
}
