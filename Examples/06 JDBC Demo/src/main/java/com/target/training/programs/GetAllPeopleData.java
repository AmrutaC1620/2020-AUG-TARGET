package com.target.training.programs;

import com.target.training.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllPeopleData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql = "select * from people";

        try(
                Connection conn = DbUtil.createConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            while (rs.next()) {
                int id = rs.getInt("id"); // id is the column name; you may also use the column index (starting from 1)
                String name = rs.getString(2); // 2 is the index of column "name"
                String city = rs.getString("city");

                System.out.println("ID     : " + id);
                System.out.println("Name   : " + name);
                System.out.println("City   : " + city);
                System.out.println();
            }
        }
    }
}
