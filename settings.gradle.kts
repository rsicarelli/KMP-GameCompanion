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

rootProject.name = "DreamlightPal"
rootDir.copyGradleToCompositeBuild()

include(":app:desktop", ":app:android")
include(":core:threading", ":core:designSystem", ":core:collection", ":core:logger")

/**
 * Sharing gradle.properties between composite builds avoids creating an extra daemon,
 * saving memory RAM during development.
 *
 * If the content of the gradle.properties files are different, daemons are incompatible and will make
 * the IDE to try to sync the host project.
 *
 * Ideally root gradle.properties should be passed for composite builds, but it is not the case
 * issue link: https://github.com/gradle/gradle/issues/2534
 * */
fun File.copyGradleToCompositeBuild(
    compositeBuildPath: String = "build-logic",
    gradleFilePaths: Sequence<String> = sequenceOf(
        "gradle.properties", "gradlew.bat", "gradlew",
        "gradle/wrapper/gradle-wrapper.jar",
        "gradle/wrapper/gradle-wrapper.properties"
    ),
    override: Boolean = true,
) = gradleFilePaths.forEach { path ->
    resolve(path)
        .copyTo(
            target = rootDir.resolve(compositeBuildPath).resolve(path),
            overwrite = override
        )
}
