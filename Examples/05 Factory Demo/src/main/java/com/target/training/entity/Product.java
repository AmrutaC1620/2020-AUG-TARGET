package com.target.training.entity;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private String unitPrice;
    private String discount;
}
