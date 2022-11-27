package plugins

import configureJava
import configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused") // Invoked reflectively by Gradle.
class KotlinLibraryPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            with(pluginManager) {
                apply("java-library")
                apply("org.jetbrains.kotlin.jvm")
            }
            configureJava()
            configureKotlinJvm()
        }
    }
}
