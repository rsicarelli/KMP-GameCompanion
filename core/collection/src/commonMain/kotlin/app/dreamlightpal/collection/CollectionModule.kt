package app.dreamlightpal.collection

import app.dreamlightpal.collection.domain.SyncCollectionUseCase
import app.dreamlightpal.collection.domain.model.ClothingRepository
import app.dreamlightpal.collection.domain.model.ClothingRepositoryImpl
import app.dreamlightpal.collection.domain.model.CraftingRepository
import app.dreamlightpal.collection.domain.model.CraftingRepositoryImpl
import app.dreamlightpal.collection.domain.model.CritterRepository
import app.dreamlightpal.collection.domain.model.CritterRepositoryImpl
import app.dreamlightpal.collection.domain.model.FishRepository
import app.dreamlightpal.collection.domain.model.FishRepositoryImpl
import app.dreamlightpal.collection.domain.model.FlooringRepository
import app.dreamlightpal.collection.domain.model.FlooringRepositoryImpl
import app.dreamlightpal.collection.domain.model.ForagingRepository
import app.dreamlightpal.collection.domain.model.ForagingRepositoryImpl
import app.dreamlightpal.collection.domain.model.FurnitureRepository
import app.dreamlightpal.collection.domain.model.FurnitureRepositoryImpl
import app.dreamlightpal.collection.domain.model.GemRepository
import app.dreamlightpal.collection.domain.model.GemRepositoryImpl
import app.dreamlightpal.collection.domain.model.IngredientRepository
import app.dreamlightpal.collection.domain.model.IngredientRepositoryImpl
import app.dreamlightpal.collection.domain.model.LandscapeRepository
import app.dreamlightpal.collection.domain.model.LandscapeRepositoryImpl
import app.dreamlightpal.collection.domain.model.MealRepository
import app.dreamlightpal.collection.domain.model.MealRepositoryImpl
import app.dreamlightpal.collection.domain.model.MemoryRepository
import app.dreamlightpal.collection.domain.model.MemoryRepositoryImpl
import app.dreamlightpal.collection.domain.model.MotifRepository
import app.dreamlightpal.collection.domain.model.MotifRepositoryImpl
import app.dreamlightpal.collection.domain.model.WallpaperRepository
import app.dreamlightpal.collection.domain.model.WallpaperRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory
import org.kodein.di.instance
import org.kodein.di.singleton

val CollectionModule = DI.Module("Collection") {
//    bind<CollectionRepository>() with singleton { CollectionRepositoryImpl(instance()) }
    bind<SyncCollectionUseCase>() with factory { SyncCollectionUseCase(instance()) }
    bind<MealRepository>() with singleton { MealRepositoryImpl(instance()) }
    bind<ClothingRepository>() with singleton { ClothingRepositoryImpl(instance()) }
    bind<CraftingRepository>() with singleton { CraftingRepositoryImpl(instance()) }
    bind<CritterRepository>() with singleton { CritterRepositoryImpl(instance()) }
    bind<FishRepository>() with singleton { FishRepositoryImpl(instance()) }
    bind<FlooringRepository>() with singleton { FlooringRepositoryImpl(instance()) }
    bind<FurnitureRepository>() with singleton { FurnitureRepositoryImpl(instance()) }
    bind<ForagingRepository>() with singleton { ForagingRepositoryImpl(instance()) }
    bind<GemRepository>() with singleton { GemRepositoryImpl(instance()) }
    bind<IngredientRepository>() with singleton { IngredientRepositoryImpl(instance()) }
    bind<LandscapeRepository>() with singleton { LandscapeRepositoryImpl(instance()) }
    bind<MemoryRepository>() with singleton { MemoryRepositoryImpl(instance()) }
    bind<MotifRepository>() with singleton { MotifRepositoryImpl(instance()) }
    bind<WallpaperRepository>() with singleton { WallpaperRepositoryImpl(instance()) }
    import(DriverFactoryModule)
}
internal expect val DriverFactoryModule: DI.Module
