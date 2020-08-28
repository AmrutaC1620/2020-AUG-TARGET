package com.target.training.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(generator = "increment") // SELECT MAX(PRODUCT_ID) +1 FROM PRODUCTS;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;

    // MANY products are supplied by ONE supplier
    @ManyToOne
    @JoinColumn(name="supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "units_in_stock")
    private Integer unitsInStock;
    @Column(name = "units_on_order")
    private Integer unitsOnOrder;
    @Column(name = "reorder_level")
    private Integer reorderLevel;
    private Boolean discontinued;
}
