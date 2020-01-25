buildscript {
    repositories {
        mavenCentral()
        google()
    }
}
plugins {
    id("com.android.application")
    id("checkstyle")
    id("edu.illinois.cs.cs125.gradlegrader") version "2019.1.2"
}
android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")
    defaultConfig {
        applicationId = "edu.illinois.cs.cs125.spring2020.hello"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
repositories {
    google()
    jcenter()
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3.1")
    testImplementation("com.github.cs125-illinois:gradlegrader:2019.1.2")
}
gradlegrader {
    assignment = "Spring2020.Hello"
    checkstyle {
        points = 10
        configFile = rootProject.file("config/checkstyle.xml")
    }
    forceClean = false
    identification {
        txtFile = rootProject.file("email.txt")
        validate = Spec { it.endsWith("@illinois.edu") }
        message = "You must enter your @illinois.edu email address into email.txt."
    }
    reporting {
        printPretty {
            title = "Grade Summary"
            notes = "If you're seeing this, the grading process was able to run!"
        }
    }
    vcs {
        git = true
    }
}
