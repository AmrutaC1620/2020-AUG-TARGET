package com.target.training.programs;

// Java 8 introduced annotation @FunctionalInterface, to ensure that
// an interface marked with this annotation contains exactly ONE abstract method

@FunctionalInterface
interface Animal {
    public void talk();

    public default void walk() {
    }
}

class Cat implements Animal {
    @Override
    public void talk() {
        System.out.println("Meow...");
    }
}

class Dog implements Animal {
    @Override
    public void talk() {
        System.out.println("Boww...");
    }
}

public class FunctionInterfaceDemo {

    static void printAnimalMessage(Animal a, int num) {
        System.out.println("Got an instance of " + a.getClass().getName() + " type and num is " + num);
        a.talk();
    }

    public static void main(String[] args) {

        printAnimalMessage(new Cat(), 100);
        printAnimalMessage(new Dog(), 200);

        // Animal(){} is a class that implements Animal interface
        printAnimalMessage(new Animal() {
            @Override
            public void talk() {
                System.out.println("Grrr...");
            }
        }, 500);

        // arrow function ()->{} is a representation of an object of
        // a functional interface with the implementation of
        // abstract method
        printAnimalMessage(() -> System.out.println("........"), 299);
    }
}
