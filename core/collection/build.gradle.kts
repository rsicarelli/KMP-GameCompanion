@file:Suppress("DSL_SCOPE_VIOLATION")

import config.AndroidConfig

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    alias(libs.plugins.rsicarelli.kmplatform)
    alias(libs.plugins.squareup.sqldelight)
    alias(libs.plugins.jetbrains.kotlin.serialization)
}

installMultiplatformLibrary(
    androidLibraryConfig = AndroidConfig.AndroidLibraryConfig(
        buildFeaturesConfig = AndroidConfig.AndroidLibraryConfig.BuildFeaturesConfig(
            true, true, true
        )
    ),
    commonMainDependencies = {
//        implementation(libs.squareup.sqldelight.runtime)
//        implementation(libs.squareup.sqldelight.extension.coroutines)
//        implementation(libs.jetbrains.kotlinx.serialization.json)
//        implementation(libs.jetbrains.kotlinx.serialization.json.okio)
//        implementation(libs.squareup.okio)
//
//        implementation(libs.kodein.di)
//        compileOnly(libs.rsicarelli.kmplatform.logger)
//        compileOnly(libs.rsicarelli.kmplatform.threading)
    },
    androidMainDependencies = {
//        implementation(libs.squareup.sqldelight.driver.android)
//        implementation(libs.kodein.di.framework.android.x)
    },
    desktopMainDependencies = {
//        implementation(libs.squareup.sqldelight.driver.jvm)
    }
)
//
//sqldelight {
//    database(
//        name = "DreamlightPal",
//        config = {
//            packageName = "app.dreamlightpal"
//        }
//    )
//}
//
