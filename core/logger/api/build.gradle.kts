import com.arkivanov.gradle.setupSourceSets
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

kotlin {
    targets
        .asSequence()
        .filterIsInstance<KotlinNativeTarget>()
        .filter { it.konanTarget.family == Family.IOS }
        .forEach {
            it.binaries {
                framework {
                    baseName = "${project.name}-shared"
                    export(deps.kermit)
                }
            }
        }

    setupSourceSets {
        common.main.dependencies { api(deps.kermit) }
    }
}
