import com.arkivanov.gradle.setupSourceSets

plugins {
    id("app.dreamlightpal.multiplatform.library")
    id("app.dreamlightpal.multiplatform.coroutines")
}

kotlin {
    setupSourceSets {
        common.main.dependencies {
            implementation(projects.core.threading.api)
            implementation(projects.core.moduleProvider.api)
        }
    }
}
