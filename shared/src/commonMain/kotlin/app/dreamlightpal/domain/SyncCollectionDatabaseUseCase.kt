package app.dreamlightpal.domain

import kotlinx.coroutines.CoroutineScope

class SyncCollectionUseCase(
    private val collectionRepository: CollectionRepository,
) {

    operator fun invoke(coroutineScope: CoroutineScope) {

    }
}
