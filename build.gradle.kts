@file:Suppress("DSL_SCOPE_VIOLATION")

import config.DesktopAppConfig
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

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
        classpath(libs.gradlePlugin.detekt)
    }
}

plugins {
    alias(libs.plugins.rsicarelli.kmplatform)
}

installDefaults(
    desktopAppConfig = DesktopAppConfig(
        mainClass = "app.dreamlightpal.MainKt",
        packageName = "DreamlightPal",
        packageVersion = "1.0.0",
        description = "todo",
        copyright = "© 2023 rsicarelli. All rights reserved.",
        vendor = "rsicarelli",
        resourceRootPath = "a",
        targetFormats = listOf(
            TargetFormat.Dmg,
            TargetFormat.Msi,
            TargetFormat.Deb
        ),
        windowsConfig = DesktopAppConfig.WindowsConfig(
            iconPath = "//todo",
            upgradeUuid = "//todo",
            menuGroup = "DreamlightPal",
            perUserInstall = true
        ),
        macOSConfig = DesktopAppConfig.MacOSConfig(
            iconPath = "//todo",
            bundleID = "app.dreamlightpal",
        ),
        linuxConfig = DesktopAppConfig.LinuxConfig(
            iconPath = "//todo"
        )
    )
)
installDetekt()
