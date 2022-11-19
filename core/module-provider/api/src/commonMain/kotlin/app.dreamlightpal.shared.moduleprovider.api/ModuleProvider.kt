package app.dreamlightpal.shared.moduleprovider.api

import org.koin.core.module.Module

interface ModuleProvider {

    fun get(): Module
}
