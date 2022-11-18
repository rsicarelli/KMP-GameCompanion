@file:Suppress("UnstableApiUsage")

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

val Project.catalogs get() = extensions.getByType<VersionCatalogsExtension>()

val Project.libs: VersionCatalog get() = catalogs.named("libs")

fun VersionCatalog.version(reference: String): String? = findVersion(reference)
    .orElse(null)
    ?.toString()

fun VersionCatalog.dependency(name: String) = findLibrary(name).get()
