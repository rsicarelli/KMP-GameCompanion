import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("kotlin-parcelize")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    enableCompose = true,
    commonMainDependencies = {
        compileOnly(projects.core.designSystem)
        compileOnly(projects.feature.list)
        compileOnly(projects.feature.detail)
        compileOnly(libs.arkivanov.decompose)
        compileOnly(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
