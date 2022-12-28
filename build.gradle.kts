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

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

detekt {
    buildUponDefaultConfig = true
    config = files("$projectDir/build-logic/detekt.yml")
}
