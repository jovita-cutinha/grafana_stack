package com.microservices.server1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${SERVER2_URL}")
    private String server2Url;

    @Bean
    public WebClient webClient(WebClient.Builder webClientBuilder){
        return webClientBuilder.baseUrl(server2Url).build();
    }
}

