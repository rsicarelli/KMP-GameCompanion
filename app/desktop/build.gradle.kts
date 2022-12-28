import decorators.setupDesktopApp

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupDesktopApp(
    dependencyHandler = {
        implementation(compose.dependencies.desktop.currentOs)

        implementation(projects.core.designSystem)
        implementation(projects.core.navigation)
        implementation(projects.feature.root)
        implementation(projects.feature.home)

        implementation(libs.arkivanov.decompose)
        implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
    }
)
