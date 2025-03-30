rootProject.name = "levilamina-kotlin-binding"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("kotlinWrappers") {
            val wrappersVersion = "2025.3.22"  // it just so happened to be my birthday :)
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

include(
    ":lse-reference",
    ":lse-sample-nodejs",
    ":lse-sample-quickjs",
)
include(
    ":komomo-reference",
    ":komomo-sample",
)
