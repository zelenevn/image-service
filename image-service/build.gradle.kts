plugins {
    java
    id("org.springframework.boot") version "3.0.0"
}

group = "digital.zelenev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":image-usecases"))
    implementation(project(":image-service-api"))
    implementation(project(":image-dao"))
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.0")
    // https://mvnrepository.com/artifact/org.springframework/spring-test
    implementation("org.springframework:spring-test:6.0.2")


    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}