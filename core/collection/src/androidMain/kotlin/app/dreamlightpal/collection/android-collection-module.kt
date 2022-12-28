package app.dreamlightpal.collection

import app.dreamlightpal.collection.data.DriverFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

internal actual val DriverFactoryModule = module {
    factory { DriverFactory(androidContext()) }
}
