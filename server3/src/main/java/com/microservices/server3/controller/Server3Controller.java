package com.microservices.server3.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/server3")
public class Server3Controller {

    @GetMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest){
        log.info("Endpoint called from server3: {} {} ", httpServletRequest.getMethod(),httpServletRequest.getRequestURI());
        return "Hello from Server3!";
    }

}
