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
data class Landscape(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
) : CollectionItem

sealed interface LandscapeRepository {

    val collection: SharedFlow<List<Landscape>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Landscape?
    suspend fun addAll(clothingList: List<Landscape>)
    suspend fun load()
}

internal class LandscapeRepositoryImpl(
    contextProvider: ContextProvider,
) : LandscapeRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Landscape>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Landscape>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Landscape? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Landscape>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_landscape.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Landscape>>(source.buffer())
            _collection.value = result
        }
    }
}
