@file:Suppress("DSL_SCOPE_VIOLATION")

import config.ComposeConfig

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("kotlin-parcelize")
    alias(libs.plugins.rsicarelli.kmplatform)
}

installMultiplatformLibrary(
    composeConfig = ComposeConfig(
        runtime = true,
        ui = true
    ),
    commonMainDependencies = {
        compileOnly(projects.core.designSystem)
        compileOnly(libs.kodein.di)
        compileOnly(libs.arkivanov.decompose)
        compileOnly(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
