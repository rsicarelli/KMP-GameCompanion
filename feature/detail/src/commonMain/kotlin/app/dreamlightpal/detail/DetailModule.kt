package app.dreamlightpal.detail

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.factory

val DetailModule = DI.Module("Detail") {
    bind<DetailComponentFactory>() with factory { DetailComponentFactory(::DetailComponentHolder) }
}
