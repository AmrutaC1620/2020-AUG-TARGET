package com.target.training.programs;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaemonThreadDemo {
    @SneakyThrows
    static void sleep(long duration) {
        Thread.sleep(duration);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            int i=1;
            while(true) {
                log.info("Value of i in run() while loop is {}", i++);
                sleep(250);
            }
        });
        t1.setDaemon(true); // automatically killed when all non-daemon threads die
        t1.start();

        for(int i=1; i<=10; i++) {
            log.info("Value of i in main() for loop is {}", i);
            sleep(1000);
        }

    }
}
