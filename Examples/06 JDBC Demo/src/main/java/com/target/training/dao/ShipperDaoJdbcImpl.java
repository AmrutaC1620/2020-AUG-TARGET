package com.target.training.dao;

import com.target.training.entity.Shipper;
import com.target.training.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipperDaoJdbcImpl implements ShipperDao {

    @Override
    public void addShipper(Shipper shipper) throws DaoException {
        String sql = "insert into shippers values (?, ?, ?)";

        try (
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, shipper.getShipperId());
            stmt.setString(2, shipper.getCompanyName());
            stmt.setString(3, shipper.getPhone());
            stmt.execute();
        } catch (Exception ex) {
            throw new DaoException(ex);
        }

    }

    @Override
    public Shipper getShipperById(int shipperId) throws DaoException {
        String sql = "select * from shippers where shipper_id=?";
        try (
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, shipperId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String companyName = rs.getString("company_name");
                    String phone = rs.getString("phone");

                    return new Shipper(shipperId, companyName, phone);
                }
            }
        } catch (Exception ex) {
            throw new DaoException(ex);
        }
        return null;
    }

    @Override
    public void updateShipper(Shipper shipper) throws DaoException {
        String sql = "update shippers set company_name=?, phone=? where shipper_id=?";

        try (
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, shipper.getCompanyName());
            stmt.setString(2, shipper.getPhone());
            stmt.setInt(3, shipper.getShipperId());
            stmt.execute();
        } catch (Exception ex) {
            throw new DaoException(ex);
        }
    }

    @Override
    public void deleteShipperById(int shipperId) throws DaoException {
        String sql = "delete from shippers where shipper_id=?";

        try (
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, shipperId);
            stmt.execute();
        } catch (Exception ex) {
            throw new DaoException(ex);
        }
    }

    @Override
    public List<Shipper> getAll() throws DaoException {
        List<Shipper> list = new ArrayList<>();
        String sql = "select * from shippers";

        try (
                Connection conn = DbUtil.createConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                int shipperId = rs.getInt("shipper_id");
                String companyName = rs.getString("company_name");
                String phone = rs.getString("phone");

                Shipper shipper = new Shipper(shipperId, companyName, phone);
                list.add(shipper);
            }
        } catch (Exception ex) {
            // rethrow exception as DaoException --> Decorator pattern
            throw new DaoException(ex);
        }

        return list;
    }
}
