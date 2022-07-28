import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.7.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
}

tasks.withType<ShadowJar> {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}

dependencies {
    // https://mvnrepository.com/artifact/com.soywiz.korlibs.korau/korau
    implementation("com.soywiz.korlibs.korau:korau:3.0.0-Beta6")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
