plugins {
    id("org.jetbrains.kotlin.js") version "1.4-M1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    //React, React DOM + Wrappers (chapter 3)
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.104-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.104-kotlin-1.3.72")
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))

    //Kotlin Styled (chapter 3)
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.104-kotlin-1.3.72")
    implementation(npm("styled-components"))
    implementation(npm("inline-style-prefixer"))
}

kotlin {
    target {
        useCommonJs()
        produceExecutable()
        browser {}
    }
}