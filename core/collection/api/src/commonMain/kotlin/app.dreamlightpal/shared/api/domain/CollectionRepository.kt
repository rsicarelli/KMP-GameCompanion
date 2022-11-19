package app.dreamlightpal.shared.api.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow

interface CollectionRepository {

    val collection: SharedFlow<List<CollectionItem>>
    suspend fun findById(collectionItemId: String): CollectionItem?
    suspend fun addAll(collectionItems: List<CollectionItem>)
    suspend fun updateById(collectionItemId: String)
    fun observeByType(type: CollectionType): Flow<List<CollectionItem>>
}
