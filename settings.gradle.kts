import org.gradle.api.internal.FeaturePreviews.Feature.TYPESAFE_PROJECT_ACCESSORS
import org.gradle.api.internal.FeaturePreviews.Feature.VERSION_CATALOGS

enableFeaturePreview(VERSION_CATALOGS.name)
enableFeaturePreview(TYPESAFE_PROJECT_ACCESSORS.name)

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            from(files("deps.versions.toml"))
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.toString() == "com.arkivanov.gradle.setup") {
                useModule("com.github.arkivanov:gradle-setup-plugin:60ac46054c")
            }
        }
    }

    plugins {
        id("com.arkivanov.gradle.setup")
    }
}

include(":collection")
