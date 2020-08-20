package com.target.training.programs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaUtilLoggingDemo {

    static Logger log = Logger.getLogger(JavaUtilLoggingDemo.class.getName());

    static {
        log.setLevel(Level.ALL);
        // JUL Logger Level Order --> FINEST, FINER, FINE, INFO, WARNING, SEVERE
    }

    static void test() {
        log.warning("This is a warning from test() function.");
    }
    public static void main(String[] args) {
        // System.out.println("This is a test print statement!");

        test();
        log.log(Level.FINEST, "this is a FINEST message");
        log.log(Level.FINER, "this is a FINER message");
        log.log(Level.FINE, "this is a FINE message");
        log.log(Level.INFO, "this is a INFO message");
        log.log(Level.WARNING, "this is a WARNING message");
        log.log(Level.SEVERE, "this is a SEVER message");

        log.log(Level.ALL, "this is a ALL message");
        log.log(Level.CONFIG, "this is a CONFIG message");
    }
}
