package app.dreamlightpal.core.collection.api.shared.domain

import kotlinx.coroutines.CoroutineScope

interface SyncCollectionDatabaseUseCase {

    operator fun invoke(coroutineScope: CoroutineScope)
}
