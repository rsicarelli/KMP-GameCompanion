import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    enableCompose = true,
    commonMainDependencies = {
        @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
        api(compose.dependencies.material3)
    },
    androidMainDependencies = {
        api(libs.androidx.core)
    },
    desktopMainDependencies = {
        api(compose.dependencies.desktop.common)
    }
)
