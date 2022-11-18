import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import org.gradle.api.internal.artifacts.dependencies.DefaultDependencyConstraint.strictly
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

kotlin {
    setupSourceSets {
        common.main.dependencies {
            implementation(deps.jetbrains.kotlinx.kotlinxCoroutinesCore)
            implementation(deps.jetbrains.kotlinx.serialzation.json)
            implementation(projects.core.logger.api)
            implementation(projects.core.collection.api)
        }
    }
}
