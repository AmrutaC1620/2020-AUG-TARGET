package com.target.training.programs;

class Animal {
    public void talk() {
        System.out.println("Animal talking...");
    }

    public void eat() {
        System.out.println("Animal eating...");
    }
}

class Cat extends Animal {
    public void furr() {
        System.out.println("Cat furring...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating...");
    }

    @Override
    public void talk() {
        System.out.println("Cat says meow...");
    }
}

class Dog extends Animal {
    public void playWithHuman() {
        System.out.println("Dog playing with a human...");
    }

    @Override
    public void talk() {
        System.out.println("Dog is barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating...");
    }
}

public class PolymorphismDemo {
    static void printAnimalInfo(Animal a) {
        System.out.println("Type of animal got is: " + a.getClass().getName());
        a.eat(); // gives different output based on the object it refers to
        a.talk();

        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.furr();
        }
        else if(a instanceof Dog) {
            ((Dog)a).playWithHuman();
        }

        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat(); // instance of Cat/Animal/Object
        Dog d = new Dog();

        printAnimalInfo(a);
        printAnimalInfo(c);
        printAnimalInfo(d);
    }
}

// Book ->> Notebook, TextBook, Novel, ComicBook, <<-- hard copy books
//          Kindle, MobilePhone, Laptop,

// read() --> File, remote Browser, network socket, database
// close() --> File, Socket, Database, ...