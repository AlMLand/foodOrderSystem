repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":orderService:orderDomain:orderDomainCore"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}