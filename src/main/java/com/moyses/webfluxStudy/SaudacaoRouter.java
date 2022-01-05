package com.moyses.webfluxStudy;

import com.moyses.webfluxStudy.SaudacaoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class SaudacaoRouter {

    @Bean
    public RouterFunction<ServerResponse> route(SaudacaoHandler saudacaoHandler) {
        return RouterFunctions
                .route(GET("/ola")
                        .and(accept(MediaType.APPLICATION_JSON)), saudacaoHandler::ola);
    }
}
