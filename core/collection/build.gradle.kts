@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    alias(libs.plugins.squareup.sqldelight)
    alias(libs.plugins.jetbrains.kotlin.serialization)
    alias(libs.plugins.rsicarelli.kmplatform)
}

installMultiplatformLibrary(
    commonMainDependencies = {
        implementation(libs.squareup.sqldelight.runtime)
        implementation(libs.squareup.sqldelight.extension.coroutines)
        implementation(libs.jetbrains.kotlinx.serialization.json)
        implementation(libs.jetbrains.kotlinx.serialization.json.okio)
        implementation(libs.squareup.okio)

        compileOnly(libs.kodein.di)
        compileOnly(libs.rsicarelli.kmplatform.logger)
        compileOnly(libs.rsicarelli.kmplatform.threading)
    },
    androidMainDependencies = {
        implementation(libs.squareup.sqldelight.driver.android)
        compileOnly(libs.kodein.di.framework.android.x)
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

