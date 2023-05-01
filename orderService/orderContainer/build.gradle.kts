repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":orderService:orderApplication"))
    implementation(project(":orderService:orderDataAccess"))
    implementation(project(":orderService:orderDomain:orderApplicationService"))
    implementation(project(":orderService:orderDomain:orderDomainCore"))
    implementation(project(":orderService:orderMessaging"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}