package com.target.training.service;

import com.target.training.dao.DaoException;
import com.target.training.dao.DaoFactory;
import com.target.training.dao.ShipperDao;
import com.target.training.entity.Shipper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipperManager {

    // facade
    public Shipper getShipper(int id) throws ServiceException {
        try {
            return DaoFactory.getShipperDao().getShipperById(id);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    public Map<String, String> updateShipper(Shipper shipper) throws ServiceException {
        try{
            Map<String, String> errors = new HashMap<>();

            String companyName = shipper.getCompanyName();
            if (companyName == null || companyName.trim().length() < 3) {
                errors.put("companyName", "Company name must have at least 3 letters");
            }
            if (companyName != null && companyName.trim().length() > 25) {
                errors.put("companyName", "Company name cannot be lengthier than 25 letters");
            }

            // add more validations for phone

            if(errors.size()>0) {
                return errors;
            }

            ShipperDao dao = DaoFactory.getShipperDao();
            dao.updateShipper(shipper);
            return null;
        }
        catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }
    public Map<String, String> addNewShipper(Shipper shipper) throws ServiceException {
        Map<String, String> errors = new HashMap<>();
        try {
            // check for valid inputs id, company-name, phone
            if (shipper.getShipperId() <= 0) {
                errors.put("shipperId", "Invalid shipper id; must be >= 1");
            }

            String companyName = shipper.getCompanyName();
            if (companyName == null || companyName.trim().length() < 3) {
                errors.put("companyName", "Company name must have at least 3 letters");
            }
            if (companyName != null && companyName.trim().length() > 25) {
                errors.put("companyName", "Company name cannot be lengthier than 25 letters");
            }

            // check if id already present in the table
            ShipperDao dao = DaoFactory.getShipperDao();
            Shipper s1 = dao.getShipperById(shipper.getShipperId());
            if (s1 != null) {
                errors.put("shipperId", "There's a shipper with this id in our database");
            }

            if (errors.size() > 0) {
                return errors;
            }

            // add the shipper using dao
            dao.addShipper(shipper);
            return null;
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    // this function in the service tier has no value addition (at this time).
    // Such a function is called as facade function
    public List<Shipper> getAllShippers() throws ServiceException {
        try {
            ShipperDao dao = DaoFactory.getShipperDao();
            return dao.getAll();
        } catch (DaoException e) {
            throw new ServiceException(e); // exception funnelling
        }
    }

    public Map<String, String> deleteShipper(int id) throws ServiceException{
        try {
            Map<String, String> errors = new HashMap<>();

            if(id<=0) {
                errors.put("id", "ID must be > 0");
            }

            ShipperDao dao = DaoFactory.getShipperDao();
            Shipper shipper = dao.getShipperById(id);
            if(shipper==null) {
                errors.put("id", "No shipper data found for id " + id);
            }

            if (errors.size() > 0) {
                return errors;
            }

            dao.deleteShipperById(id);

            return null;
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }
}
