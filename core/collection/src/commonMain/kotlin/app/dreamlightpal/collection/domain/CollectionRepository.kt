package app.dreamlightpal.collection.domain

import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>?>

    val version: Int?
    suspend fun findById(collectionItemId: String): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
}
