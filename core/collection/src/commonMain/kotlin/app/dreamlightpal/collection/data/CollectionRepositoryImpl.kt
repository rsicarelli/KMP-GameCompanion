package app.dreamlightpal.collection.data

import app.dreamlightpal.collection.domain.model.CollectionItem
import app.dreamlightpal.collection.domain.model.CollectionItemId
import app.dreamlightpal.collection.domain.repository.CollectionRepository
import app.dreamlightpal.threading.ContextProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow

internal class CollectionRepositoryImpl(
    contextProvider: ContextProvider,
) : CollectionRepository {

    private val _collection: MutableStateFlow<List<CollectionItem>?> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<CollectionItem>?> = _collection

    override val version: Int = 0

    override suspend fun findById(collectionItemId: CollectionItemId): CollectionItem? =
        null

    override suspend fun addAll(collectionItems: List<CollectionItem>) {

    }
}
