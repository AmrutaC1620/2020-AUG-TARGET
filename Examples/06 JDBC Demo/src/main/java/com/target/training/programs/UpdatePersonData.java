package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatePersonData {

    public static void main(String[] args) {

        int id = KeyboardUtil.getInt("Enter id to search: ");
        String sql = "select * from people where id = ?";

        try(
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);

                ) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    String name = getString(rs, "name");
                    String city = getString(rs,"city");

                    sql = "update people set name=?, city=? where id=?";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, name);
                        ps.setString(2, city);
                        ps.setInt(3, id);
                        ps.execute();
                        System.out.println("Person data updated to the DB!");
                    }
                }
                else {
                    System.out.println("No record found for id " + id);
                }
            }

        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    private static String getString(ResultSet rs, String field) throws SQLException {
        String name = rs.getString(field);
        String input = KeyboardUtil.getString("Enter name: (" + name + ") ");
        input = input.trim();
        if(input.length()>0) {
            name = input;
        }
        return name;
    }
}
