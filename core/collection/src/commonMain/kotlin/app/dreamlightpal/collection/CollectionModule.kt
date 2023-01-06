package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.CollectionRepositoryImpl
import app.dreamlightpal.collection.domain.SyncCollectionUseCase
import app.dreamlightpal.collection.domain.model.MealRepository
import app.dreamlightpal.collection.domain.model.MealRepositoryImpl
import app.dreamlightpal.collection.domain.repository.CollectionRepository
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory
import org.kodein.di.instance
import org.kodein.di.singleton

val CollectionModule = DI.Module("Collection") {
    bind<CollectionRepository>() with singleton { CollectionRepositoryImpl(instance()) }
    bind<SyncCollectionUseCase>() with factory { SyncCollectionUseCase(instance()) }
    bind<MealRepository>() with singleton { MealRepositoryImpl(instance()) }
    import(DriverFactoryModule)
}
internal expect val DriverFactoryModule: DI.Module
