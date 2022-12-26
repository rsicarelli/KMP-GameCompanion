@file:Suppress("UnstableApiUsage")

rootProject.name = "build-logic"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
