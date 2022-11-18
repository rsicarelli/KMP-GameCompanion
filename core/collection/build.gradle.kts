import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import org.gradle.api.internal.artifacts.dependencies.DefaultDependencyConstraint.strictly
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("kotlin-parcelize")
    kotlin("plugin.serialization") version "1.7.21"
    id("com.arkivanov.gradle.setup")
}

setupMultiplatform {
    android()
    jvm()
    js(IR) { browser() }
    iosCompat()
}

kotlin {
    targets
        .asSequence()
        .filterIsInstance<KotlinNativeTarget>()
        .filter { it.konanTarget.family == Family.IOS }
        .forEach {
            it.binaries {
                framework {
                    baseName = "Shared"
                    export(deps.jetbrains.kotlinx.kotlinxCoroutinesCore)
                    export(deps.jetbrains.kotlinx.serialzation.json)
                }
            }
        }

    setupSourceSets {
        val android by bundle()
        val js by bundle()
        val nonAndroid by bundle()

        nonAndroid.dependsOn(common)
        (allSet - android).dependsOn(nonAndroid)

        common.main.dependencies {
            implementation(deps.jetbrains.kotlinx.kotlinxCoroutinesCore)
            implementation(deps.jetbrains.kotlinx.serialzation.json)
            implementation(projects.core.logger)
        }

        android.main.dependencies {}

        nonAndroid.main.dependencies {}

        js.main.dependencies {
            implementation(project.dependencies.enforcedPlatform(deps.jetbrains.kotlinWrappers.kotlinWrappersBom.get()))
        }
    }
}
