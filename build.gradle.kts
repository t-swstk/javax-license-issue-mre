plugins {
    kotlin("jvm") version "2.0.10"
    id("org.cyclonedx.bom") version "2.3.0"
}

group = "com.zuvoo"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.cyclonedx:cyclonedx-gradle-plugin:2.3.0")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    testImplementation(kotlin("test"))
}

tasks {
    cyclonedxBom {
        outputFormat.set("json")
        outputName.set("application.cdx")
        destination.set(file("build/reports"))
    }
}
kotlin {
    jvmToolchain(17)
}