@file:Suppress("UnstableApiUsage")

import Settings_gradle.ProjectDefaults.VersionCatalogModule
import Settings_gradle.ProjectDefaults.VersionCatalogName
import org.gradle.api.internal.FeaturePreviews.Feature.TYPESAFE_PROJECT_ACCESSORS

enableFeaturePreview(TYPESAFE_PROJECT_ACCESSORS.name)

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
    }

    versionCatalogs {
        create(VersionCatalogName).from(VersionCatalogModule)
    }
}

private object ProjectDefaults {

    const val name: String = "DreamlightPal"
    private const val VersionCatalogVersion = "0.1"
    const val VersionCatalogModule = "com.rsicarelli.kmplatform:versioncatalog:$VersionCatalogVersion"
    const val VersionCatalogName = "libs"

    val appModules = sequenceOf(
        "android", "desktop"
    ).map { ":app:$it" }.asIterable()

    val coreModules = sequenceOf(
        "collection",
        "designSystem",
    ).map { ":core:$it" }.asIterable()

    val featureModules = sequenceOf(
        "home", "list", "detail"
    ).map { ":feature:$it" }.asIterable()

    val sharedFiles = sequenceOf(
        "gradle.properties", "gradlew",
        "gradlew.txt", "gradlew.bat",
        "gradle/wrapper/gradle-wrapper.jar",
        "gradle/wrapper/gradle-wrapper.properties"
    )
}

with(ProjectDefaults) {
    rootProject.name = name
        include(appModules)
    include(coreModules)
        include(featureModules)
}
