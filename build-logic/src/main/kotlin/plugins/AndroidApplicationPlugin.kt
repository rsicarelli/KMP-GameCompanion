package plugins

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
//import decorators.applyCompose
import decorators.applyDefaultTargetSdk
import decorators.applyJUnit5
import decorators.applyKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

@Suppress("unused") // Invoked reflectively by Gradle.
class AndroidApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<BaseAppModuleExtension> {
                applyKotlinAndroid(this)
//                applyCompose(this)
                applyJUnit5(this)
                applyDefaultTargetSdk()
            }
        }
    }
}
