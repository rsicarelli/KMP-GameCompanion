package app.dreamlightpal.shared.collection.impl.data

import app.dreamlightpal.shared.api.domain.CollectionItem
import app.dreamlightpal.shared.api.domain.CollectionRepository
import app.dreamlightpal.shared.api.domain.CollectionType
import app.dreamlightpal.threading.api.shared.DispatcherProvider
import co.touchlab.kermit.Logger
import com.rickclephas.kmp.nativecoroutines.NativeCoroutineScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.shareIn

internal class CollectionRepositoryImpl(
    private val dispatcherProvider: DispatcherProvider,
) : CollectionRepository {

    @NativeCoroutineScope
    private val scope = CoroutineScope(dispatcherProvider.default + SupervisorJob() + CoroutineExceptionHandler { _, exception ->
        Logger.e("Got new exception on CollectionRepositoryImpl", exception)
    })

    private val _collection: MutableStateFlow<List<CollectionItem>> = MutableStateFlow(emptyList())
    override val collection: SharedFlow<List<CollectionItem>> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

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
