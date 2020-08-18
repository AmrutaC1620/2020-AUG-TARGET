package com.target.training.programs;

public class WorkingOfStack {

    static void zap(String str) {
        System.out.println("Zap: " + str);
    }

    static void bar(String str) {
        System.out.println("Bar: " + str);
    }

    static void foo() {
        bar("Hello");
        zap("Hi");
        bar("Welcome");
    }

    static void test() {
        foo();
        zap("Howdy!");
    }

    public static void main(String[] args) {
        test();
    }
}
