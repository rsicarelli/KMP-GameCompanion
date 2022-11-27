import com.arkivanov.gradle.setupSourceSets

plugins {
    id("app.dreamlightpal.multiplatform.library")
    id("app.dreamlightpal.multiplatform.coroutines")
    id("app.dreamlightpal.multiplatform.serialization")
}

kotlin {
    setupSourceSets {
        common.main.dependencies {
            implementation(projects.core.collection.api)
            implementation(projects.core.logger.api)
            implementation(projects.core.moduleProvider.api)
            implementation(projects.core.threading.api)

            implementation(deps.jetbrains.kotlinx.serialization.json)
        }
    }
}
