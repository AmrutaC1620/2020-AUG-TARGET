package com.target.training.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class TryFinallyDemo {

    public static void main(String[] args) throws Exception {
        FileWriter writer = null;

        try {
            writer = new FileWriter("~/Desktop/names.txt");
            writer.write("vinod");
            // do stuff
            // if any exception is thrown, the application will break the execution
            // but still goes to finally block, where any c++/native resource is
            // open, will be closed.
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        // post JDK1.7, you have try-with-resources block
        try(FileReader reader = new FileReader("~/Desktop/names.txt");
            BufferedReader in = new BufferedReader(reader);) {

            String line = in.readLine();
        }
        // when you come out of try block,
        // in.close() and reader.close() will be called automatically.
        // Because of which, we do not use finally block anymore
    }
}
