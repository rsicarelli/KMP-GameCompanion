plugins {
    id("app.dreamlightpal.kotlin.library")
}

dependencies {
    api(projects.core.test.core)
    implementation(projects.core.threading.api)
    implementation(projects.core.logger.api)
}
