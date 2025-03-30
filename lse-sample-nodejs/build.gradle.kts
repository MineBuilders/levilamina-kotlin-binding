plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    js {
        browser {
        }
        useCommonJs()
        binaries.library()
    }

    sourceSets {
        jsMain.dependencies {
            implementation(kotlinWrappers.node)
            implementation(projects.lseReference)
        }
    }
}
