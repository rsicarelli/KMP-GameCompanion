import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        api(libs.jetbrains.kotlinx.coroutines.core)
        compileOnly(libs.koin.core)
    }
)
