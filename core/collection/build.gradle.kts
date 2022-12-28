import decorators.setupMultiplatformLibrary

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("app.dreamlightpal.gradle")
    alias(libs.plugins.squareup.sqldelight)
    alias(libs.plugins.jetbrains.kotlin.serialization)
}

setupMultiplatformLibrary(
    commonMainDependencies = {
        implementation(libs.squareup.sqldelight.runtime)
        implementation(libs.squareup.sqldelight.extension.coroutines)
        implementation(libs.jetbrains.kotlinx.serialization.json)

        compileOnly(libs.kodein.di)

        compileOnly(projects.core.threading)
        compileOnly(projects.core.logger)
    },
    androidMainDependencies = {
        implementation(libs.squareup.sqldelight.driver.android)
        compileOnly(libs.kodein.di.framework.android.x)
    },
    desktopMainDependencies = {
        implementation(libs.squareup.sqldelight.driver.jvm)
    }
)

sqldelight {
    database(
        name = "DreamlightPal",
        config = {
            packageName = "app.dreamlightpal"
        }
    )
}

