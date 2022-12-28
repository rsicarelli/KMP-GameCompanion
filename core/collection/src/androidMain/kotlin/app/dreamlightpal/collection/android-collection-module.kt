package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.DriverFactory
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory
import org.kodein.di.instance

internal actual val DriverFactoryModule = DI.Module("Driver factory module") {
    bind<DriverFactory>() with factory { DriverFactory(instance()) }
}
