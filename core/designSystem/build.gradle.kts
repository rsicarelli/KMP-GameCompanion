@file:Suppress("DSL_SCOPE_VIOLATION")

import config.AndroidConfig.AndroidLibraryConfig
import config.AndroidConfig.AndroidLibraryConfig.BuildFeaturesConfig
import config.ComposeConfig

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    alias(libs.plugins.rsicarelli.kmplatform)
}
installMultiplatformLibrary(
    composeConfig = ComposeConfig(
        runtime = true,
        ui = true
    ),
    androidLibraryConfig = AndroidLibraryConfig(
        buildFeaturesConfig = BuildFeaturesConfig(
            generateAndroidResources = true,
            generateResValues = true,
            generateBuildConfig = true
        )
    ),
    commonMainDependencies = {
        api(libs.rsicarelli.kmplatform.copan)
    }
)
