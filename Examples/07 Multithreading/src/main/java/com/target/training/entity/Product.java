package com.target.training.entity;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;
    private int unitsInStock;

    public Product(int id, String name, double price, int unitsInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    // this method provides logic for natural ordering of two products
    @Override
    public int compareTo(Product o) {
        return this.id - o.id;
    }
}
