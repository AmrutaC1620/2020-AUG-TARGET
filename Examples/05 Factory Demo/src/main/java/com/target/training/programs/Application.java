package com.target.training.programs;

import com.target.training.dao.DaoException;
import com.target.training.dao.DaoFactory;
import com.target.training.dao.ProductDao;

public class Application {

    public static void main(String[] args) throws DaoException {
        // my application depends on ProductDao
        ProductDao dao;

        // need to initialize dao to an object of an implementing class
        // tight coupling: use 'new' keyword
        // dao = new MybatisProductDao();

        dao = DaoFactory.getProductDao();

        int c = dao.count();

        System.out.println("Total products = " + c);
    }

}
