package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
public class FirstServiceController {

    // GET http://localhost:8081/first-service/welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First service.";
    }
}
