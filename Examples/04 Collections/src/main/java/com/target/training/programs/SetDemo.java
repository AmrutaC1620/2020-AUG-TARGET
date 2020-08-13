package com.target.training.programs;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        System.out.println("hashCode for Vinod is " + "Vinod".hashCode());

        Set<String> names = new HashSet<String>();
        names.add("Vinod"); // "Vinod" --> hashcode --> hash function --> evaluates to a index of an array
        names.add("Shyam");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Vinod");
        names.add("Harish");
        names.add("Anand");

        System.out.println("names is " + names);




    }
}
