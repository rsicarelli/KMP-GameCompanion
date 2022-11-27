package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class SerializationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")
    }
}
