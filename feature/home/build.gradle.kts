import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        implementation(projects.core.designSystem)
        implementation(projects.core.navigation)
        implementation(libs.arkivanov.decompose)
        implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
