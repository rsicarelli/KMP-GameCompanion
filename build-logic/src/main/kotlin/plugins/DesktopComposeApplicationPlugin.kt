package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories

class DesktopComposeApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("org.jetbrains.compose")
                apply("org.jetbrains.kotlin.jvm")
            }

            repositories {
                mavenCentral()
                maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
                google()
            }


//            extensions.configure<> {
//                setupSourceSets {
//                    val android by bundle()
//                    val js by bundle()
//                    val nonAndroid by bundle()
//
//                    nonAndroid.dependsOn(common)
//                    (allSet - android).dependsOn(nonAndroid)
//
//                    common.main.dependencies {}
//                    android.main.dependencies {}
//                    nonAndroid.main.dependencies {}
//                    js.main.dependencies {}
//                }
//            }
//            dependencies {
//
//                implementation(compose.desktop.currentOs)
//            }
        }
    }
}
