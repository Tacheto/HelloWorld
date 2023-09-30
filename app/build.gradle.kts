plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.helloworld"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.helloworld"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //TODO Para documentar con javadoc el proyecto se debe añadir (descomentar) la siguiente libreria
    //implementation(files("home/sergi/Android/Sdk/platforms/android-28/android.jar"))
    //implementation(files("C:\\Users\\sergi\\AppData\\Local\\Android\\Sdk\\platforms\\android-34\\android.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}