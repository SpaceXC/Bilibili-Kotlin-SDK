import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.kotlin.plugin.atomicfu") version "1.9.0"
    `maven-publish`
    application
}

group = "cn.spacexc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {

}

dependencies {
    val ktorVersion: String by project
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-logging:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-gson:$ktorVersion")

    val gsonVersion = "2.10.1"
    implementation("com.google.code.gson:gson:$gsonVersion")

    val kotlinxAtomifuVersion = "0.20.1"
    implementation("org.jetbrains.kotlinx:atomicfu:$kotlinxAtomifuVersion")
}

val localRepositoryPath = file("${System.getProperty("user.home")}/.m2/repository")

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = this.groupId
            artifactId = project.name
            version = this.version
        }
    }

    repositories {
        mavenLocal() // 发布到本地仓库
        // 你还可以添加其他远程仓库配置
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("MainKt")
}