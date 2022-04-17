package tech.tscodes

import io.ktor.application.*
import tech.tscodes.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureMonitoring()
    configureRouting()
    configureSerialization()
    configureSockets()
    configureSecurity()
}

