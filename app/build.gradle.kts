plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.dempapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dempapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures{
        viewBinding=true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // AndroidX Core KTX
    implementation("androidx.core:core-ktx:1.10.0")

    // AndroidX AppCompat
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Material Components
    implementation ("com.google.android.material:material:1.9.0")

    // AndroidX Activity
    implementation ("androidx.activity:activity-ktx:1.7.0")

    // AndroidX ConstraintLayout
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // JUnit for unit tests
    testImplementation ("junit:junit:4.13.2")

    // AndroidX JUnit for Instrumentation tests
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")

    // AndroidX Espresso for UI testing
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

//hilt dependencies
    implementation("com.google.dagger:hilt-android:2.44")  // Hilt dependency
    //implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0")  // Hilt ViewModel integration
    kapt("com.google.dagger:hilt-compiler:2.44")  // Hilt compiler for annotation processing

//viewmodel and livedata dependencies
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")  // ViewModel
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    // Optional: Hilt navigation integration
    //implementation("androidx.hilt:hilt-navigation-fragment:1.0.0")

    //retrofit dependencies
    implementation("com.squareup.retrofit2:retrofit:2.9.0")  // Retrofit library
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.1")

    //coroutine dependencies
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")  // Core coroutine library
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")


    // Navigation Fragment
    implementation ("androidx.navigation:navigation-fragment-ktx:2.6.0")  // or latest version

    // Navigation UI
    implementation ("androidx.navigation:navigation-ui-ktx:2.6.0")
}
