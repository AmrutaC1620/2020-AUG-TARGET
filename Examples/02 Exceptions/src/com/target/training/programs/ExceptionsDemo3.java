package com.target.training.programs;

import java.util.Arrays;

public class ExceptionsDemo3 {
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
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Please supply two inputs and the second one shouldn't be zero!");
        } catch (NumberFormatException e) {
            System.out.println("Only integers are allowed!");
        } catch (Exception e) {
            // default handler for all exception types
            System.out.println("Something went wrong!");
        }

        System.out.println("End of main()");
    }
}
