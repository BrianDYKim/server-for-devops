package com.example.ping

import org.slf4j.LoggerFactory
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

    private val logger = LoggerFactory.getLogger(this::class.java)

    suspend fun healthCheck(request: ServerRequest): ServerResponse {
        logger.info("health check!")

        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValueAndAwait("healthy!")
    }
}