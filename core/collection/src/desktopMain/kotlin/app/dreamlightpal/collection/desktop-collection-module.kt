package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.DriverFactory
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

actual val DriverFactoryModule = module {
    factoryOf(::DriverFactory)
}
