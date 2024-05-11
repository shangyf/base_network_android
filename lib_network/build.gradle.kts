plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.maple.network"
    compileSdk = buildSdk.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = buildSdk.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //测试
    testCompileOnly(testLibs.testJunit)
    androidTestCompileOnly(testLibs.bundles.androidTest)

    compileOnly(androidxLibs.bundles.androidx)
    compileOnly(androidxLibs.material)
    compileOnly(androidxLibs.lifecycleLivedataKtx)
    compileOnly(androidxLibs.lifecycleViewModel)
    compileOnly(dependenciesLib.gson)
    compileOnly(dependenciesLib.mmkv)
    compileOnly(dependenciesLib.bundles.retrofit)
}