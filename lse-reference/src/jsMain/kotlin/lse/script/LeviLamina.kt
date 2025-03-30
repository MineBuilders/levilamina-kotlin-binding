package lse.script

// https://github.com/LiteLDev/LegacyScriptEngine/blob/develop/src/legacy/api/LlAPI.cpp#L15
@JsName("ll")
external class LeviLamina {
    companion object {
        @JsName("major")
        val MAJOR: Int

        @JsName("minor")
        val MINOR: Int

        @JsName("revision")
        val REVISION: Int

        @JsName("status")
        val STATUS: Int

        @JsName("scriptEngineVersion")
        val SCRIPT_ENGINE_VERSION: String

        @JsName("language")
        val LANGUAGE: String

        @JsName("isWine")
        val IS_WINE: Boolean

        @JsName("isDebugMode")
        val IS_DEBUG_MODE: Boolean

        @JsName("isRelease")
        val IS_RELEASE: Boolean

        @JsName("isBeta")
        val IS_BETA: Boolean

        @JsName("isDev")
        val IS_DEV: Boolean

        fun versionString(): String

//        .function("requireVersion", &LlClass::requireVersion)
//        .function("listPlugins", &LlClass::listPlugins)
//        .function("getAllPluginInfo", &LlClass::getAllPluginInfo)
//        .function("imports", &LlClass::importFunc)
//        .function("exports", &LlClass::exportFunc)
//        .function("hasExported", &LlClass::hasFuncExported)
//        .function("require", &LlClass::require)
//        .function("eval", &LlClass::eval)
//        .function("registerPlugin", &LlClass::registerPlugin)
//        .function("getPluginInfo", &LlClass::getPluginInfo)
//        .function("checkVersion", &LlClass::requireVersion)
//        .function("onUnload", &LlClass::onUnload)
//
//        // For Compatibility
//        .function("version", &LlClass::version)
//        .function("versionStatus", &LlClass::getVersionStatus)
    }
}
