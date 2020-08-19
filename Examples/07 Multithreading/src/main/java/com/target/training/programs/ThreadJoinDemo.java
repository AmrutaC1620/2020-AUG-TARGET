package com.target.training.programs;

import lombok.SneakyThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJoinDemo {

    static Logger log = Logger.getLogger(ThreadJoinDemo.class.getName());
    // JUL Logging Level Order --> FINEST, FINER, FINE, INFO, WARNING, SEVERE


    @SneakyThrows
    public static void main(String[] args) {
        log.setLevel(Level.FINEST);
//        log.finest("This is FINEST");
//        log.finer("This is FINER");
//        log.fine("This is FINE");
//        log.info("This is INFO");
//        log.warning("This is WARNING");
//        log.severe("This is SEVERE");

//        if(true) return;

        // System.out.println("Start of main() method");
        // log.log(Level.INFO, "Start of main() method.");
        log.warning("Start of main() method.");

        // ()->{} can represent a runnable object
        Thread t1 = new Thread(()->{
            for(int i=1; i<=25; i++){
                // System.out.printf("In thread %s, value of i is %d\n", Thread.currentThread().getName(), i);
                log.info(String.format("In thread %s, value of i is %d\n", Thread.currentThread().getName(), i));
                delay(1);
            }
        }, "t1");
        t1.start(); // creates a new stack, places t1.run() inside that stack


        for(int i=1; i<=10; i++){
            // System.out.printf("In thread %s, value of i is %d\n", Thread.currentThread().getName(), i);
            log.info(String.format("In thread %s, value of i is %d\n", Thread.currentThread().getName(), i));
            delay(1);
        }

        t1.join(); // wait until 't1' dies (the run() finishes its execution)
        // System.out.println("End of main() method");
        log.warning("End of main() method");
    }

    @SneakyThrows
    private static void delay(int delayInMillis) {
        Thread.sleep(1);
    }
}
