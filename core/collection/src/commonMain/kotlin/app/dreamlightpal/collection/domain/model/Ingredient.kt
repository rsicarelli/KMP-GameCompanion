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
data class Ingredient(
    @SerialName("itemId") @Contextual
    override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType>,
    @SerialName("buyPrice") val buyPrice: String,
    @SerialName("sellPrice") val sellPrice: String,
    @SerialName("energy") val energy: String,
    @SerialName("growTime") val growTime: String,
    @SerialName("water") val water: String,
    @SerialName("yield") val yield: String,
    @SerialName("locations") val locations: String,
    @SerialName("sources") val sources: String,
) : CollectionItem

sealed interface IngredientRepository {

    val collection: SharedFlow<List<Ingredient>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Ingredient?
    suspend fun addAll(clothingList: List<Ingredient>)
    suspend fun load()
}

internal class IngredientRepositoryImpl(
    contextProvider: ContextProvider,
) : IngredientRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Ingredient>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Ingredient>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Ingredient? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Ingredient>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_ingredient.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Ingredient>>(source.buffer())
            _collection.value = result
        }
    }
}
