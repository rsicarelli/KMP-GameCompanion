@file:Suppress("UnstableApiUsage")

enableFeaturePreview(org.gradle.api.internal.FeaturePreviews.Feature.VERSION_CATALOGS.name)

rootProject.name = "build-logic"

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            from(files("../deps.versions.toml"))
        }
    }
}
