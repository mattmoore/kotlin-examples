import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.71"
}

group = "com.github.mattmoore"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val arrow_version = "0.7.3"

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testRuntime("org.junit.platform:junit-platform-console:1.2.0")

    compile("io.arrow-kt:arrow-core:$arrow_version")
    compile("io.arrow-kt:arrow-syntax:$arrow_version")
    compile("io.arrow-kt:arrow-typeclasses:$arrow_version")
    compile("io.arrow-kt:arrow-data:$arrow_version")
    compile("io.arrow-kt:arrow-instances-core:$arrow_version")
    compile("io.arrow-kt:arrow-instances-data:$arrow_version")
    kapt   ("io.arrow-kt:arrow-annotations-processor:$arrow_version")

    compile("io.arrow-kt:arrow-free:$arrow_version") //optional
    compile("io.arrow-kt:arrow-mtl:$arrow_version") //optional
    compile("io.arrow-kt:arrow-effects:$arrow_version") //optional
    compile("io.arrow-kt:arrow-effects-rx2:$arrow_version") //optional
    compile("io.arrow-kt:arrow-effects-reactor:$arrow_version") //optional
    compile("io.arrow-kt:arrow-effects-kotlinx-coroutines:$arrow_version") //optional
    compile("io.arrow-kt:arrow-optics:$arrow_version") //optional
    compile("io.arrow-kt:arrow-generic:$arrow_version") //optional
    compile("io.arrow-kt:arrow-recursion:$arrow_version") //optional
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}
