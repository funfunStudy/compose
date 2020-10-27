buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.0-alpha14")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()

        kotlinOptions.allWarningsAsErrors = true

        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.Experimental"
        kotlinOptions.freeCompilerArgs += "-Xallow-jvm-ir-dependencies"
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}
