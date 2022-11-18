plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven("https://jitpack.io")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(Deps.androidGradlePlugin)
    implementation(Deps.kotlinGradlePlugin)
    implementation(Deps.arkivanovGradlePlugin)
    implementation(Deps.detektGradlePlugin)
}

gradlePlugin {
    plugins.register("rootProject") {
        id = "app.dreamlightpal.root"
        implementationClass = "plugins.RootProjectPlugin"
    }
    plugins.register("multiplatformLibrary") {
        id = "app.dreamlightpal.multiplatform.library"
        implementationClass = "plugins.MultiplatformLibraryPlugin"
    }
}

object Deps {

    private const val AndroidGradlePluginVersion: String = "7.2.2"
    const val androidGradlePlugin: String = "com.android.tools.build:gradle:${AndroidGradlePluginVersion}"

    private const val DetektGradlePluginVersion: String = "1.21.0-RC2"
    const val detektGradlePlugin: String =
        "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${DetektGradlePluginVersion}"

    private const val KotlinVersion: String = "1.7.21"
    const val kotlinGradlePlugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVersion}"

    private const val ArkivanovGradlePlugin: String = "60ac46054c"
    const val arkivanovGradlePlugin: String =
        "com.github.arkivanov.gradle-setup-plugin:com.arkivanov.gradle.setup.gradle.plugin:${ArkivanovGradlePlugin}"
}