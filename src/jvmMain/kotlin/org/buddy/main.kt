package org.buddy

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("<i>Good boy</i>", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}

internal fun greetEveryone(): String = "Hello, world!"
