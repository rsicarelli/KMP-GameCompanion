import com.arkivanov.gradle.setupSourceSets

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

kotlin {
    targets
        .asSequence()
        .filterIsInstance<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>()
        .filter { it.konanTarget.family == org.jetbrains.kotlin.konan.target.Family.IOS }
        .forEach {
            it.binaries {
                framework {
                    baseName = "${project.name}-shared"
                    export(deps.rickclephas.kmp.native.coroutines.core)
                }
            }
        }

    setupSourceSets {
        common.main.dependencies { api(deps.rickclephas.kmp.native.coroutines.core) }
    }
}
