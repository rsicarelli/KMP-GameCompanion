import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import org.gradle.api.internal.artifacts.dependencies.DefaultDependencyConstraint.strictly
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    id("kotlin-multiplatform")
    id("com.android.library")
    id("kotlin-parcelize")
    id("com.arkivanov.gradle.setup")
}

setupMultiplatform {
    android()
    jvm()
    js(IR) { browser() }
    iosCompat(
        arm64 = null, // Comment out to enable arm64 target
    )
}

kotlin {
    targets
        .filterIsInstance<KotlinNativeTarget>()
        .filter { it.konanTarget.family == Family.IOS }
        .forEach {
            it.binaries {
                framework {
                    baseName = "Shared"
                    export(deps.jetbrains.kotlinx.kotlinxCoroutinesCore)
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
        }

        android.main.dependencies {}

        nonAndroid.main.dependencies {}

        js.main.dependencies {
            implementation(project.dependencies.enforcedPlatform(deps.jetbrains.kotlinWrappers.kotlinWrappersBom.get()))
        }
    }
}
