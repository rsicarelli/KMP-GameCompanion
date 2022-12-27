@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
    id("org.jetbrains.kotlin.plugin.serialization")
    alias(libs.plugins.squareup.sqldelight)
}

setupMultiplatformLibrary(
    sequenceOf(""),
    commonMainDependencies = {
        implementation(kotlin("stdlib-common"))
        implementation(libs.squareup.sqldelight.runtime)
        implementation(libs.squareup.sqldelight.extension.coroutines)

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
        implementation(libs.squareup.sqldelight.driver.android)
    },
    desktopMainDependencies = {
        api(compose.dependencies.desktop.common)
        implementation(libs.squareup.sqldelight.driver.jvm)
    }
)

sqldelight {
    database(
        name = "DreamlightPal",
        config = {
            packageName = "app.dreamlightpal"
        }
    )
}

