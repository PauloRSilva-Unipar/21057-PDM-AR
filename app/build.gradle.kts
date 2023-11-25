plugins {
    this.id("com.android.application")
    this.id("org.jetbrains.kotlin.android")
}

android {
    this.namespace = "com.paulorsilva.unipararppm"
    this.compileSdk = 34

    this.defaultConfig {
        this.applicationId = "com.paulorsilva.unipararppm"
        this.minSdk = 34
        this.targetSdk = 34
        this.versionCode = 1
        this.versionName = "1.0"

        this.testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        this.vectorDrawables {
            this.useSupportLibrary = true
        }
    }

    this.buildTypes {
        this.release {
            this.isMinifyEnabled = false
            this.proguardFiles(this@android.getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    this.compileOptions {
        this.sourceCompatibility = JavaVersion.VERSION_1_8
        this.targetCompatibility = JavaVersion.VERSION_1_8
    }
    this.kotlinOptions {
        this.jvmTarget = "1.8"
    }
    this.buildFeatures {
        this.compose = true
    }
    this.composeOptions {
        this.kotlinCompilerExtensionVersion = "1.4.3"
    }
    this.packaging {
        this.resources {
            this.excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    this.implementation("androidx.core:core-ktx:1.12.0")
    this.implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    this.implementation("androidx.activity:activity-compose:1.8.1")
    this.implementation(this.platform("androidx.compose:compose-bom:2023.10.01"))
    this.implementation("androidx.compose.ui:ui")
    this.implementation("androidx.compose.ui:ui-graphics")
    this.implementation("androidx.compose.ui:ui-tooling-preview")
    this.implementation("androidx.compose.material3:material3:1.1.2")
    this.testImplementation("junit:junit:4.13.2")
    this.androidTestImplementation("androidx.test.ext:junit:1.1.5")
    this.androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    this.androidTestImplementation(this.platform("androidx.compose:compose-bom:2023.10.01"))
    this.androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    this.debugImplementation("androidx.compose.ui:ui-tooling")
    this.debugImplementation("androidx.compose.ui:ui-test-manifest")
}