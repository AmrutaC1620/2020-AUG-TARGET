package com.target.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    @RequestMapping("/")
    public String index() {
        return "This is the home of restful services";
    }

    public static void main(String[] args) {
        // The following statement, starts up Apache tomcat, and uses Main.class as a
        // spring configuration file.
        SpringApplication.run(Main.class, args);
    }
}
