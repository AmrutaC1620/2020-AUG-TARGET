package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddPersonToPeopleTable {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // DbUtil is loaded explicitly to the VM
        // Class.forName("com.target.training.util.DbUtil");

        try(
                Connection conn = DbUtil.createConnection(); // DbUtil is loaded implicitly to the VM
                Statement stmt = conn.createStatement();
        ){
            int id = KeyboardUtil.getInt("Enter id: ");
            String name = KeyboardUtil.getString("Enter name: ");
            String city = KeyboardUtil.getString("Enter city: ");

            String sql = String.format("insert into people values (%d, '%s', '%s')", id, name, city);
            stmt.execute(sql);
            System.out.println("New person data added to table PEOPLE");
        }
    }
}
