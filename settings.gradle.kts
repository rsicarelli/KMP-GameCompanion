@file:Suppress("UnstableApiUsage")

enableFeaturePreview(org.gradle.api.internal.FeaturePreviews.Feature.VERSION_CATALOGS.name)
enableFeaturePreview(org.gradle.api.internal.FeaturePreviews.Feature.TYPESAFE_PROJECT_ACCESSORS.name)

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
        google()
    }
    includeBuild("build-logic")
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            from(files("deps.versions.toml"))
        }
    }
}

with(DreamlightPalProjectDefaults) {
    rootProject.name = ProjectName
    rootDir.copyGradleToCompositeBuild()

    //    AppModules.forEach { include(":app:$it") }
    CoreModules.forEach { include(":core:$it") }
}

private object DreamlightPalProjectDefaults {

    const val ProjectName = "DreamlightPal"

    //    val AppModules = sequenceOf("")
    val CoreModules = sequenceOf(
        "logger:api",
        "collection:api",
        "collection:impl",
        "collection:fake",
        "module-provider:api",
        "threading:api",
        "threading:impl",
        "test:core",
        "test:unit"
    )
    val FeatureModules = sequenceOf<String>()
}

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
