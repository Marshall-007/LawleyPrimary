package com.bttp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private Connection connection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/dbmLawleyHighSchool";
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
