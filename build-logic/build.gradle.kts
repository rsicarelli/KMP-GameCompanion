plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
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
    implementation(Deps.kotlinSerializationPlugin)
    implementation(Deps.arkivanovGradlePlugin)
    implementation(Deps.detektGradlePlugin)
    implementation(Deps.kmpCoroutinesGradlePlugin)
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
    plugins.register("multiplatformCoroutines") {
        id = "app.dreamlightpal.multiplatform.coroutines"
        implementationClass = "plugins.MultiplatformCoroutinesPlugin"
    }
    plugins.register("serializationPlugin") {
        id = "app.dreamlightpal.multiplatform.serialization"
        implementationClass = "plugins.SerializationPlugin"
    }
}

/**
 * Gradle doesn't support multiple version catalogue in the same project
 * https://github.com/gradle/gradle/issues/20383
 * */
object Deps {

    private const val AndroidGradlePluginVersion: String = "7.2.2"
    const val androidGradlePlugin: String = "com.android.tools.build:gradle:${AndroidGradlePluginVersion}"

    private const val DetektGradlePluginVersion: String = "1.21.0-RC2"
    const val detektGradlePlugin: String =
        "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${DetektGradlePluginVersion}"

    private const val KotlinVersion: String = "1.7.21"
    const val kotlinGradlePlugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVersion}"
    const val kotlinSerializationPlugin: String =
        "org.jetbrains.kotlin:kotlin-serialization:${Build_gradle.Deps.KotlinVersion}"

    private const val ArkivanovGradlePlugin: String = "60ac46054c"
    const val arkivanovGradlePlugin: String =
        "com.github.arkivanov.gradle-setup-plugin:com.arkivanov.gradle.setup.gradle.plugin:${ArkivanovGradlePlugin}"

    private const val KmpCoroutines: String = "0.13.2"
    const val kmpCoroutinesGradlePlugin: String =
        "com.rickclephas.kmp.nativecoroutines:com.rickclephas.kmp.nativecoroutines.gradle.plugin:$KmpCoroutines"

}
