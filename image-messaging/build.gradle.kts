plugins {
    id("java")
}

group = "digital.zelenev"
version = "unspecified"

repositories {
    mavenCentral()
}

val springBootStarterAmqpVersion: String by project
val springBootStarterJsonVersion: String by project
val springBootStarterTestVersion: String by project
val lombokVersion: String by project
val mapstructVersion: String by project

dependencies {
    //inner project dependencies
    implementation(project(":image-usecases"))

    //public dependencies
    implementation("org.springframework.boot:spring-boot-starter-amqp:$springBootStarterAmqpVersion")
    implementation("org.springframework.boot:spring-boot-starter-json:$springBootStarterJsonVersion")
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootStarterTestVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    val compilerArgs = options.compilerArgs
    compilerArgs.add("-Amapstruct.defaultComponentModel=spring")
}