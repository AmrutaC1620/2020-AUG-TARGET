package com.target.training.dao.impl;

import com.target.training.dao.DaoException;
import com.target.training.dao.ProductDao;

public class JdbcProductDao implements ProductDao {

    @Override
    public int count() throws DaoException {
        return 1000;
    }
}
