plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")

    defaultConfig {
        applicationId = "com.funfun.compose"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        useIR = true
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerVersion = Kotlin.version
        kotlinCompilerExtensionVersion = Compose.version
    }

    sourceSets.getByName("main") {
        java.srcDir("src/main/java")
        java.srcDir("src/main/kotlin")
    }

    sourceSets.getByName("test") {
        java.srcDir("src/test/java")
        java.srcDir("src/test/kotlin")
    }

    sourceSets.getByName("androidTest") {
        java.srcDir("src/androidTest/java")
        java.srcDir("src/androidTest/kotlin")
    }
}

dependencies {
    implementation(Kotlin.stdLib)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.lifeCycleRuntimeKtx)

    implementation(Google.material)

    composeComponent()

    testImplementation(Test.junit)

    androidTestImplementation(AndroidTest.junit)
    androidTestImplementation(AndroidTest.espresso)
}
