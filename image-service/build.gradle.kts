plugins {
    java
    id("org.springframework.boot") version "3.0.0"
}

group = "digital.zelenev"
version = "unspecified"

repositories {
    mavenCentral()
}

val springBootStarterWebVersion: String by project
val springBootStarterTestVersion: String by project
val lombokVersion: String by project

dependencies {
    //inner project dependencies
    implementation(project(":image-usecases"))
    implementation(project(":image-service-api"))
    implementation(project(":image-dao"))
    implementation(project(":image-messaging"))

    //public dependencies
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootStarterWebVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootStarterTestVersion")
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}