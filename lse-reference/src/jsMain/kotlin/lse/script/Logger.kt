package lse.script

// https://github.com/LiteLDev/LegacyScriptEngine/blob/develop/src/legacy/api/LoggerAPI.cpp#L23
@JsName("logger")
external class Logger {
    companion object {
        fun log(vararg data: Any)

        fun debug(vararg data: Any)

        fun info(vararg data: Any)

        fun warn(vararg data: Any)

        @Deprecated("For compatibility.", replaceWith = ReplaceWith("Logger.warn(*data)"))
        fun warning(vararg data: Any)

        fun error(vararg data: Any)

        fun fatal(vararg data: Any)

//        .function("setTitle", &LoggerClass::setTitle)
//        .function("setConsole", &LoggerClass::setConsole)
//        .function("setFile", &LoggerClass::setFile)
//        .function("setPlayer", &LoggerClass::setPlayer)
//        .function("setLogLevel", &LoggerClass::setLogLevel)
    }
}
