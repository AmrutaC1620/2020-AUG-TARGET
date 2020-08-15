package com.target.training.programs;

import com.target.training.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) throws Exception {

        try(
                Connection conn = DbUtil.createConnection();
                Statement stmt = conn.createStatement();
                ){
            String sql = "create table people(id int primary key, name varchar(25), city varchar(25))";
            stmt.execute(sql);
            System.out.println("Table 'people' created successfully!");
        }

    }
}
