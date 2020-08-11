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

//        p1.print();

        Product p2 = new Product();
        p2.setId(22);
        p2.setName("Logitech Keyboard");
        p2.setPrice(1290);

//        p2.print();

//        UsingProduct up = new UsingProduct();
//        up.print(p1);
//        up.print(p2);

        UsingProduct.print(p1);
        UsingProduct.print(p2);
    }

    // a static function can be called using the name of the class,
    // and there is no need to create an object to invoke the same.
    // C-like function, procedure oriented approach!!
    static void  print(Product pr) {
        System.out.println("ID     : " + pr.getId());
        System.out.println("Name   : " + pr.getName());
        System.out.println("Price  : ₹" + pr.getPrice());
        System.out.println("-----------------------------------");
    }
}
