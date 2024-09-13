package com.example.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello cok";
    }

    }

