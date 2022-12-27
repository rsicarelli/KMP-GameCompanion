import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        compileOnly(projects.core.designSystem)
        compileOnly(projects.core.navigation)
        compileOnly(libs.arkivanov.decompose)
        compileOnly(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
