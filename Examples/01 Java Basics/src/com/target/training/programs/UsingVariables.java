package com.target.training.programs;

public class UsingVariables {

    public static void main(String[] args) {

        String name = "Vinod";
        double height = 5.8;
        Integer age = 47;

        System.out.println("My name is " + name);
        System.out.println("My height is " + height + " ft");
        System.out.println("My age is " + age + " years.");

        System.out.println("Minimum value that can be stored in an int is: " + Integer.MIN_VALUE);
        System.out.println("Maximum value that can be stored in an int is: " + Integer.MAX_VALUE);


        System.out.println("Minimum value that can be stored in an long is: " + Long.MIN_VALUE);
        System.out.println("Maximum value that can be stored in an long is: " + Long.MAX_VALUE);

        float massOfElectron = 9.10938356e-31f;
        System.out.println("Mass of an electron is " + massOfElectron + " kg");

    }
}
