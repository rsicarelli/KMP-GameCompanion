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
    }
)
