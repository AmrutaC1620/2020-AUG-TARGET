package com.target.training.dao;

import javax.sql.rowset.JdbcRowSet;

public final class DaoFactory {

    private static final String IMPL_TYPE;

    static {
        // read from properties file (exercise)
        IMPL_TYPE = "jdbc"; // temporary  fix
    }

    private DaoFactory() {
    }

    public static ShipperDao getShipperDao() throws DaoException {
        switch (IMPL_TYPE) {
            case "jdbc":
                return new ShipperDaoJdbcImpl();
            // more cases to follow...
        }

        throw new DaoException("Invalid type for DAO implementation: " + IMPL_TYPE);
    }
}
