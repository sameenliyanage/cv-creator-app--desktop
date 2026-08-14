package com.example.cv;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public Connection dbLink;

    public Connection getConnection() {
        String dbName = "cvapp";
        String dbUser = "root";
        String dbPassword = "";
        String dbUrl = "jdbc:mysql://localhost:3307/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbLink = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            return dbLink;
        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();

            return null;
        }
    }
}
