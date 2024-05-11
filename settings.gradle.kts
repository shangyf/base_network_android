pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://s01.oss.sonatype.org/content/groups/public")
        maven("https://developer.huawei.com/repo/")
        maven("https://maven.google.com")
    }

    //统一版本管理
    versionCatalogs {
        create("androidxLibs") {
            //library的参数分别对应 别名、group、artifact、version
            library("core-ktx", "androidx.core", "core-ktx").version("1.10.1")
            library("appcompat", "androidx.appcompat", "appcompat").version("1.6.1")
            library("constraintlayout", "androidx.constraintlayout", "constraintlayout").version(
                "2.1.4"
            )
            // SplashScreen
            library("core-splashscreen", "androidx.core", "core-splashscreen").version("1.0.0")
            // androidX通用依赖
            bundle(
                "androidx",
                listOf("core-ktx", "appcompat", "constraintlayout", "core-splashscreen")
            )

            //compose 版本管理
            library("activity-compose", "androidx.activity", "activity-compose").version("1.8.2")
            // Compose的版本控制清单（BOM）platform
            library("composeBom", "androidx.compose", "compose-bom").version("2023.08.00")
            library("compose-ui", "androidx.compose.ui", "ui").version("")
            library("ui-graphics", "androidx.compose.ui", "ui-graphics").version("")
            library("ui-tooling-preview", "androidx.compose.ui", "ui-tooling-preview").version("")
            library("material3", "androidx.compose.material3", "material3").version("")
            bundle(
                "composeLibs",
                listOf(
                    "activity-compose",
                    "ui-graphics",
                    "ui-tooling-preview",
                    "material3"
                )
            )

            library("lifecycleRuntimeKtx", "androidx.lifecycle", "lifecycle-runtime-ktx").version(
                "2.6.1"
            )
            library("lifecycleLivedataKtx", "androidx.lifecycle", "lifecycle-livedata-ktx").version(
                "2.6.1"
            )
            library("lifecycleViewModel", "androidx.lifecycle", "lifecycle-viewmodel-ktx").version(
                "2.6.1"
            )

            library(
                "lifecycleFragmentKtx",
                "androidx.navigation",
                "navigation-fragment-ktx"
            ).version(
                "2.6.0"
            )
            library("lifecycleUiKtx", "androidx.navigation", "navigation-ui-ktx").version(
                "2.6.0"
            )
            library("material", "com.google.android.material", "material").version(
                "1.9.0"
            )
            library("flexbox", "com.google.android.flexbox", "flexbox").version(
                "3.0.0"
            )
        }

        // 第三方图片加载库
        create("dependenciesLib") {
            library("coilCompose", "io.coil-kt", "coil-compose").version("2.5.0")
            //包含一个 decoder 用于支持解码 SVG
            library("coilSVG", "io.coil-kt", "coil-svg").version("2.5.0")
            //包含两个 decoder 用于支持解码 GIF
            library("coilGif", "io.coil-kt", "coil-gif").version("2.5.0")
            //包含两个 fetchers 用于支持读取和解码 任何 Android 的支持的视频格式 的视频帧
            library("coilVideo", "io.coil-kt", "coil-video").version("2.5.0")

            //网络请求 retrofit
            //https://github.com/square/retrofit
            library("retrofit", "com.squareup.retrofit2", "retrofit").version("2.9.0")
            library("converter-gson", "com.squareup.retrofit2", "converter-gson").version("2.9.0")
            library(
                "loggingInterceptor",
                "com.squareup.okhttp3",
                "logging-interceptor"
            ).version("3.11.0")
            bundle("retrofit", listOf("retrofit", "converter-gson", "loggingInterceptor"))

            //coroutines
            library(
                "kotlinx-coroutines-core",
                "org.jetbrains.kotlinx",
                "kotlinx-coroutines-core"
            ).version("1.7.1")
            library(
                "kotlinx-coroutines-android",
                "org.jetbrains.kotlinx",
                "kotlinx-coroutines-android"
            ).version("1.7.1")
            bundle(
                "kotlinxCoroutines",
                listOf("kotlinx-coroutines-core", "kotlinx-coroutines-android")
            )

            //mmkv(https://github.com/Tencent/MMKV)
            library("mmkv", "com.tencent", "mmkv").version("1.3.3")

            library("exoplayer", "com.google.android.exoplayer", "exoplayer").version("2.18.5")

            library("glide", "com.github.bumptech.glide", "glide").version("4.15.0")
            library("glideCompiler", "com.github.bumptech.glide", "compiler").version("4.15.0")

            library("gson", "com.google.code.gson", "gson").version("2.10.1")
            //  https://github.com/scwang90/SmartRefreshLayout
            library("refreshLayout", "io.github.scwang90", "refresh-layout-kernel").version("2.1.0")
            library(
                "refreshHeader",
                "io.github.scwang90",
                "refresh-header-classics"
            ).version("2.1.0")
            library(
                "refreshFooter",
                "io.github.scwang90",
                "refresh-footer-classics"
            ).version("2.1.0")
            bundle("refresh", listOf("refreshLayout", "refreshHeader", "refreshFooter"))

            //https://github.com/CymChad/BaseRecyclerViewAdapterHelper/wiki/
            //io.github.cymchad:BaseRecyclerViewAdapterHelper4:4.1.4
            library(
                "adapterHelper",
                "io.github.cymchad",
                "BaseRecyclerViewAdapterHelper4"
            ).version("4.1.4")

            // 权限请求框架：https://github.com/getActivity/XXPermissions
            // implementation 'com.github.getActivity:XXPermissions:18.5'
            library("xxPermissions", "com.github.getActivity", "XXPermissions").version("18.5")

            //https://gitcode.com/youth5201314/banner/overview?utm_source=csdn_github_accelerator&isLogin=1
            library("banner", "io.github.youth5201314", "banner").version("2.2.2")

            //implementation("com.github.ljphawk:SwipeMenuLayout:1.05")
            //implementation("com.yanzhenjie.recyclerview:x:1.3.2")
            //侧滑删除置顶
            library("swipeMenuLayout", "com.github.ljphawk", "SwipeMenuLayout").version("1.05")

            //https://gitcode.com/H07000223/FlycoTabLayout/blob/master/README_CN.md?utm_source=csdn_github_accelerator&isLogin=1
            //https://blog.csdn.net/poorkick/article/details/70215672
            library("flycoTabLayout", "io.github.h07000223", "flycoTabLayout").version("3.0.0")

            // https://gitcode.com/PhilJay/MPAndroidChart/overview?utm_source=csdn_github_accelerator&isLogin=1
            library("mpAndroidChart", "com.github.PhilJay", "MPAndroidChart").version("v3.1.0")
            //wheel  https://github.com/ShawnLin013/NumberPicker
            library("numberPicker", "io.github.ShawnLin013", "number-picker").version("2.4.13")
            //https://x5.tencent.com/docs/access.html
            library("tbssdk","com.tencent.tbs","tbssdk").version("44286")
        }

        create("mapLib") {
            //百度地图
            //地图组件
            library("baiduMapMap", "com.baidu.lbsyun", "BaiduMapSDK_Map").version("7.5.4")
            //检索组件
            library("baiduMapSearch", "com.baidu.lbsyun", "BaiduMapSDK_Search").version("7.5.4")
            //工具组件
            library("baiduMapUtil", "com.baidu.lbsyun", "BaiduMapSDK_Util").version("7.5.4")
            library(
                "baiduMapLocation",
                "com.baidu.lbsyun",
                "BaiduMapSDK_Location"
            ).version("9.3.7")
        }


        create("testLibs") {
            //测试类
            library("testJunit", "junit", "junit").version("4.13.2")
            library("test-junit-ext", "androidx.test.ext", "junit").version("1.1.5")
            library(
                "test-espresso-core",
                "androidx.test.espresso",
                "espresso-core"
            ).version("3.5.1")
            library("testComposeBom", "androidx.compose", "compose-bom").version("2023.08.00")
            library(
                "test-junit4",
                "androidx.compose.ui",
                "ui-test-junit4"
            ).version("")
            bundle(
                "androidTest",
                listOf("testJunit", "test-junit-ext", "test-espresso-core")
            )

            library("test-ui-tooling", "androidx.compose.ui", "ui-tooling").version("")
            library("test-compose-manifest", "androidx.compose.ui", "ui-test-manifest").version("")
            bundle("debugImpl", listOf("test-ui-tooling", "test-compose-manifest"))
        }

        /**
         * 在app/build.gradle中
         * compileSdk:buildSdk.versions.compileSdk.get().toInteger()
         */
        create("buildSdk") {
            version("compileSdk", "34")
            version("minSdk", "26")
            version("targetSdk", "34")
            version("versionCode", "1")
            version("versionName", "1.0.0")
        }
    }
}

rootProject.name = "base_network_android"
include(":app")
include(":lib_network")
 