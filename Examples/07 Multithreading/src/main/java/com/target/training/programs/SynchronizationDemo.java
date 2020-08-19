package com.target.training.programs;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class SynchronizationDemo {

    @SneakyThrows
    static  void splitWords(List<String> list, String str) {
        String[] words = str.split(" ");
        log.debug("str is '{}'", str);
//        synchronized (list) { // do not allow multiple threads to access this variable
            for(String w: words) {
                list.add(w);
                Thread.sleep(1);
            }
//        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        // resource shared by multiple threads
        List<String> words = new ArrayList<>();

        String sentence1 = "My name is Vinod and I live in Bangalore Karnataka India";
        String sentence2 = "Quick brown fox jumps over the lazy dog";

        log.debug("words are {}", words);
        Thread t1 = new Thread(()->splitWords(words, sentence1));
        t1.setPriority(Thread.MIN_PRIORITY);


        Thread t2 = new Thread(()->splitWords(words, sentence2));
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        log.debug("words are {}", words);
    }
}
