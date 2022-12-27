import decorators.setupDesktopApp

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("app.dreamlightpal.gradle")
}

setupDesktopApp()
