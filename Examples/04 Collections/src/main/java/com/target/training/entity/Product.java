package com.target.training.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude={"discount", "category", "reorderLevel"})
public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int unitsInStock;
    private double discount;
    private String category;
    private int reorderLevel;
}
