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
    implementation(kotlin("stdlib"))
    implementation(deps.androidGradlePlugin)
    implementation(deps.kotlinGradlePlugin)
    implementation(deps.multiplatformGradlePlugin)
    implementation(deps.detektGradlePlugin)
    implementation(deps.arkivanovGradlePlugin)
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
