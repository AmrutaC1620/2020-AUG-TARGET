package com.target.training.programs;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@NoArgsConstructor
class ExampleThread extends Thread {
    // this class inherits many methods, including a special function called
    // public void run() which is almost empty.

    // This class also has a member variable called 'target' of type Runnable,
    // which is an interface, which by default is null.

    // most of the time, you may
    // 1. override the inherited run()
    // 2. if this is not a subclass of Thread, pass the run() of this class
    //    to a different thread object.


    public ExampleThread(String name) {
        super(name);
    }

    @SneakyThrows
    @Override
    public void run() {
        long ms1 = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.printf("Value of i in ExampleThread.run() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(1);
        }
        long ms2 = System.currentTimeMillis();
        System.out.println("Total time taken is: " + (ms2 - ms1));
    }
}

public class CustomThreadDemo {
    @SneakyThrows
    public static void main(String[] args) {
        ExampleThread et = new ExampleThread("ExThread-1");
        ExampleThread et2 = new ExampleThread("ExThread-2");
        // this is just a Thread object, not associated with any stack

        // in order to associate 'et' with a stack, we have to call et.start()
        et.start();
        et2.start();
        // this creates a stack and places et.run() in the stack as a stack-frame

        long ms1 = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.printf("Value of i in CustomThreadDemo.main() [%s] is %d\n", Thread.currentThread().getName(), i);
            Thread.sleep(1);
        }
        long ms2 = System.currentTimeMillis();
        System.out.println("Total time taken is: " + (ms2 - ms1));
    }
}
