plugins {
    kotlin("multiplatform") version "1.4-M2"
}
group = "com.ionspin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
kotlin {
    linuxX64()
    linuxArm64()
    linuxArm32Hfp()
    mingwX64()
    macosX64()
    iosArm32 {
        binaries {
            framework {
                baseName = "mainModule"
            }
        }
    }
    iosArm64 {
        binaries {
            framework {
                baseName = "mainModule"
            }
        }
    }
    iosX64 {
        binaries {
            framework {
                baseName = "mainModule"
            }
        }
    }
    js("nodeJs") {
        nodejs {
            binaries.executable()
        }
    }
    js("browser") {
        browser {
            binaries.executable()
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val linuxX64Main by getting { }
        val linuxX64Test by getting { }
        val linuxArm32HfpMain by getting { }
        val linuxArm32HfpTest by getting { }
        val mingwX64Main by getting { }
        val mingwX64Test by getting { }
        val macosX64Main by getting { }
        val macosX64Test by getting { }
        val iosArm32Main by getting { }
        val iosArm32Test by getting { }
        val iosArm64Main by getting { }
        val iosArm64Test by getting { }
        val iosX64Main by getting { }
        val iosX64Test by getting { }
        val nodeJsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val nodeJsTest by getting { }
        val browserMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val browserTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}