import com.arkivanov.gradle.setupSourceSets

plugins {
    id("app.dreamlightpal.multiplatform.library")
    id("app.dreamlightpal.multiplatform.coroutines")
    id("app.dreamlightpal.multiplatform.serialization")
}

kotlin {
    setupSourceSets {
        common.main.dependencies {
            implementation(deps.jetbrains.kotlinx.serialization.json)
        }
    }
}
