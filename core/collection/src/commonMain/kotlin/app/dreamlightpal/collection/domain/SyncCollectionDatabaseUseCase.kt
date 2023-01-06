package app.dreamlightpal.collection.domain

import app.dreamlightpal.collection.domain.repository.CollectionRepository
import kotlinx.coroutines.CoroutineScope

class SyncCollectionUseCase(
    private val collectionRepository: CollectionRepository,
) {

    operator fun invoke(coroutineScope: CoroutineScope) {

    }
}
