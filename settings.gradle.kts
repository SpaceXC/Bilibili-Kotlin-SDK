pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        //id("org.jetbrains.compose").version(extra["compose.version"] as String)
        id("maven-publish")
        id("org.gradle.api.artifacts.maven")
    }
}
rootProject.name = "Bilibili-Kotlin-SDK"