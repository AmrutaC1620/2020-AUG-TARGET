package com.target.training.controllers;

import com.target.training.entity.Category;
import com.target.training.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/categories", produces = "application/json")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping()
    public Iterable<Category> getAllCategories() {
        return service.getAllCategories();
    }

    @GetMapping(path="/{id}")
    public Category getOneCategory(@PathVariable Integer id) {
        return service.getOneCategory(id);
    }

}
