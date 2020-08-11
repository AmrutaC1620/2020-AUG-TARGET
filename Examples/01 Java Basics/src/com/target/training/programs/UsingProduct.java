package com.target.training.programs;

import com.target.training.entity.Product;

import java.util.Arrays;


public class UsingProduct {

    public static void main(String[] args) {

        int num;
        double pi = 3.1415;
        Product p1; // variable declaration
        p1 = new Product(); // variable initialization / definition

//        System.out.println("num is " + num); // error - uninitialized variable
        System.out.println("pi is " + pi);
        System.out.println("args is " + Arrays.toString(args));
        System.out.println("p1 is " + p1);

        p1.setId(12);
        p1.setName("Logitech Mouse");
        p1.setPrice(899);

        p1.print();

        Product p2 = new Product();
        p2.setId(22);
        p2.setName("Logitech Keyboard");
        p2.setPrice(1290);

        p2.print();
    }

}
