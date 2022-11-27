package app.dreamlighpal.core.threading.impl.shared

import app.dreamlightpal.threading.api.shared.DispatcherProvider
import kotlinx.coroutines.Dispatchers

class DispatcherProviderImpl : DispatcherProvider {

    override val main = Dispatchers.Main
    override val default = Dispatchers.Default
    override val unconfined = Dispatchers.Unconfined
}
