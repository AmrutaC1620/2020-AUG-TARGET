package com.target.training;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {

    static void print(String name){
        log.info("Name is {}", name);
    }

    public static void main(String[] args) {
        String name = "Vinod";
        print(name);
    }
}
