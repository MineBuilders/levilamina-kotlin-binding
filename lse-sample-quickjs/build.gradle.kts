plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                outputFileName = "test-lse-quick.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        jsMain.dependencies {
            implementation(projects.lseReference)
        }
    }
}
