package app.dreamlighpal.core.threading.impl.shared

import app.dreamlightpal.core.threading.api.shared.DispatcherProvider
import com.rickclephas.kmp.nativecoroutines.NativeCoroutineScope
import kotlinx.coroutines.Dispatchers

class DispatcherProviderImpl : DispatcherProvider {

    @NativeCoroutineScope
    override val main = Dispatchers.Main

    @NativeCoroutineScope
    override val default = Dispatchers.Default

    @NativeCoroutineScope
    override val unconfined = Dispatchers.Unconfined
}
