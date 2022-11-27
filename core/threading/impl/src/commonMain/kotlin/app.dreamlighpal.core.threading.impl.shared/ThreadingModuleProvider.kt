package app.dreamlighpal.core.threading.impl.shared

import app.dreamlightpal.shared.moduleprovider.api.ModuleProvider
import app.dreamlightpal.threading.api.shared.DispatcherProvider
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

object ThreadingModuleProvider : ModuleProvider {

    override val module = module {
        singleOf(::DispatcherProviderImpl) { bind<DispatcherProvider>() }
    }

}
