package tech.tscodes.plugins

import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import tech.tscodes.room.RoomController
import tech.tscodes.routes.chatSocket
import tech.tscodes.routes.getAllMessages

fun Application.configureRouting() {

    val roomController by inject<RoomController>()

    install(Routing) {
        chatSocket(roomController = roomController)
        getAllMessages(roomController)
    }
}
