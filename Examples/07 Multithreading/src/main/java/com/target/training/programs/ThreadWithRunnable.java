package com.target.training.programs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

@Data
class FileProcessor {
    private String filename;

    public FileProcessor(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public void processFile() {
        for (int i = 1; i <= 250000; i++) {
            System.out.printf("processing the file '%s'...\n", filename);
//            Thread.sleep(125);
        }
    }
}

@AllArgsConstructor
class MyRunnableClass implements  Runnable {
    private String filename;

    @Override
    public void run() {
        FileProcessor fp = new FileProcessor(filename);
        fp.processFile();
    }
}

public class ThreadWithRunnable {

    @SneakyThrows
    public static void main2(String[] args) {
        //Total time taken = 14286 ms.
        String[] filenames = {"a.txt", "b.txt", "c.txt", "d.txt"};
        long ms1 = System.currentTimeMillis();
        Thread[] t = new Thread[filenames.length];

        for (int i=0; i< filenames.length; i++) {
            // we need to replace t.run() with our own run()
            Runnable mrc = new MyRunnableClass(filenames[i]);
            t[i] = new Thread(mrc); // t.run() calls mrc.run()
            t[i].start();
        }

        for(Thread tr: t){
            tr.join();
        }
        // tr.join() --> allows the following code to be executed, only
        // after tr is dead (tr.run() has finished it's execution)
        long ms2 = System.currentTimeMillis();
        System.out.println("Total time taken = " + (ms2-ms1) + " ms.");
    }

    public static void main(String[] args) {
        // Total time taken = 19265 ms.
        String[] filenames = {"a.txt", "b.txt", "c.txt", "d.txt"};
        long ms1 = System.currentTimeMillis();
        for (String filename : filenames) {
            FileProcessor fp = new FileProcessor(filename);
            fp.processFile();
        }
        long ms2 = System.currentTimeMillis();
        System.out.println("Total time taken = " + (ms2-ms1) + " ms.");
    }
}
