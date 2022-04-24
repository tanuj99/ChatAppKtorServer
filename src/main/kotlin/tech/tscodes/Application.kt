package tech.tscodes

import io.ktor.application.*
import org.koin.ktor.ext.Koin
import tech.tscodes.di.mainModule
import tech.tscodes.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {

    install(Koin) {
        modules(mainModule)
    }
    configureSockets()
    configureMonitoring()
    configureRouting()
    configureSerialization()
    configureSecurity()
}

