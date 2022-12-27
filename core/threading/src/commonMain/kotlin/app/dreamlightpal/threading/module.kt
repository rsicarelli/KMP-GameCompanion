package app.dreamlightpal.threading

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val ThreadingModule = module {
    single {
        object : ContextProvider {
            override val io: CoroutineContext = Dispatchers.IO
            override val default: CoroutineContext = Dispatchers.Default
            override val main: CoroutineContext = Dispatchers.Main
        }
    }
}
