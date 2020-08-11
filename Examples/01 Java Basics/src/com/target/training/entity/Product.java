package com.target.training.entity;

public class Product {
    // state - data held by an object of this class
    // fields/member-variables/attributes
    private int id;
    private String name;
    private double price;

    // behavior - functionality exhibited by an object of this class
    // member methods/functions

    // accessors / getters / readable property
    public int getId() {
        return id;
    }

    // mutators / setters / writable property
    public void setId(int id) {
        if (id < 0) {
            throw new RuntimeException("ID cannot be negative!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Name cannot be null!");
        }
        if (name.length() < 3 || name.length() > 25) {
            throw new RuntimeException("Name must be between 3 to 25 letters!");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative!");
        }
        this.price = price;
    }

    public void print() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Price  : ₹" + price);
        System.out.println("--------------------------------");
    }
}
