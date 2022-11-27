package plugins

import com.android.build.gradle.LibraryExtension
import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import decorators.applyDefaultTargetSdk
import decorators.applyJUnit5
import decorators.applyKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MultiplatformLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.multiplatform")
                apply("com.android.library")
                apply("com.arkivanov.gradle.setup")
            }

            setupMultiplatform {
                android()
                jvm()
                js(IR) { browser() }
                iosCompat()
            }

            extensions.configure<LibraryExtension> {
                applyKotlinAndroid(this)
                applyJUnit5(this)

                buildTypes {
                    defaultConfig {
                        consumerProguardFiles(
                            "proguard-rules.pro",
                            "consumer-rules.pro",
                            "proguard-rules.txt",
                            "proguard.txt"
                        )
                    }
                }

                applyDefaultTargetSdk()

                libraryVariants.all {
                    generateBuildConfig.enabled = false
                }
            }

            extensions.configure<KotlinMultiplatformExtension> {
                setupSourceSets {
                    val android by bundle()
                    val js by bundle()
                    val nonAndroid by bundle()

                    nonAndroid.dependsOn(common)
                    (allSet - android).dependsOn(nonAndroid)

                    common.main.dependencies {}
                    android.main.dependencies {}
                    nonAndroid.main.dependencies {}
                    js.main.dependencies {}
                }
            }
        }
    }
}

fun KotlinMultiplatformExtension.exportIOSFramework(exports: Sequence<Any>) {
    targets
        .asSequence()
        .filterIsInstance<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>()
        .filter { it.konanTarget.family == org.jetbrains.kotlin.konan.target.Family.IOS }
        .forEach {
            it.binaries {
                framework {
                    baseName = "${project.name}-shared"
                    exports.forEach(::export)
                }
            }
        }
}
