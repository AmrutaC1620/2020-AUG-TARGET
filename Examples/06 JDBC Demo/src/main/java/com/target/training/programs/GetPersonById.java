package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.*;

public class GetPersonById {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        int id = KeyboardUtil.getInt("Enter id to search: ");
        String sql = "select * from people where id = ?";

        try(
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if(rs.next()){
                    String name = rs.getString(2); // 2 is the index of column "name"
                    String city = rs.getString("city");

                    System.out.println("ID     : " + id);
                    System.out.println("Name   : " + name);
                    System.out.println("City   : " + city);
                    System.out.println();
                }
                else {
                    System.out.println("Sorry, no result found while searching by id " + id);
                }
            }
        }
    }
}
