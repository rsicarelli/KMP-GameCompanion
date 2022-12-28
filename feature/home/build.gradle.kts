import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("kotlin-parcelize")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        implementation(projects.core.designSystem)
        implementation(projects.core.navigation)
        implementation(projects.feature.list)
        implementation(projects.feature.detail)
        implementation(libs.arkivanov.decompose)
        implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
