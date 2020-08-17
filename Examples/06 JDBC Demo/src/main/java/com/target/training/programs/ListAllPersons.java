package com.target.training.programs;

import com.target.training.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListAllPersons {

    public static void main(String[] args) {
        String sql = "SELECT * FROM PEOPLE";

        try(
                Connection conn = DbUtil.createConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ) {

            while (rs.next()) {
                int id = rs.getInt(1); // 1--> column index, id --> column name
                String name = rs.getString(2); // 2 --> column index, name --> column name
                String city = rs.getString("city");

                System.out.println("ID     : " + id);
                System.out.println("Name   : " + name);
                System.out.println("City   : " + city);
                System.out.println();
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
