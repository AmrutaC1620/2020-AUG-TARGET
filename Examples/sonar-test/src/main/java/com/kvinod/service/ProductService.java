package com.kvinod.service;

import com.kvinod.repository.ProductRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductService {

    private ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }
    
    public int getProductCount() {
        return this.repo.count();
    }
}
