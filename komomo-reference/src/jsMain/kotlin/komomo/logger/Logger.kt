package komomo.logger

external class Logger(nullptr: Nothing) {

//    .instanceFunction("log", &LoggerClass::log)

//    .instanceFunction("error", &LoggerClass::error)

//    .instanceFunction("warn", &LoggerClass::warn)

//    .instanceFunction("info", &LoggerClass::info)

//    .instanceFunction("debug", &LoggerClass::debug)

//    .instanceFunction("trace", &LoggerClass::trace)

//    .instanceFunction("fatal", &LoggerClass::fatal)

//    .instanceFunction("setLevel", &LoggerClass::fatal)

    companion object {
        fun getLogger(title: String? = definedExternally): Logger
    }
}
