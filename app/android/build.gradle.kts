import decorators.configureAndroidApp

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

configureAndroidApp(
    applicationId = "app.dreamlightpal",
    versionCode = 1,
    versionName = "1.0.0"
)

dependencies {
    implementation(projects.core.collection)
    implementation(projects.core.designSystem)
    implementation(projects.core.logger)
    implementation(projects.core.navigation)
    implementation(projects.core.threading)

    implementation(projects.feature.home)
    implementation(projects.feature.list)
    implementation(projects.feature.detail)

    implementation(libs.arkivanov.decompose)
    implementation(libs.arkivanov.decompose.extensions.compose.jetbrains)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core)
}
