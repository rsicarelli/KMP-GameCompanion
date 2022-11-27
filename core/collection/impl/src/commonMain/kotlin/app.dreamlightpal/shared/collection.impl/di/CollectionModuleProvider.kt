package app.dreamlightpal.shared.collection.impl.di

import app.dreamlightpal.shared.api.domain.CollectionRepository
import app.dreamlightpal.shared.api.domain.SyncCollectionDatabaseUseCase
import app.dreamlightpal.shared.collection.impl.data.CollectionRepositoryImpl
import app.dreamlightpal.shared.collection.impl.domain.SyncCollectionDatabaseUseCaseImpl
import app.dreamlightpal.shared.moduleprovider.api.ModuleProvider
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

object CollectionModuleProvider : ModuleProvider {

    override val module = module {
        singleOf(::CollectionRepositoryImpl) { bind<CollectionRepository>() }
        factoryOf(::SyncCollectionDatabaseUseCaseImpl) { bind<SyncCollectionDatabaseUseCase>() }
    }
}
