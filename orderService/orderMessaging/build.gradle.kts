repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":orderService:orderDomain:orderApplicationService"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}