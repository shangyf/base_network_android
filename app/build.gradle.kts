plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.maple.base_network_android"
    compileSdk = buildSdk.versions.compileSdk.get().toInt()

    defaultConfig {
        namespace = "com.maple.base_network_android"
        minSdk = buildSdk.versions.minSdk.get().toInt()
        targetSdk = buildSdk.versions.targetSdk.get().toInt()
        versionCode = buildSdk.versions.versionCode.get().toInt()
        versionName = buildSdk.versions.versionName.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

//        ndk {
//            // 设置支持的SO库架构（开发者可以根据需要，选择一个或多个平台的so）
//            //armeabi", "armeabi-v7a", "arm64-v8a", "x86", "x86_64"
//            abiFilters.addAll(arrayOf("armeabi-v7a", "arm64-v8a"))
//        }
//
//        manifestPlaceholders["JPUSH_PKGNAME"] = applicationId!!
//        manifestPlaceholders["JPUSH_APPKEY"] = "7f45865ae445b42b5e4f0963"
//        manifestPlaceholders["JPUSH_CHANNEL"] = "default_developer"
//        manifestPlaceholders["MEIZU_APPKEY"] = ""
//        manifestPlaceholders["MEIZU_APPID"] = ""
//        manifestPlaceholders["XIAOMI_APPID"] = ""
//        manifestPlaceholders["XIAOMI_APPKEY"] = ""
//        manifestPlaceholders["OPPO_APPKEY"] = "0e9be9b78ba84736959cd55d21039c05"
//        manifestPlaceholders["OPPO_APPID"] = "31669167"
//        manifestPlaceholders["OPPO_APPSECRET"] = "034675c62e18425db47e85c38fd7f59c"
//        manifestPlaceholders["VIVO_APPKEY"] = "8794a157bf97825ea082da33b8d12470"
//        manifestPlaceholders["VIVO_APPID"] = "105735953"
//        manifestPlaceholders["HONOR_APPID"] = ""

//         配置APK的输出路径和文件名
//        setProperty("archivesBaseName", "软考_${versionName}")
    }

    // 配置签名
//    signingConfigs {
//        create("release") {
//            storeFile = file("../software.jks")
//            storePassword = "shkj_2024"
//            keyAlias = "ware"
//            keyPassword = "970312"
//        }
//    }

    buildTypes {
        release {
            buildConfigField("boolean", "DEBUG", "false")
            buildConfigField(
                "String",
                "AES_ENCRYPTION_KEY",
                "\"${findProperty("aesEncryptionKey")}\""
            )
            buildConfigField(
                "String",
                "AES_DECRYPTION_KEY",
                "\"${findProperty("aesDecryptionKey")}\""
            )
            buildConfigField(
                "String",
                "WEATHER_KEY",
                "\"${findProperty("weatherKey")}\""
            )
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // signingConfig = signingConfigs.getByName("release")
        }
        debug {
            buildConfigField(
                "String",
                "AES_ENCRYPTION_KEY",
                "\"${findProperty("aesEncryptionKey")}\""
            )
            buildConfigField(
                "String",
                "AES_DECRYPTION_KEY",
                "\"${findProperty("aesDecryptionKey")}\""
            )
            buildConfigField(
                "String",
                "WEATHER_KEY",
                "\"${findProperty("weatherKey")}\""
            )
            buildConfigField("boolean", "DEBUG", "true")
            //signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

//    buildFeatures {
//        compose = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }

}

dependencies {
    // 通过fileTree.map指定libs目录下的所有JAR文件
    implementation(
        fileTree(
            mapOf(
                "dir" to "libs",
                "include" to listOf("*.aar", "*.jar"),
            )
        )
    )

    //测试
    testImplementation(testLibs.testJunit)
    androidTestImplementation(testLibs.bundles.androidTest)

    implementation(androidxLibs.bundles.androidx)
    implementation(androidxLibs.material)
    implementation(androidxLibs.lifecycleLivedataKtx)
    implementation(androidxLibs.lifecycleViewModel)
    implementation(androidxLibs.lifecycleFragmentKtx)
    implementation(androidxLibs.lifecycleUiKtx)
    implementation(androidxLibs.flexbox)

    implementation(dependenciesLib.gson)
    implementation(dependenciesLib.mmkv)
    implementation(dependenciesLib.bundles.retrofit)
    implementation(dependenciesLib.bundles.refresh)
    implementation(dependenciesLib.adapterHelper)
    implementation(dependenciesLib.xxPermissions)
    implementation(dependenciesLib.banner)
    implementation(dependenciesLib.flycoTabLayout)
    implementation(dependenciesLib.numberPicker)
    implementation(dependenciesLib.mpAndroidChart)
    implementation(dependenciesLib.glide)
    kapt(dependenciesLib.glideCompiler)
    implementation(dependenciesLib.tbssdk)

    implementation(mapLib.baiduMapMap)
    implementation(mapLib.baiduMapSearch)
    implementation(mapLib.baiduMapUtil)
    implementation(mapLib.baiduMapLocation)

    implementation(project(":lib_network"))
}

