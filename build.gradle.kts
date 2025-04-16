
plugins {
    id("com.android.application") version "8.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0")  // Example AGP version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
        classpath("androidx.hilt:hilt-compiler:1.0.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}
