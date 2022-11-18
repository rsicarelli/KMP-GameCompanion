package plugins

import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

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
