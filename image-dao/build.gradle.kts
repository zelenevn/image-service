plugins {
    id("java")
}

group = "digital.zelenev"
version = "unspecified"

repositories {
    mavenCentral()
}

val springBootStarterDataJpaVersion: String by project
val springBootStarterTestVersion: String by project
val lombokVersion: String by project
val postgresJdbcDriverVersion: String by project

dependencies {
    //inner project dependencies
    implementation(project(":image-usecases"))

    //public dependencies
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootStarterDataJpaVersion")
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    implementation("org.postgresql:postgresql:$postgresJdbcDriverVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootStarterTestVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}