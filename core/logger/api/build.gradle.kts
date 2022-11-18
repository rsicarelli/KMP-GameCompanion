import com.arkivanov.gradle.bundle
import com.arkivanov.gradle.dependsOn
import com.arkivanov.gradle.iosCompat
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupSourceSets
import org.gradle.api.internal.artifacts.dependencies.DefaultDependencyConstraint.strictly
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    id("app.dreamlightpal.multiplatform.library")
}

//kotlin {
//    targets
//        .asSequence()
//        .filterIsInstance<KotlinNativeTarget>()
//        .filter { it.konanTarget.family == Family.IOS }
//        .forEach {
//            it.binaries {d
//                framework {
//                    baseName = "Shared"
//                    export(deps.kermit)
//                }
//            }
//        }
//
//    setupSourceSets {
//        common.main.dependencies { api(deps.kermit) }
//    }
//}
