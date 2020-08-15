package com.target.training.programs;

import com.target.training.util.DbUtil;
import com.target.training.util.KeyboardUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String sql = "insert into people values (?, ?, ?)"; // question marks --> parameters
        try(
                Connection conn = DbUtil.createConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                // IN THE ABOVE STATEMENT, THE SQL COMMAND WITH ??? ARE SENT TO THE SERVER AND COMES BACK
                // WITH A UNIQUE ID REPRESENTING THE PRECOMPILED SQL COMMAND ON THE SERVER SIDE, AND THIS
                // ID IS NOW PART OF THE VARIABLE 'stmt'
        ){
            while (true) {
                int id = KeyboardUtil.getInt("Enter id: ");
                String name = KeyboardUtil.getString("Enter name: ");
                String city = KeyboardUtil.getString("Enter city: ");

                // SET THE VALUES FOR PARAMETERS
                stmt.setInt(1, id);
                stmt.setString(2, name);
                stmt.setString(3, city);
                stmt.executeUpdate(); // SEND THE ID (OF PRECOMPILED SQL COMMAND STORED IN SERVER) AND VALUES FOR PARAMETERS TO SERVER
                System.out.println("New person data added to table PEOPLE");

                String choice = KeyboardUtil.getString("Do you want to add another ? yes/no: (yes)");
                if(choice.equalsIgnoreCase("no")) break;
            }
        }
    }
}
