package com.target.training.controllers;

import com.target.training.dao.CustomerRepository;
import com.target.training.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/customers", produces = "application/json")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping(path="/{customerId}")
    public Customer getById(@PathVariable String customerId) {
        return repo.findById(customerId.toUpperCase()).get();
    }

    @GetMapping
    public Iterable<Customer> getAll() {
        return repo.findAll();
    }
}
