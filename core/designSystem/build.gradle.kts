import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    sequenceOf(""),
    commonMainDependencies = {
        @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
        api(compose.dependencies.material3)
    }
)
