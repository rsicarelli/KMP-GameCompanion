@file:Suppress("UnstableApiUsage")

import decorators.setupMultiplatformLibrary

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupMultiplatformLibrary()

