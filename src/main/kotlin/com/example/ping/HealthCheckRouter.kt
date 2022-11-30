package com.example.ping

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

/**
 * @author Brian
 * @since 2022/12/01
 */
@Configuration
class HealthCheckRouter(
    private val healthCheckHandler: HealthCheckHandler
) {

    @Bean
    fun healthCheckRoutes() = coRouter {
        "".nest {
            GET("/", healthCheckHandler::healthCheck)
        }
    }
}