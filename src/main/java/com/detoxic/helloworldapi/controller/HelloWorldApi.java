package com.detoxic.helloworldapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

    @GetMapping("helloApi")
    public String hello() {
        return "Welcome to Den Max";
    }
}
