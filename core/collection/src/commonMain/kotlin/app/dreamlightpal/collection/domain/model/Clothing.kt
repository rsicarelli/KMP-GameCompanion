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
data class Clothing(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("category") val category: String,
    @SerialName("tags") val tags: Sequence<String>,
    @SerialName("from") val from: String,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("rewardFrom") val rewardFrom: String,
    @SerialName("realm") val realm: String,
) : CollectionItem

sealed interface ClothingRepository {

    val collection: SharedFlow<List<Clothing>?>
    val version: Int?
    suspend fun findOrNull(collectionItemId: CollectionItemId): Clothing?
    suspend fun addAll(clothingList: List<Clothing>)
    suspend fun load()
}

internal class ClothingRepositoryImpl(
    contextProvider: ContextProvider,
) : ClothingRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Clothing>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Clothing>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun findOrNull(collectionItemId: CollectionItemId): Clothing? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Clothing>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_clothing.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Clothing>>(source.buffer())
            _collection.value = result
        }
    }
}

