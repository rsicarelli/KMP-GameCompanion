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
    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core)
    implementation(projects.core.designSystem)
}
