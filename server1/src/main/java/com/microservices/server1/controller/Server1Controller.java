package com.microservices.server1.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/server1")
public class Server1Controller {

    private final WebClient webClient;

    public Server1Controller(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/hello")
    public Mono<String> hello(HttpServletRequest httpServletRequest) {

        log.info("Endpoint called from server1: {} {} ", httpServletRequest.getMethod(),httpServletRequest.getRequestURI());


        return webClient.get()
                .uri("/server2/hello")
                .retrieve()
                .bodyToMono(String.class)
                .map(response -> "Hello from Server 1! Response from Server 2: "+response);
    }
}
