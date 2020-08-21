package com.target.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring boot!";
    }
}
