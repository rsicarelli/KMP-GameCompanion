package app.dreamlightpal.list

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory

val ListModule = DI.Module("List") {
    bind<ListComponentFactory>() with factory {
        ListComponentFactory(::ListComponentHolder)
    }
}
