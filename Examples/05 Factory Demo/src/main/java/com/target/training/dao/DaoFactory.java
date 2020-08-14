package com.target.training.dao;

import com.target.training.dao.impl.FileProductDao;
import com.target.training.dao.impl.InMemoryProductDao;
import com.target.training.dao.impl.JdbcProductDao;
import com.target.training.dao.impl.MybatisProductDao;

import java.util.ResourceBundle;

// final class with private constructor ensures that the class cannot be instantiated!!
public final class DaoFactory {

    private static final String discriminator;

    // static blocks are executed only once when the class is loaded into VM
    static {
        // to read values for keys in a .properties file use ResourceBundle
        ResourceBundle rb = ResourceBundle.getBundle("dao"); // assumes extension as .properties
        discriminator = rb.getString("discriminator.type");

        // discriminator = System.getenv("DISCRIMINATOR_TYPE");
    }

    private DaoFactory() {
    }

    public static ProductDao getProductDao() throws DaoException {

        switch (discriminator.toLowerCase()) {
            case "jdbc":
                return new JdbcProductDao();
            case "file":
                return new FileProductDao();
            case "mybatis":
                return new MybatisProductDao();
            case "in-memory":
                return new InMemoryProductDao();
            default:
                throw new DaoException("Unknown type '" + discriminator + "' for discriminator");
        }
    }
}
