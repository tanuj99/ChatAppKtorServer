package tech.tscodes.room

import io.ktor.http.cio.websocket.*

data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)

class MemberAlreadyExistsException: Exception(
    "Member already exists"
)