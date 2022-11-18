@file:Suppress("UnstableApiUsage")

package decorators

import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import decorators.KotlinAndroidDefaults.CompileSdk
import decorators.KotlinAndroidDefaults.MinSdk
import decorators.KotlinAndroidDefaults.TargetSdk
import defaultCompileOptions
import defaultJvmOptions
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

/**
 * Applies the standard way for setting up a Kotlin Android target
 */
internal fun Project.applyKotlinAndroid(
    commonExtension: CommonExtension<*, *, *, *>,
) {
    val project = this

    commonExtension.apply {
        compileSdk = CompileSdk

        buildFeatures {
            buildConfig = true
        }

        defaultConfig {
            minSdk = MinSdk
        }

        defaultCompileOptions()

        extensions.configure<KotlinJvmOptions> {
            defaultJvmOptions(project)
        }
    }
}

internal fun BaseAppModuleExtension.applyDefaultTargetSdk() {
    defaultConfig.targetSdk = TargetSdk
}

internal fun LibraryExtension.applyDefaultTargetSdk() {
    defaultConfig.targetSdk = TargetSdk
}

private object KotlinAndroidDefaults {

    const val CompileSdk = 33
    const val MinSdk = 23
    const val TargetSdk = 33
}
