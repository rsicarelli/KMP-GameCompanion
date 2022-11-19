package app.dreamlightpal.shared.collection.impl.data

import app.dreamlightpal.shared.api.domain.CollectionItem
import app.dreamlightpal.shared.api.domain.CollectionRepository
import app.dreamlightpal.shared.api.domain.CollectionType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow

internal class CollectionRepositoryImpl : CollectionRepository {

    init {

    }

    override val collection: SharedFlow<List<CollectionItem>>
        get() = TODO("Not yet implemented")

    override suspend fun findById(collectionItemId: String): CollectionItem? {
        TODO("Not yet implemented")
    }

    override suspend fun addAll(collectionItems: List<CollectionItem>) {
        TODO("Not yet implemented")
    }

    override suspend fun updateById(collectionItemId: String) {
        TODO("Not yet implemented")
    }

    override fun observeByType(type: CollectionType): Flow<List<CollectionItem>> {
        TODO("Not yet implemented")
    }
}
