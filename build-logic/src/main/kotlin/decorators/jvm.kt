import KotlinAndroidDefaults.DefaultJavaVersion
import KotlinAndroidDefaults.DefaultKotlinJvmTarget
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.targets.jvm.KotlinJvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureJava(javaVersion: JavaVersion = DefaultJavaVersion) {
    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }
}


internal fun Project.configureKotlinJvm() {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            defaultJvmOptions(this@configureKotlinJvm)
        }
    }
}

internal fun KotlinJvmTarget.applyJvmTarget() {
    compilations.all {
        kotlinOptions.jvmTarget = DefaultKotlinJvmTarget
    }
}

@Suppress("UnstableApiUsage")
internal fun CommonExtension<*, *, *, *>.defaultCompileOptions() = compileOptions {
    sourceCompatibility = DefaultJavaVersion
    targetCompatibility = DefaultJavaVersion
}

internal fun KotlinJvmOptions.defaultJvmOptions(project: Project) {
    allWarningsAsErrors = project.properties["warningsAsErrors"] as? Boolean ?: false

    freeCompilerArgs = freeCompilerArgs + listOf(
        "-opt-in=kotlin.RequiresOptIn",
        // Enable experimental coroutines APIs, including Flow
        "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        "-opt-in=kotlinx.coroutines.FlowPreview",
        "-opt-in=kotlin.Experimental",
    )
    jvmTarget = DefaultKotlinJvmTarget
}


private object KotlinAndroidDefaults {

    val DefaultJavaVersion = JavaVersion.VERSION_11
    val DefaultKotlinJvmTarget = JavaVersion.VERSION_11.toString()
}
