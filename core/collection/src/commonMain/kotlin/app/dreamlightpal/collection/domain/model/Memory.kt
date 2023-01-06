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
data class Memory(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("entry") val entry: String,
    @SerialName("location") val location: String,
    @SerialName("details") val details: String,
    @SerialName("groupName") val groupName: String,
) : CollectionItem

sealed interface MemoryRepository {

    val collection: SharedFlow<List<Memory>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Memory?
    suspend fun addAll(clothingList: List<Memory>)
    suspend fun load()
}

internal class MemoryRepositoryImpl(
    contextProvider: ContextProvider,
) : MemoryRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Memory>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Memory>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Memory? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Memory>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_memory.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Memory>>(source.buffer())
            _collection.value = result
        }
    }
}
