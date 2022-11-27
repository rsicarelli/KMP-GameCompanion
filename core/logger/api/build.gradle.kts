
import com.arkivanov.gradle.setupSourceSets

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

kotlin {
    setupSourceSets {
        common.main.dependencies { implementation(deps.kermit) }
    }
}
