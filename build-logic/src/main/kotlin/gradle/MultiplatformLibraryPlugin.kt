@file:Suppress("UnstableApiUsage")

package gradle

import applyJvmTarget
import com.android.build.gradle.LibraryExtension
import decorators.applyDefaultTargetSdk
import decorators.applyJUnit5
import decorators.applyKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.jvm.KotlinJvmTarget

@Suppress("unused") // Invoked reflectively by Gradle.
class MultiplatformLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            plugins.apply("com.android.library")
            plugins.apply("org.jetbrains.kotlin.multiplatform")

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
            }

            plugins.withId("org.jetbrains.kotlin.multiplatform") {
                extensions.configure(KotlinMultiplatformExtension::applyTargets)
            }

            plugins.withId("com.android.library") {
                extensions.configure<LibraryExtension> {
                    libraryVariants.all {
                        generateBuildConfig.enabled = false
                    }

                    sourceSets.getByName("main").manifest.srcFile("src/androidMain/AndroidManifest.xml")
                    sourceSets.configureEach {
                        setRoot("src/android${name.capitalized()}")
                    }
                }
            }
        }
    }
}

private fun KotlinMultiplatformExtension.applyTargets() {
    android()
    jvm("desktop", KotlinJvmTarget::applyJvmTarget)
}

