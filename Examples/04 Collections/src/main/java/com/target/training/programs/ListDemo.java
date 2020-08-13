package com.target.training.programs;

import java.util.*;

public class ListDemo {

    // loosely coupled function example (polymorphic)
    static void printCollection(List<?> list) {
    }

    // tightly coupled function example (non-polymorphic) !!!! AVOID SUCH FUNCTIONS
    static void printCollection2(ArrayList<?> list) {
    }


    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        Vector<String> list2 = new Vector<String>();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        Stack<Double> stack = new Stack<Double>();

        // calling polymorphic function
        printCollection(list1);
        printCollection(list2);
        printCollection(list3);
        printCollection(stack);

        printCollection2(list1);
//        printCollection2(list2);
//        printCollection2(list3);
//        printCollection2(stack);

        // HETEROGENEOUS
        List list = new ArrayList(); // pre JDK 1.5
        list.add("vinod");
        list.add(123);
        list.add(false);
        list.add(1.2);

        System.out.println(list);

        // HOMOGENEOUS
        List<String> names = new ArrayList<String>(); // post JDK 1.5
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Shyam");
        names.add("Satya");
        System.out.println(names);
        names.add(0, "John");
        names.add(2, "Jane");
        System.out.println(names);
        String name = names.get(3);
        System.out.println("name at index 3 is " + name);

        names.set(2, "Jane Doe");
        System.out.println(names);

    }
}
