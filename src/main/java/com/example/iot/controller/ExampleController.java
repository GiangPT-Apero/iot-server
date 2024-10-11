package com.example.iot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/example")
    public String getExample() {
        return "Hello from API";
    }

    @PostMapping("/example")
    public String postExample(@RequestBody String data) {
        return "Received: " + data;
    }
}