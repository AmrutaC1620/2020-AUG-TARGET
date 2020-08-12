package com.target.training.programs;

import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));

        try {
            String input1 = args[0];
            String input2 = args[1];

            int num = Integer.parseInt(input1);
            int den = Integer.parseInt(input2);

            int quot = num / den;
            int rem = num % den;

            System.out.printf("%d DIV %d = %d and %d MOD %d = %d\n", num, den, quot, num, den, rem);
        } catch (Exception e) {
            System.out.println("OOPS. There was an exception!");
            System.out.println("Exception of type: " + e.getClass());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("End of main()");
    }
}
