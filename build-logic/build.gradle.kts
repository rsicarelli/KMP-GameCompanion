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
    implementation(Deps.KotlinGradlePlugin)
    implementation(Deps.DetektGradlePlugin)
    implementation(Deps.AndroidGradlePlugin)
    implementation(Deps.ArkivanovGradlePlugin)
    implementation(Deps.KotlinSerializationPlugin)
    implementation(Deps.KmpNativeCoroutinesGradlePlugin)
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

    private const val agpVersion: String = "7.2.2"
    const val AndroidGradlePlugin: String = "com.android.tools.build:gradle:${agpVersion}"

    private const val detektVersion: String = "1.21.0-RC2"
    const val DetektGradlePlugin: String = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${detektVersion}"

    private const val kotlinVersion: String = "1.7.21"
    const val KotlinGradlePlugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}"
    const val KotlinSerializationPlugin: String = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"

    private const val arkivanovGradlePluginVersion: String = "60ac46054c"
    const val ArkivanovGradlePlugin: String =
        "com.github.arkivanov.gradle-setup-plugin:com.arkivanov.gradle.setup.gradle.plugin:${arkivanovGradlePluginVersion}"

    private const val KmpCoroutines: String = "0.13.2"
    const val KmpNativeCoroutinesGradlePlugin: String =
        "com.rickclephas.kmp.nativecoroutines:com.rickclephas.kmp.nativecoroutines.gradle.plugin:$KmpCoroutines"

}
