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
data class Flooring(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("tags") val tags: List<String> = emptyList(),
    @SerialName("location") val location: String,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("rewardFrom") val rewardFrom: String,
    @SerialName("realm") val realm: String,
) : CollectionItem

sealed interface FlooringRepository {

    val collection: SharedFlow<List<Flooring>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Flooring?
    suspend fun addAll(clothingList: List<Flooring>)
    suspend fun load()
}

internal class FlooringRepositoryImpl(
    contextProvider: ContextProvider,
) : FlooringRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Flooring>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Flooring>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Flooring? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Flooring>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_flooring.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Flooring>>(source.buffer())
            _collection.value = result
        }
    }
}
