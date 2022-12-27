import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("kotlin-parcelize")

    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        compileOnly(projects.core.designSystem)
        compileOnly(libs.arkivanov.decompose)
        compileOnly(libs.arkivanov.decompose.extensions.compose.jetbrains)
        compileOnly(projects.core.threading)
    }
)
