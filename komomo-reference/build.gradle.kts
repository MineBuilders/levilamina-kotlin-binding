plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.dokka)
}

kotlin {
    js {
        nodejs()
    }
}

dokka {
    moduleName = "Komomo"
    dokkaSourceSets.named("jsMain") {
        includes.from("dokka-module.md")
        sourceLink {
            localDirectory = project.file("src/$name/kotlin")
            remoteUrl("https://github.com/MineBuilders/levilamina-kotlin-binding/tree/main/komomo-reference/src/$name/kotlin")
            remoteLineSuffix = "#L"
        }
    }
}
