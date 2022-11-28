package plugins

import com.arkivanov.gradle.AndroidConfig
import com.arkivanov.gradle.ensureUnreachableTasksDisabled
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.macosCompat
import com.arkivanov.gradle.setupDefaults
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.the
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

class RootProjectPlugin : Plugin<Project> {

    override fun apply(target: Project): Unit = with(target) {
        setupDefaults(
            multiplatformConfigurator = {
                android()
                jvm()
                js(BOTH) { browser() }
                iosCompat()
                macosCompat()
            },
            androidConfig = AndroidConfig(
                minSdkVersion = 21,
                compileSdkVersion = 33,
                targetSdkVersion = 33,
            ),
        )

        ensureUnreachableTasksDisabled()

        allprojects {
            repositories {
                mavenCentral()
                google()
                maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
            }
        }

        // Workaround for https://youtrack.jetbrains.com/issue/KT-49109 until Kotlin 1.6.20
        plugins.withType<NodeJsRootPlugin> {
            the<NodeJsRootExtension>().nodeVersion = "16.0.0"
        }
    }
}
