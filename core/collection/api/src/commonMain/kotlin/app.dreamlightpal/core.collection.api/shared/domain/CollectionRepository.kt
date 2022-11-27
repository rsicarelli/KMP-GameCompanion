package app.dreamlightpal.core.collection.api.shared.domain

import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>?>
    suspend fun findById(collectionItemId: String): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
}
