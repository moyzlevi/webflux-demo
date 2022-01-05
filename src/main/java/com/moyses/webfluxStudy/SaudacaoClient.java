package com.moyses.webfluxStudy;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class SaudacaoClient {

    private final WebClient client;

    public SaudacaoClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getMensagem(){
        return this.client.get().uri("/ola").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Saudacao.class)
                .map(Saudacao::getMensagem);
    }
}
