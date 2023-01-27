@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
    alias(libs.plugins.rsicarelli.kmplatform)
}

installAndroidApp()
//
//dependencies {
//    implementation(projects.core.collection)
//    implementation(projects.core.designSystem)
//    implementation(libs.rsicarelli.kmplatform.logger)
//    implementation(libs.rsicarelli.kmplatform.threading)
//
//    implementation(projects.feature.home)
//    implementation(projects.feature.list)
//    implementation(projects.feature.detail)
//
//    implementation(libs.androidx.core)
//    implementation(libs.androidx.activity.compose)
//    implementation(libs.kodein.di)
//    implementation(libs.kodein.di.framework.compose)
//    implementation(libs.arkivanov.decompose)
//    implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
//}
