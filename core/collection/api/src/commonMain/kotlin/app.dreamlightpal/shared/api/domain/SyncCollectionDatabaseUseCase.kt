package app.dreamlightpal.shared.api.domain

import kotlinx.coroutines.CoroutineScope

interface SyncCollectionDatabaseUseCase {

    operator fun invoke(coroutineScope: CoroutineScope)
}
