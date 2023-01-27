package app.dreamlightpal.collection.domain.repository


import app.dreamlightpal.collection.domain.repository.*
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.okio.decodeFromBufferedSource
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.buffer

fun interface CollectionJsonReader<C : CollectionItem> {

    suspend fun read(collectionType: CollectionType): Sequence<C>
}

@OptIn(ExperimentalSerializationApi::class)
internal suspend inline fun <reified T> CollectionType.loadFromJsonFile(): Sequence<T> =
    withContext(Dispatchers.Default) {
        Json.decodeFromBufferedSource(
            FileSystem.RESOURCES.source("collection_${name.lowercase()}.json".toPath()).buffer()
        )
    }

fun interface FindCollectionItem {

    suspend fun get(collectionItemId: CollectionItemId): CollectionItemId?
}

fun interface FindCollectionItemByType<T> {

    suspend fun get(collectionItemId: CollectionItemId): T?
}

private val _collection: MutableSharedFlow<DreamlightCollection?> = MutableSharedFlow(
    replay = 1, extraBufferCapacity = 0, onBufferOverflow = BufferOverflow.DROP_OLDEST
)

internal suspend fun collectionRepository(): SharedFlow<DreamlightCollection?> {
    coroutineScope {
        launch {
            _collection.emit(
                DreamlightCollection(
                    clothing = CollectionType.Clothing.loadFromJsonFile(),
                    crafting = CollectionType.Crafting.loadFromJsonFile(),
                    critter = CollectionType.Critter.loadFromJsonFile(),
                    fish = CollectionType.Fish.loadFromJsonFile(),
                    flooring = CollectionType.Flooring.loadFromJsonFile(),
                    foraging = CollectionType.Foraging.loadFromJsonFile(),
                    furniture = CollectionType.Furniture.loadFromJsonFile(),
                    gem = CollectionType.Gem.loadFromJsonFile(),
                    ingredient = CollectionType.Ingredient.loadFromJsonFile(),
                    landscape = CollectionType.Landscape.loadFromJsonFile(),
                    meal = CollectionType.Meal.loadFromJsonFile(),
                    memory = CollectionType.Memory.loadFromJsonFile(),
                    motif = CollectionType.Motif.loadFromJsonFile(),
                    wallpaper = CollectionType.Wallpaper.loadFromJsonFile(),
                )
            )
        }
    }
    return _collection.asSharedFlow()
}

fun interface CollectionRepository : (CoroutineContext, CollectionJsonReader<*>) -> SharedFlow<DreamlightCollection?>

data class DreamlightCollection(
    val clothing: Sequence<Clothing>,
    val crafting: Sequence<Crafting>,
    val critter: Sequence<Critter>,
    val fish: Sequence<Fish>,
    val flooring: Sequence<Flooring>,
    val foraging: Sequence<Foraging>,
    val furniture: Sequence<Furniture>,
    val gem: Sequence<Gem>,
    val ingredient: Sequence<Ingredient>,
    val landscape: Sequence<Landscape>,
    val meal: Sequence<Meal>,
    val memory: Sequence<Memory>,
    val motif: Sequence<Motif>,
    val wallpaper: Sequence<Wallpaper>,
)
