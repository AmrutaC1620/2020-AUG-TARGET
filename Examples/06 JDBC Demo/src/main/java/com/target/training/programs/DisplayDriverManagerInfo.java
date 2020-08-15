package com.target.training.programs;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DisplayDriverManagerInfo {
    public static void main(String[] args) throws Exception {
        // http://182.50.151.209:80/blog/index.php
        // https://182.50.151.209:443/blog/index.php

        // client_protocol:server_protocol://server_location[:port_number]/db_name
        // jdbc:mysql://localhost:3306/targetdb
        // jdbc:h2:tcp://localhost/~/targetdb
        // jdbc:oracle:thin:@localhost:1521:ORCL    <-- ORCL is the default service id (not database name)
        // jdbc:sqlserver://localhost:1433/targetdb

//        String driverClassName = "org.h2.Driver";
//        String url = "jdbc:h2:tcp://localhost/~/targetdb";
//        String user = "root";
//        String password = "Welcome#123";

        // DriverManager.getConnection(url, user, password);

        // this loads the specified java class to the JVM.
        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Class.forName("oracle.jdbc.driver.OracleDriver");
        // Once this class is loaded, it automatically creates an object of itself, and
        // registers with DriverManager

        System.out.println("Following are the driver objects currently maintained by DriverManager:");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while(drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println(driver.getClass().getName());
        }
    }
}
