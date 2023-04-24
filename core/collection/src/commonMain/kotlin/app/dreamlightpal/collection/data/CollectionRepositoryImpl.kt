package app.dreamlightpal.collection.data

//
//
//
//internal class CollectionRepositoryImpl(
//    contextProvider: ContextProvider,
//    collectionJsonReader: CollectionJsonReader<CollectionItem>,
//) : CollectionRepository {
//
//    private val scope = CoroutineScope(contextProvider.default + SupervisorJob())
//    private val _collection: MutableStateFlow<DreamlightCollection?> = MutableStateFlow(null)
//    override val collection: SharedFlow<DreamlightCollection?> = _collection.shareIn(
//        scope = scope,
//        started = SharingStarted.Lazily,
//        replay = 1
//    )
//
//    init {
//        scope.launch {
//            val typeDeferredMap = CollectionType.values().associateWith {
//                async { collectionJsonReader(it.name.lowercase()) }
//            }
//
//            _collection.value = DreamlightCollection(
//                clothing = typeDeferredMap[CollectionType.Clothing]?.await() as Sequence<Clothing>,
//                crafting = typeDeferredMap[CollectionType.Crafting]?.await() as Sequence<Crafting>,
//                critter = typeDeferredMap[CollectionType.Critter]?.await() as Sequence<Critter>,
//                fish = typeDeferredMap[CollectionType.Fish]?.await() as Sequence<Fish>,
//                flooring = typeDeferredMap[CollectionType.Flooring]?.await() as Sequence<Flooring>,
//                foraging = typeDeferredMap[CollectionType.Foraging]?.await() as Sequence<Foraging>,
//                furniture = typeDeferredMap[CollectionType.Furniture]?.await() as Sequence<Furniture>,
//                gem = typeDeferredMap[CollectionType.Gem]?.await() as Sequence<Gem>,
//                ingredient = typeDeferredMap[CollectionType.Ingredient]?.await() as Sequence<Ingredient>,
//                landscape = typeDeferredMap[CollectionType.Landscape]?.await() as Sequence<Landscape>,
//                meal = typeDeferredMap[CollectionType.Meal]?.await() as Sequence<Meal>,
//                memory = typeDeferredMap[CollectionType.Memory]?.await() as Sequence<Memory>,
//                motif = typeDeferredMap[CollectionType.Motif]?.await() as Sequence<Motif>,
//                wallpaper = typeDeferredMap[CollectionType.Wallpaper]?.await() as Sequence<Wallpaper>,
//            )
//        }
//    }
//
//    override suspend fun findById(collectionItemId: CollectionItemId): CollectionItem? = null
//
//    override suspend fun addAll(collectionItems: List<CollectionItem>) {
//        collectionItems.first().types.forEach {
//            when (it) {
//                CollectionType.Character -> TODO()
//                CollectionType.Clothing -> TODO()
//                CollectionType.Crafting -> TODO()
//                CollectionType.Critter -> TODO()
//                CollectionType.Fish -> TODO()
//                CollectionType.Flooring -> TODO()
//                CollectionType.Foraging -> TODO()
//                CollectionType.Furniture -> TODO()
//                CollectionType.Gem -> TODO()
//                CollectionType.Ingredient -> TODO()
//                CollectionType.Landscape -> TODO()
//                CollectionType.Meal -> TODO()
//                CollectionType.Memory -> TODO()
//                CollectionType.Motif -> TODO()
//                CollectionType.Wallpaper -> TODO()
//            }
//        }
//    }
//}
