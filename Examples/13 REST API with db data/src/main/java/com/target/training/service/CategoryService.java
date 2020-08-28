package com.target.training.service;

import com.target.training.dao.CategoryRepository;
import com.target.training.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category getOneCategory(Integer id) {
        return repo.findById(id).get();
    }

    public Iterable<Category> getAllCategories() {
        return repo.findAll();
    }
}
