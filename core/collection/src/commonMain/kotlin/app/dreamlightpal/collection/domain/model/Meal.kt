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
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.okio.decodeFromBufferedSource
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.buffer

@Serializable
data class Meal(
    @SerialName("itemId") override val id: CollectionItemId,
    @SerialName("name") override val name: String,
    @SerialName("description") override val description: String?,
    @SerialName("imageUrl") override val imageUrl: String,
    @SerialName("types") override val types: List<CollectionType> = listOf(CollectionType.Meal),
    @SerialName("mealCategory") val mealCategory: MealCategory,
    @SerialName("starCount") val starCount: Long,
    @SerialName("energy") val energy: Long,
    @SerialName("sellPrice") val sellPrice: Long,
    @SerialName("ingredients") val ingredients: String,
) : CollectionItem

@Serializable
enum class MealCategory {

    @SerialName("Appetizers") Appetizers,
    @SerialName("Entrées") Entrées,
    @SerialName("Desserts") Desserts,
}

interface MealRepository {

    val collection: SharedFlow<List<Meal>?>
    val version: Int?
    suspend fun find(collectionItemId: CollectionItemId): Meal?
    suspend fun addAll(clothingList: List<Meal>)
    suspend fun load()
}

internal class MealRepositoryImpl(
    contextProvider: ContextProvider,
) : MealRepository {

    private val scope = CoroutineScope(contextProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> e.printStackTrace() }
    )

    private val _collection: MutableStateFlow<List<Meal>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<Meal>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override val version: Int = 0

    override suspend fun find(collectionItemId: CollectionItemId): Meal? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(clothingList: List<Meal>) {
        TODO("Not yet implemented")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun load() {
        scope.launch {
            val source = FileSystem.RESOURCES.source("collection_meal.json".toPath())
            val result = Json.decodeFromBufferedSource<List<Meal>>(source.buffer())
            _collection.value = result
        }
    }
}
