plugins {
    id("java")
}

group = "digital.zelenev"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":image-usecases"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.0")
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:2.1.214")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}