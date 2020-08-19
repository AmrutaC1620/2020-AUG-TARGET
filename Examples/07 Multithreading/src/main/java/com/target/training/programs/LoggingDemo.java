package com.target.training.programs;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j // static Logger log = LoggerFactory.getLogger(LoggingDemo.class);
public class LoggingDemo {

    static void test(String name, int age, double height) {
        log.debug("Name = {}, Age = {} years, Height = {} ft.", name, age, height);
        log.trace("Name = {}, Age = {} years, Height = {} ft.", name, age, height);
    }

    public static void main(String[] args) {
        String name = "Vinod";
        int age = 47;
        double height = 5.8;

        // SLF4J logger levels --> TRACE, DEBUG, INFO, WARN, ERROR

        log.info("Name = {}, Age = {} years, Height = {} ft.", name, age, height);
        log.warn("Name = {}, Age = {} years, Height = {} ft.", name, age, height);
        new Thread(()->test(name, age, height), "MyCustomThread").start();
        log.error("Name = {}, Age = {} years, Height = {} ft.", name, age, height);
    }
}
