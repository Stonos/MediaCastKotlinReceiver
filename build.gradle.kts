plugins {
    id("org.jetbrains.kotlin.js") version "1.4-M1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven("https://kotlin.bintray.com/kotlin-js-wrappers")
    maven("https://kotlin.bintray.com/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlin-dev")
}

dependencies {
    implementation(kotlin("stdlib-js"))

    //React, React DOM + Wrappers (chapter 3)
    implementation("org.jetbrains:kotlin-react:16.13.0-pre.95-kotlin-1.4-M1")
    implementation("org.jetbrains:kotlin-react-dom:16.13.0-pre.95-kotlin-1.4-M1")
    implementation(npm("react", "16.13.0"))
    implementation(npm("react-dom", "16.13.0"))
    implementation(npm("react-is", "16.13.0"))

    //Kotlin Styled (chapter 3)
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.95-kotlin-1.4-M1")
    implementation("org.jetbrains:kotlin-css:1.0.0-pre.95-kotlin-1.4-M1")
    implementation(npm("styled-components"))
    implementation(npm("inline-style-prefixer"))

    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.1-build-1707")
}

kotlin {
    target {
        useCommonJs()
        produceExecutable()
        browser {}
    }
}