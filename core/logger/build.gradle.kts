import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        implementation(kotlin("stdlib-common"))
        api(libs.touchlab.kermit)
    }
)
