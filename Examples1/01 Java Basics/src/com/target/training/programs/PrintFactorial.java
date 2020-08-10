package com.target.training.programs;

public class PrintFactorial {

    public static long factorial(int num) {
        long fact = 1;

        for(int i=1; i<=num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num = 10;
        long f = factorial(num);

        System.out.printf("Factorial of %d is %d\n", num, f);


    }
}
