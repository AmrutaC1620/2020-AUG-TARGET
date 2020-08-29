package com.target.controllers;

import com.target.entity.Shipper;
import com.target.repositories.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/shippers", produces = "application/json")
public class ShipperController {

    @Autowired
    ShipperRepository repo;

    @GetMapping
    public Iterable<Shipper> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Shipper getById(@PathVariable Integer id){
        return repo.findById(id).get();
    }
}
