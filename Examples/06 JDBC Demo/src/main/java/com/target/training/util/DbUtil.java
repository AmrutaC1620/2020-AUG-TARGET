package com.target.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DbUtil {
    private static String driverClassName;
    private static String url;
    private static String user;
    private static String password;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("jdbc-info"); // jdbc-info.properties in classpath
        driverClassName=rb.getString("jdbc.driverClassName");
        url=rb.getString("jdbc.url");
        user=rb.getString("jdbc.user");
        password=rb.getString("jdbc.password");
    }

    private DbUtil() {
    }

    // creates and returns a new connection everytime this function is called
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driverClassName);
        return DriverManager.getConnection(url, user, password);
    }
}
