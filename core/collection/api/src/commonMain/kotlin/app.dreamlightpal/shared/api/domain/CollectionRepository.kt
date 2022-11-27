package app.dreamlightpal.shared.api.domain

import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>?>
    suspend fun findById(collectionItemId: String): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
}
