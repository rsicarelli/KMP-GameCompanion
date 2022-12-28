package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.CollectionRepositoryImpl
import app.dreamlightpal.collection.domain.CollectionRepository
import app.dreamlightpal.collection.domain.SyncCollectionUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val CollectionModule = module {
    singleOf(::CollectionRepositoryImpl) { bind<CollectionRepository>() }
    factoryOf(::SyncCollectionUseCase)
    loadKoinModules(DriverFactoryModule)
}
internal expect val DriverFactoryModule: Module
