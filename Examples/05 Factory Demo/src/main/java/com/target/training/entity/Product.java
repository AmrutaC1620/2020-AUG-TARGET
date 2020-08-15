package com.target.training.entity;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private String brand = "Fresho";
    private String category = "Vegetable";
    private double unitPrice;
    private double discount = 0.0;

    public Product(int id, String name, String description, double unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }
}
