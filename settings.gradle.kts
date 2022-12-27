@file:Suppress("UnstableApiUsage")

import org.gradle.api.internal.FeaturePreviews.Feature.TYPESAFE_PROJECT_ACCESSORS

enableFeaturePreview(TYPESAFE_PROJECT_ACCESSORS.name)

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    includeBuild("build-logic")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

private object ProjectDefaults {

    const val name: String = "DreamlightPal"
    val appModules = sequenceOf(
        "android", "desktop"
    ).map { ":app:$it" }.asIterable()

    val coreModules = sequenceOf(
        "collection", "designSystem",
        "logger", "threading", "navigation"
    ).map { ":core:$it" }.asIterable()

    val featureModules = sequenceOf(
        "home", "root"
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
    rootDir.run {
        sharedFiles.forEach { path ->
            resolve(path).copyTo(
                rootDir.resolve("build-logic").resolve(path),
                overwrite = true
            )
        }
    }
    include(appModules)
    include(coreModules)
    include(featureModules)
}
