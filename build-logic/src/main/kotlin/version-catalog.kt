@file:Suppress("UnstableApiUsage")

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val Project.catalogs get() = extensions.getByType<VersionCatalogsExtension>()

internal val Project.libs: VersionCatalog get() = catalogs.named("libs")

internal fun VersionCatalog.version(reference: String): String? = findVersion(reference)
    .orElse(null)
    ?.toString()
