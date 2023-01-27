@file:Suppress("DSL_SCOPE_VIOLATION")

import config.DesktopAppConfig


plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    alias(libs.plugins.rsicarelli.kmplatform)
}

group = "app.dreamlighpal"

installDesktopApp(
    jvmDependencyHandler = {
        implementation(compose.dependencies.desktop.currentOs)

        implementation(projects.core.collection)
        implementation(projects.core.designSystem)
        implementation(libs.rsicarelli.kmplatform.logger)
        implementation(libs.rsicarelli.kmplatform.threading)

        implementation(projects.feature.home)
        implementation(projects.feature.list)
        implementation(projects.feature.detail)

        implementation(libs.kodein.di)
        implementation(libs.kodein.di.framework.compose)
        implementation(libs.arkivanov.decompose)
        implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
