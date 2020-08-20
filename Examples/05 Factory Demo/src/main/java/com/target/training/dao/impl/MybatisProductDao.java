package com.target.training.dao.impl;

import com.target.training.dao.DaoException;
import com.target.training.dao.ProductDao;

public class MybatisProductDao implements ProductDao {

    @Override
    public int count() throws DaoException {
        return 500;
    }
}
