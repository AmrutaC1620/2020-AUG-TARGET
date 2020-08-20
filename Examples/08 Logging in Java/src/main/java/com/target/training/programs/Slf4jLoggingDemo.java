package com.target.training.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLoggingDemo {

    static Logger log = LoggerFactory.getLogger(Slf4jLoggingDemo.class);

    // logger level order --> TRACE, DEBUG, INFO, WARN, ERROR
    public static void main(String[] args) {

        new Thread(()->{
            log.error("This is an error message");
            log.warn("This is a warning message");
            log.info("This is a info message");
            log.debug("This is a debug message");
            log.trace("This is a trace message");
        }).start();

        log.error("This is an error message");
        log.warn("This is a warning message");
        log.info("This is a info message");
        log.debug("This is a debug message");
        log.trace("This is a trace message");

        System.out.println("This is a message using System.out.println");
    }
}
