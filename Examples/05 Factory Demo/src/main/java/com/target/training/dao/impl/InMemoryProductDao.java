package com.target.training.dao.impl;

import com.target.training.dao.DaoException;
import com.target.training.dao.ProductDao;
import com.target.training.entity.Product;

import java.util.ArrayList;
import java.util.List;

// NOTE: do not write any keyboard read statements here.
public class InMemoryProductDao implements ProductDao {

    private List<Product> products = new ArrayList<Product>();
    // please add few hard-coded products in the constructor for ease of work

    @Override
    public void addProduct(Product product) throws DaoException {
        this.products.add(product);
    }

    @Override
    public Product getProduct(int id) throws DaoException {
        return null;
    }

    @Override
    public void updateProduct(Product product) throws DaoException {

    }

    @Override
    public void deleteProduct(int id) throws DaoException {

    }

    @Override
    public List<Product> getAllProducts() throws DaoException {
        return null;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) throws DaoException {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(String category) throws DaoException {
        return null;
    }

    @Override
    public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
        return null;
    }

    @Override
    public int count() throws DaoException {
        return 0;
    }
}
