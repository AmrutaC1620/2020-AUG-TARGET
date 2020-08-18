package com.target.training.programs;

import lombok.SneakyThrows;

class MyClass implements  Runnable {

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // This is not a Thread subclass, so there are no functions like start(), ...!
    // But we can ask a thread object to substitute their run() function with our
    // run() function

    @SneakyThrows
    @Override
    public void run() {
        for(int i=1; i<=15; i++) {
            System.out.printf("value of i in MyClass.run() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(100);
        }
    }
}

public class UsingRunnableWithThreads {

    @SneakyThrows
    public static void main(String[] args) {
        // friend thread object who can run someone else's run() function
        MyClass mc = new MyClass();
        Thread t = new Thread(mc); // here mc is an instanceof MyClass, Runnable, Object
        t.start(); // places mc.run() (which is currently t.target.run()) in the stack

        for(int i=1; i<=15; i++) {
            System.out.printf("value of i in UsingRunnableWithThreads.main() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(100);
        }
    }
}
