package app.dreamlightpal.core.logger.api.shared

import co.touchlab.kermit.Logger

private val logger by lazy { Logger.withTag("_DreamlightPal_") }

@Suppress("TooManyFunctions", "unused")
object Logger {

    fun v(message: () -> String) = logger.v(message)
    fun v(throwable: Throwable, message: () -> String) = logger.v(throwable, message)
    fun v(message: String) = logger.v(message)
    fun v(message: String, throwable: Throwable) = logger.v(message, throwable)
    fun d(message: () -> String) = logger.d(message)
    fun d(throwable: Throwable, message: () -> String) = logger.d(throwable, message)
    fun d(message: String) = logger.d(message)
    fun d(message: String, throwable: Throwable) = logger.d(message, throwable)
    fun i(message: () -> String) = logger.i(message)
    fun i(throwable: Throwable, message: () -> String) = logger.i(throwable, message)
    fun i(message: String) = logger.i(message)
    fun i(message: String, throwable: Throwable) = logger.i(message, throwable)
    fun w(message: () -> String) = logger.w(message)
    fun w(throwable: Throwable, message: () -> String) = logger.w(throwable, message)
    fun w(message: String) = logger.w(message)
    fun w(message: String, throwable: Throwable) = logger.w(message, throwable)
    fun e(message: () -> String) = logger.e(message)
    fun e(throwable: Throwable, message: () -> String) = logger.e(throwable, message)
    fun e(message: String) = logger.e(message)
    fun e(message: String, throwable: Throwable) = logger.e(message, throwable)
    fun a(message: () -> String) = logger.a(message)
    fun a(throwable: Throwable, message: () -> String) = logger.a(throwable, message)
    fun a(message: String) = logger.a(message)
    fun a(message: String, throwable: Throwable) = logger.a(message, throwable)
}
