package app.dreamlightpal.collection.domain.repository

import app.dreamlightpal.collection.domain.model.CollectionItem
import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>?>

    val version: Int?
    suspend fun findById(collectionItemId: String): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
}
