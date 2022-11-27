plugins {
    id("app.dreamlightpal.multiplatform.library")
}

dependencies {
    implementation(projects.core.collection.api)
    implementation(projects.core.threading.api)
}
