import org.gradle.api.JavaVersion.VERSION_11

plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.almland"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

allprojects {
    apply {
        group = "${project.rootProject.group}"
        version = "${project.rootProject.version}"
        plugin("kotlin")
    }
}
