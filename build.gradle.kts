import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.kotlin.multiplatform) apply false
}

plugins.withType<YarnPlugin> {
    the<YarnRootExtension>().lockFileDirectory =
        rootDir.resolve("gradle/kotlin-js-store")
}
