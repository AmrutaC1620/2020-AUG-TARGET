package com.target.training.programs;

import java.util.Arrays;

public class ExceptionsDemo2 {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Need two inputs!");
            return; // takes the control out of main()
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide an integer by zero");
        } catch (NumberFormatException e) {
            System.out.println("Only integers are allowed!");
            // no time to visit finally block!!!
            System.exit(1); // 0--> normal termination; non-zero--> erroneous termination
        } catch (Exception e) {
            // default handler for all exception types
            System.out.println("Something went wrong!");
        } finally {
            // use of this block is to close any open resources such as
            // files, sockets, db connections and any other resources
            // that make use of native (c++) code.

            // Since JDK 1.7 introduced try-with-resources syntax,
            // if the only purpose of finally block is to close any
            // open resources, it is not required to do so anymore.
            System.out.println("Executed always (more or less)");
        }

        System.out.println("End of main()");
        System.exit(0); // normal termination
    }
}
