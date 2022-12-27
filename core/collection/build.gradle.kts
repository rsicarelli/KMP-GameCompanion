@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    alias(libs.plugins.squareup.sqldelight)
    alias(libs.plugins.jetbrains.kotlin.serialization)
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        implementation(libs.squareup.sqldelight.runtime)
        implementation(libs.squareup.sqldelight.extension.coroutines)
        implementation(libs.jetbrains.kotlinx.serialization.json)

        compileOnly(projects.core.logger)
    },
    androidMainDependencies = {
        implementation(libs.squareup.sqldelight.driver.android)
    },
    desktopMainDependencies = {
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

