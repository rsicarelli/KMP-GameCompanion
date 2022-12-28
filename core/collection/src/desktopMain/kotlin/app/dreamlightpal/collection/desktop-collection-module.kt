package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.DriverFactory
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory

internal actual val DriverFactoryModule = DI.Module("Collection driver factory") {
    bind<DriverFactory>() with factory { DriverFactory() }
}
