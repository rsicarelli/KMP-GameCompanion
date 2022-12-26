plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.gradlePlugin.kotlin)
    compileOnly(libs.gradlePlugin.detekt)
    compileOnly(libs.gradlePlugin.android)
    compileOnly(libs.gradlePlugin.kotlin.serializer)
    compileOnly(libs.gradlePlugin.compose)
    testCompileOnly(kotlin("test"))
}

gradlePlugin {
    isAutomatedPublishing = false

    with(plugins) {
        register("dreamlightPalPlugin") {
            id = "app.dreamlightpal.gradle"
            implementationClass = "plugins.DreamlightPalPlugin"
        }
    }
}
