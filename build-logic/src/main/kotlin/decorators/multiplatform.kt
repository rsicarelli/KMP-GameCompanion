@file:Suppress("UnstableApiUsage")

package decorators

import org.gradle.api.Project
import org.gradle.api.compose
import org.gradle.api.libs
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.setupMultiplatformLibrary(
    compilerArgs: Sequence<String>,
) {
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

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            allWarningsAsErrors = false
            jvmTarget = "11"
        }
    }

    configureAndroidLibrary()
    configureTest()
}
