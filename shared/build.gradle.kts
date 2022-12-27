@file:Suppress("UnstableApiUsage")

import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
    id("org.jetbrains.kotlin.plugin.serialization")
}

setupMultiplatformLibrary(
    sequenceOf(""),
    commonMainDependencies = {
        implementation(kotlin("stdlib-common"))

        api(compose.dependencies.runtime)
        api(compose.dependencies.foundation)
        api(compose.dependencies.material)
        api(compose.dependencies.materialIconsExtended)
        api(libs.jetbrains.kotlinx.serialization.json)
        api(libs.touchlab.kermit)
    },
    androidMainDependencies = {
        api(libs.androidx.appcompat)
        api(libs.androidx.core)
    },
    desktopMainDependencies = {
        api(compose.dependencies.desktop.common)
    }
)

