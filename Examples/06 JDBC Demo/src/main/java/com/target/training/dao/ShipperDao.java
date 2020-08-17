package com.target.training.dao;

import com.target.training.entity.Shipper;

import java.util.List;

public interface ShipperDao {
    // CRUD OPERATIONS

    public void addShipper(Shipper shipper) throws DaoException;

    public Shipper getShipperById(int shipperId) throws DaoException;

    // QUERIES
    public List<Shipper> getAll() throws DaoException;
}
