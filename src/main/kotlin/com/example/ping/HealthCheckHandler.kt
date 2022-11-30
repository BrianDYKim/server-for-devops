package com.example.ping

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.bodyValueAndAwait

/**
 * @author Brian
 * @since 2022/12/01
 */
@Component
class HealthCheckHandler {

    suspend fun healthCheck(request: ServerRequest): ServerResponse {
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValueAndAwait("healthy!")
    }
}