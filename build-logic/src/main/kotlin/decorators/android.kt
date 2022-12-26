@file:Suppress("UnstableApiUsage")

package decorators

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

internal fun Project.configureAndroidLibrary() {
    configureAndroidCommon()

    extensions.configure<LibraryExtension> {
        libraryVariants.all {
            buildTypes {
                defaultConfig {
                    consumerProguardFiles("proguard-rules.pro", "consumer-rules.pro")
                }
            }
            generateBuildConfigProvider.get().enabled = false
        }
        lint { abortOnError = false }

        sourceSets {
            named("main") {
                manifest.srcFile("src/androidMain/AndroidManifest.xml")
                res.srcDirs("src/androidMain/res", "src/commonMain/resources")
            }
        }
    }
}

fun Project.configureAndroidApp(
    applicationId: String,
    versionCode: Int,
    versionName: String,
) {
    configureAndroidCommon()

    extensions.configure<BaseAppModuleExtension> {
        defaultConfig {
            this.applicationId = applicationId
            this.versionCode = versionCode
            this.versionName = versionName
        }

        lint { abortOnError = false }
    }
}

private fun Project.configureAndroidCommon(
    sourceSet: String = "android",
) {
    extensions.configure<BaseExtension> {
        namespace = "app.dreamlightpal.${project.name}"

        compileSdkVersion(33)

        defaultConfig {
            minSdk = 26
            targetSdk = 33
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
    }

}
