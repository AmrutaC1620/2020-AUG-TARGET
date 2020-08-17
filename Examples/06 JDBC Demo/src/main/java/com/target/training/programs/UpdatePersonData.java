package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
                    String name = rs.getString("name");
                    String input = KeyboardUtil.getString("Enter name: (" + name + ") ");
                    input = input.trim();
                    if(input.length()>0) {
                        name = input;
                    }

                    String city = rs.getString("city");
                    input = KeyboardUtil.getString("Enter city: (" + city + ") ");
                    input = input.trim();
                    if(input.length()>0) {
                        city = input;
                    }

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
}
