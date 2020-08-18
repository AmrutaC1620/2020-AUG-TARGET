package com.target.training.programs;


import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@NoArgsConstructor
class MyCustomThread extends Thread {

    public MyCustomThread(String name) {
        super(name);
    }

    // by inheritance, this class already has a (more or less) empty run() method;
    // it's most common to override this run() or supply via a Runnable (interface) object
    @lombok.SneakyThrows
    @Override
    public void run() {
        for(int i=1; i<=15; i++) {
            System.out.printf("value of i in MyCustomThread.run() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(100);
        }
    }
}

public class UserDefinedThreadDemo {

    @SneakyThrows
    public static void main(String[] args) {
        MyCustomThread mct = new MyCustomThread("MyCustomThread-1");
        // to associate a thread object's run() function with a Stack, we have to call
        // a function called "start()" from Thread class
        mct.start();
        // At the end of above statement, a new stack is created, run() of the thread (mct)
        // is placed in the stack, added to the scheduler for allocating cpu time
        for(int i=1; i<=15; i++) {
            System.out.printf("value of i in UserDefinedThreadDemo.main() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(100);
        }
    }
}
