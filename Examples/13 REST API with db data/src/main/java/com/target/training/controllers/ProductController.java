package com.target.training.controllers;

import com.target.training.dao.ProductRepository;
import com.target.training.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

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
        try {
            return repo.findById(productId).get();
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No product found for id " + productId);
        }
    }

    @PostMapping(consumes = "application/json")
    public Product addNewProduct(@RequestBody Product product) {
        // remove the productId, so that product is 'INSERT'ed and not 'UPDATE'd
        product.setProductId(null);
        return repo.save(product); // insert if PKey is null else update
    }
}
