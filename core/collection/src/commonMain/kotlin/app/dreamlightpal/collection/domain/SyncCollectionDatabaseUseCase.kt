package app.dreamlightpal.collection.domain

import kotlinx.coroutines.CoroutineScope

class SyncCollectionUseCase(
    private val collectionRepository: CollectionRepository,
) {

    operator fun invoke(coroutineScope: CoroutineScope) {

    }
}
