package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatePersonName {

    public static void main(String[] args) {
        String sql = "update people set name = ? where id = ?";

        try(
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ) {

            int id = KeyboardUtil.getInt("Enter id for searching: ");
            String name = KeyboardUtil.getString("Enter the name to change: ");

            stmt.setString(1, name);
            stmt.setInt(2, id);

            int count = stmt.executeUpdate();
            if(count==0) {
                System.out.println("No changes done to DB, possibly invalid id: " + id);
            }
            else {
                System.out.println("Name changed to '" + name + "' for record with id " + id);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
