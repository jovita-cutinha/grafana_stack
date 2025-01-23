package com.microservices.server2.controller;

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
@RequestMapping("/server2")
public class Server2Controller {

    private final WebClient webClient;

    public Server2Controller(WebClient webClient) {
        this.webClient = webClient;
    }


    @GetMapping("/hello")
    public Mono<String> hello(HttpServletRequest httpServletRequest) {

        log.info("Endpoint called from server2: {} {} ", httpServletRequest.getMethod(),httpServletRequest.getRequestURI());
        return webClient.get()
                .uri("/server3/hello")
                .retrieve()
                .bodyToMono(String.class)
                .map(response -> "Hello from Server 2! Response from Server 3: "+ response);
    }


}
