package com.devwithvijay.olms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests") // host:port/tests
public class TestController {

    @GetMapping
    public String getMessage() {
        return "Hello World";
    }
}
