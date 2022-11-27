import com.arkivanov.gradle.setupSourceSets
import plugins.exportIOSFramework

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

kotlin {
    val sharedDeps = sequenceOf(deps.koin.core)

    exportIOSFramework(sharedDeps)

    setupSourceSets {
        common.main.dependencies { sharedDeps.forEach(::api) }
    }
}
