package com.example.DockerWithMetrics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String getGreetings() {
        return "Hello world from Docker";
    }
}
