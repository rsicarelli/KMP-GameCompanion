@file:Suppress("UnstableApiUsage")

import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    sequenceOf(""),
    commonMainDependencies = {
        api(compose.dependencies.runtime)
        api(compose.dependencies.foundation)
        api(compose.dependencies.material)
        api(compose.dependencies.materialIconsExtended)
    },
    androidMainDependencies = {
        api(libs.androidx.appcompat)
        api(libs.androidx.core)
    },
    desktopMainDependencies = {
        api(compose.dependencies.desktop.common)
    }
)
