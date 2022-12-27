@file:Suppress("UnstableApiUsage")

package decorators

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.setupMultiplatformLibrary(
    compilerArgs: Sequence<String> = sequenceOf(),
    commonMainDependencies: KotlinDependencyHandler.() -> Unit = { },
    androidMainDependencies: KotlinDependencyHandler.() -> Unit = { },
    desktopMainDependencies: KotlinDependencyHandler.() -> Unit = { },
) {
    extensions.configure<KotlinMultiplatformExtension> {
        android()
        jvm("desktop")

        sourceSets {
            named("commonMain") {
                dependencies(commonMainDependencies)
            }
            named("androidMain") {
                dependencies(androidMainDependencies)
            }
            named("desktopMain") {
                dependencies(desktopMainDependencies)
            }

            removeAll { sourceSet ->
                setOf(
                    "androidAndroidTestRelease",
                    "androidTestFixtures",
                    "androidTestFixturesDebug",
                    "androidTestFixturesRelease",
                ).contains(sourceSet.name)
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
