package com.target.training.programs;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDbConnection {
    public static void main(String[] args) {
        String url = "jdbc:h2:tcp://localhost/~/targetdb";
        String user = "root";
        String password = "Welcome#123";
        try (
                // here you  may declare/initialize variables of AutoCloseable types
                Connection conn = DriverManager.getConnection(url, user, password);
        ) {
            System.out.println("Got a connection of type: " + conn.getClass().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        } // if 'conn' is ever open, it gets closed at this time
    }
}
