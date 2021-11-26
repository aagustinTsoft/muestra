import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    kotlin("android")
    id ("kotlin-kapt")
    kotlin("plugin.serialization") version "1.5.0"
}

dependencies {
    implementation(project(":shared"))
    //implementation("com.google.android.material:material:1.3.0")
    //implementation("androidx.appcompat:appcompat:1.2.0")
    //implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    // Picasso
    implementation ("com.squareup.picasso:picasso:2.71828")

    // Kotlin Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    val lifecycle_version = "2.4.0-alpha03"

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

    // Retrofit
    val retrofitVersion = "2.9.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    implementation ("androidx.core:core-ktx:1.6.0")
    implementation ("androidx.appcompat:appcompat:1.3.1")
    implementation ("com.google.android.material:material:1.4.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    //ktor
    val ktorVersion = "1.6.3"
    implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
    implementation("io.ktor:ktor-client-logging:$ktorVersion")
    implementation("io.github.aakira:napier:2.1.0")
    implementation("io.ktor:ktor-client-serialization:$ktorVersion")
    implementation ("io.ktor:ktor-client-android:$ktorVersion")

}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.example.marveltptaller.android"
        minSdkVersion(23)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        viewBinding = true
    }
}