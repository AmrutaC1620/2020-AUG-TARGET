package com.target.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // The following statement, starts up Apache tomcat, and uses Main.class as a
        // spring configuration file.
        SpringApplication.run(Main.class, args);
    }
}
