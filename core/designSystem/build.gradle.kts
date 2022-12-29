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
        implementation(compose.dependencies.material3)
    },
    androidMainDependencies = {
        implementation(libs.coil.compose)
    },
    desktopMainDependencies = {
        implementation(libs.load.the.image)
    },
)
