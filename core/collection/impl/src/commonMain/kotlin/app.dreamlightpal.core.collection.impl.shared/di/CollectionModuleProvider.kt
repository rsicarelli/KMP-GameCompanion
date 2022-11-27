package app.dreamlightpal.core.collection.impl.shared.di

import app.dreamlightpal.core.collection.api.shared.domain.CollectionRepository
import app.dreamlightpal.core.collection.api.shared.domain.SyncCollectionDatabaseUseCase
import app.dreamlightpal.core.collection.impl.shared.data.CollectionRepositoryImpl
import app.dreamlightpal.core.collection.impl.shared.domain.SyncCollectionDatabaseUseCaseImpl
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
