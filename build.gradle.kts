@file:Suppress("DSL_SCOPE_VIOLATION")

buildscript {
    repositories {
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    dependencies {
        classpath(libs.gradlePlugin.android)
        classpath(libs.gradlePlugin.compose)
        classpath(libs.gradlePlugin.kotlin)
    }
}

plugins {
    id("app.dreamlightpal.gradle")
    alias(libs.plugins.arturbosch.detekt)
}

detekt {
    buildUponDefaultConfig = true
    config = files("$projectDir/build-logic/detekt.yml")
}
