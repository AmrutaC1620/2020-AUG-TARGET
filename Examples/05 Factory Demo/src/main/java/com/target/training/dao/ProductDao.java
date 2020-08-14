package com.target.training.dao;

import com.target.training.entity.Product;

import java.util.List;

public interface ProductDao {
    // CRUD OPERATIONS
    public default void addProduct(Product product) throws DaoException {
        throw new DaoException("method not implemented!");
    }

    public default Product getProduct(int id) throws DaoException {
        throw new DaoException("method not implemented!");
    }

    public default void updateProduct(Product product) throws DaoException {
        throw new DaoException("method not implemented!");
    }

    public default void deleteProduct(int id) throws DaoException {
        throw new DaoException("method not implemented!");
    }


    // QUERIES
    public default List<Product> getAllProducts() throws DaoException{
        throw new DaoException("method not implemented!");
    }

    public default List<Product> getProductsByBrand(String brand) throws DaoException{
        throw new DaoException("method not implemented!");
    }

    public default List<Product> getProductsByCategory(String category) throws DaoException{
        throw new DaoException("method not implemented!");
    }

    public default List<Product> getProductsByPriceRange(double min, double max) throws DaoException{
        throw new DaoException("method not implemented!");
    }

    public default int count() throws DaoException {
        throw new DaoException("method not implemented!");
    }
}
