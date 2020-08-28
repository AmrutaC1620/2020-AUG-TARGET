package com.target.training.controllers;

import com.target.training.dao.ProductRepository;
import com.target.training.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/products", produces = "application/json")
public class ProductController {

    @Autowired
    ProductRepository repo;

    @GetMapping
    public Iterable<Product> getAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/{productId}")
    public Product getById(@PathVariable Integer productId) {
        return repo.findById(productId).get();
    }
}
