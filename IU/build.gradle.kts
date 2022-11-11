plugins {
    id("java")
    id("org.jetbrains.intellij")
}

fun properties(key: String) = project.findProperty(key).toString()

group = "com.github.brianmcnamara.plugindemo"
version = "0.0.1"

repositories {
    mavenCentral()
}

intellij {
    pluginName.set(properties("pluginName"))
    version.set(properties("platformVersion"))
    type.set("IU")

    // Plugin Dependencies. Uses `platformPlugins` property from the gradle.properties file.
    plugins.set(listOf("JavaScript"))
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}