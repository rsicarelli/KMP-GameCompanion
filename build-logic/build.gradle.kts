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
    compileOnly(kotlin("stdlib"))
    compileOnly(deps.androidGradlePlugin)
    implementation(deps.kotlinGradlePlugin)
    compileOnly(deps.detektGradlePlugin)
    implementation(deps.arkivanovGradlePlugin)
}

gradlePlugin {
    plugins.register("rootProject") {
        id = "app.dreamlight.root"
        implementationClass = "plugins.RootProjectPlugin"
    }
}
