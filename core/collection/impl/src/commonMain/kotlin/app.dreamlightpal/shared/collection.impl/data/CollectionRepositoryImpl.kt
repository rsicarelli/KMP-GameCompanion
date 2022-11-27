package app.dreamlightpal.shared.collection.impl.data

import app.dreamlightpal.shared.api.domain.CollectionItem
import app.dreamlightpal.shared.api.domain.CollectionRepository
import app.dreamlightpal.threading.api.shared.DispatcherProvider
import co.touchlab.kermit.Logger
import com.rickclephas.kmp.nativecoroutines.NativeCoroutineScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.getAndUpdate
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.withContext

internal class CollectionRepositoryImpl(
    dispatcherProvider: DispatcherProvider,
) : CollectionRepository {

    @NativeCoroutineScope
    private val scope = CoroutineScope(dispatcherProvider.default + SupervisorJob()
        + CoroutineExceptionHandler { _, e -> Logger.e("Got new exception on CollectionRepositoryImpl", e) }
    )

    private val _collection: MutableStateFlow<List<CollectionItem>?> = MutableStateFlow(null)
    override val collection: SharedFlow<List<CollectionItem>?> =
        _collection.shareIn(
            scope = scope,
            started = SharingStarted.Lazily,
            replay = 1
        )

    override suspend fun findById(collectionItemId: String): CollectionItem? =
        withContext(scope.coroutineContext) {
            _collection.value?.firstOrNull { (itemId) -> itemId == collectionItemId }
        }

    override suspend fun addAll(collectionItems: List<CollectionItem>) {
        withContext(scope.coroutineContext) {
            _collection.getAndUpdate { current ->
                val mutableList = current?.toMutableList() ?: mutableListOf()
                mutableList.addAll(collectionItems)
                mutableList
            }
        }
    }
}
