plugins {
    id("java")
}

group = "digital.zelenev"
version = "unspecified"

repositories {
    mavenCentral()
}

val springWebVersion: String by project

dependencies {
    implementation("org.springframework:spring-web:$springWebVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}