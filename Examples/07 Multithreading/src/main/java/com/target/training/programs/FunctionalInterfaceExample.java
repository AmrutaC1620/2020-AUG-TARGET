package com.target.training.programs;

@FunctionalInterface
interface Hello {
    public void sayHello(String name);
}

class EnglishHello implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

class ChineseHello implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("你好 " + name);
    }
}

public class FunctionalInterfaceExample {

    static void greet(Hello hello) {
        System.out.println("hello is an instanceof " + hello.getClass().getName());
        hello.sayHello("Vinod");
        System.out.println();
    }

    public static void main(String[] args) {

        greet(new EnglishHello());
        greet(new ChineseHello());
        greet(new Hello() {
            @Override
            public void sayHello(String name) {
                System.out.println("こんにちは " + name);
            }
        });
        greet(name -> System.out.println("こんにちは " + name));
        greet(name -> System.out.println("ಹಲೋ " + name));

        // greet() takes an object of a functional interface as parameter, and we are supplying the body for the abstract method
    }
}
