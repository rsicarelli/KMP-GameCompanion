@file:Suppress("UnstableApiUsage")

package decorators

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.compose
import org.gradle.api.libs
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.invoke
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

fun Project.setupMultiplatformLibrary() {
    extensions.configure<KotlinMultiplatformExtension> {
        android()
        jvm("desktop")

        sourceSets {
            named("commonMain") {
                dependencies {
                    api(compose.dependencies.runtime)
                    api(compose.dependencies.foundation)
                    api(compose.dependencies.material)
                    api(compose.dependencies.materialIconsExtended)
                }
            }
            named("androidMain") {
                dependencies {
                    api(libs.findLibrary("androidx-appcompat").get())
                    api(libs.findLibrary("androidx-core").get())
                }
            }
            named("desktopMain") {
                dependencies {
                    api(compose.dependencies.desktop.common)
                }
            }
        }
    }

    extensions.configure<LibraryExtension> {
        compileSdk = 33

        defaultConfig {
            minSdk = 26
            targetSdk = 33
        }

        sourceSets {
            named("main") {
                manifest.srcFile("src/androidMain/AndroidManifest.xml")
                res.srcDirs("src/androidMain/res", "src/commonMain/resources")
            }
        }

        lint {
            abortOnError = false
        }

        libraryVariants.all {
            buildTypes {
                defaultConfig {
                    consumerProguardFiles("proguard-rules.pro", "consumer-rules.pro")
                }
            }
            generateBuildConfigProvider.get().enabled = false
        }
    }
}
