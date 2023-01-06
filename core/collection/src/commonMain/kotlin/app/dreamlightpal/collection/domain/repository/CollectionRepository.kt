package app.dreamlightpal.collection.domain.repository

import app.dreamlightpal.collection.domain.model.CollectionItem
import app.dreamlightpal.collection.domain.model.CollectionItemId
import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>?>

    val version: Int?
    suspend fun findById(collectionItemId: CollectionItemId): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
}
