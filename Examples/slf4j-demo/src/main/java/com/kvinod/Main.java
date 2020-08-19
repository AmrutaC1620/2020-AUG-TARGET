package com.kvinod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

//    static Logger log = Logger.getLogger(Main.class.getName());

//    static Logger log = LoggerFactory.getLogger(Main.class.getName());

    static void test() {
//        log.log(Level.INFO, "This is an info from test() method");
        log.info("This is an info from test() method");
    }

    public static void main(String[] args) {
        String name = "Vinod";
        int age = 47;

        log.info("This is an info. Name = {}, age = {} years.", name, age);

//        log.log(Level.WARNING, "This is a warning message");
//        log.log(Level.SEVERE, "This is a severe message");
        log.warn("This is a warning from main(). Name = {}, age = {} years.", name, age);
        log.error("This is an error message from main(). Name = {}, age = {} years.", name, age); // reports as SEVERE

        log.debug("This is a debug message from main()"); // NOT CALLED
        log.trace("This is a trace message from main()"); // NOT CALLED

        test();
    }
}
