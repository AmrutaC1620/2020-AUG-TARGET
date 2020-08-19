package com.target.training.programs;

import lombok.Data;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@Data
class DbReader {
    private Connection conn;
    private String table;

    public DbReader(Connection conn, String table) {
        this.conn = conn;
        this.table = table;
    }

    public void printRecords() {
        String sql = "select * from " + table;
        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                System.out.println(rs.getString(1) + " --> " + rs.getString(2));
                Thread.sleep(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

public class ReadFromDatabaseTables {

    @SneakyThrows
    public static void main(String[] args) {
        String url = "jdbc:h2:tcp://localhost/~/northwind";
        String user = "root";
        String password = "Welcome#123";
        Connection conn = DriverManager.getConnection(url, user, password);

        // Thread 1 - read from CUSTOMERS table
        Thread t1 = new Thread(() -> new DbReader(conn, "CUSTOMERS").printRecords());

        // Thread 2 - read from SUPPLIERS table
        Thread t2 = new Thread(() -> new DbReader(conn, "SUPPLIERS").printRecords());

        // Thread 3 - read from PRODUCTS table
        Thread t3 = new Thread(() -> new DbReader(conn, "PRODUCTS").printRecords());

        t1.start(); // creates a stack; puts t1.run() -> dbReader.run() in that stack
        t2.start(); // creates a stack; puts t2.run() -> dbReader.run() in that stack
        t3.start(); // creates a stack; puts t3.run() -> dbReader.run() in that stack


        t1.join();
        t2.join();
        t3.join();
        conn.close(); // when all jobs are finished
    }
}
