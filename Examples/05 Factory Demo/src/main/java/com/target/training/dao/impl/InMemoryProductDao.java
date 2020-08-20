package com.target.training.dao.impl;

import com.target.training.dao.DaoException;
import com.target.training.dao.ProductDao;
import com.target.training.entity.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// NOTE: do not write any keyboard read statements here.
public class InMemoryProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();
    // please add few hard-coded products in the constructor for ease of work

    public InMemoryProductDao() {
        // dummy values for ease of work
        Product p;

        p = new Product(1, "Potato", "Orgnically grown potatoes", 45.0);
        products.add(p);
        p = new Product(2, "Tomato", "Farm grown", 28.0);
        products.add(p);
        p = new Product(3, "Banana", "Bananas", 60.0);
        p.setCategory("Fruit");
        products.add(p);
        p = new Product(4, "Raw banana", "Green bananas", 25.0);
        products.add(p);

    }

    @Override
    public void addProduct(Product product) throws DaoException {
        this.products.add(product);
    }

    @Override
    public Product getProduct(int id) throws DaoException {
//        Iterator<Product> it = products.iterator();
//        while(it.hasNext()){
//            Product p = it.next();
//            if(p.getId()==id){
//                return p;
//            }
//        }

        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new DaoException("No product found for id " + id);
    }

    @Override
    public void updateProduct(Product product) throws DaoException {
        boolean found = false;
        for (int i = 0, j = products.size(); i < j; i++) {
            Product p = products.get(i);
            if (p.getId() == product.getId()) {
                products.set(i, product);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new DaoException("No product found for id " + product.getId());
        }
    }

    @Override
    public void deleteProduct(int id) throws DaoException {
       throw new DaoException("Method not implemented yet!");
    }

    @Override
    public List<Product> getAllProducts() throws DaoException {
        return new ArrayList<>();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) throws DaoException {
        return new ArrayList<>();
    }

    @Override
    public List<Product> getProductsByCategory(String category) throws DaoException {
        return new ArrayList<>();
    }

    @Override
    public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
        return new ArrayList<>();
    }

    @Override
    public int count() throws DaoException {
        return 0;
    }
}
