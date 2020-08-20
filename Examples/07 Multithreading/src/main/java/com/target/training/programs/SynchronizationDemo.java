package com.target.training.programs;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class SynchronizationDemo {

    @SneakyThrows
    static synchronized void splitWords(List<String> list, String str) {
        String[] words = str.split(" ");
        log.debug("str is '{}'", str);
//        synchronized (list) {
            for (String w : words) {
                list.add(w);
                Thread.sleep(1);
            }
//        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        String sentence1 = "My name is Vinod and I live in Bangalore Karnataka India";
        String sentence2 = "Quick brown fox jumps over the lazy dog";

        Thread t1 = new Thread(() -> splitWords(words, sentence1));
        Thread t2 = new Thread(() -> splitWords(words, sentence2));

        t1.start();
        t2.start();
        // at this time, there are 3 threads that are using the List called 'words' -> main, Thread-0, Thread-1

        // wait for all threads to finish their jobs and then continue
        t1.join();
        t2.join();
        log.debug("words are {}", words);
    }
}
