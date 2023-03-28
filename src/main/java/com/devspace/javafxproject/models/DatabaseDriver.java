package com.devspace.javafxproject.models;

import java.sql.*;

public class DatabaseDriver {

    private Connection connection;

    public DatabaseDriver() {
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:mazebank.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Client Section
     * */
    public ResultSet getClientData(String pAddress, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM clients WHERE payeeAddress = '" + pAddress + "' AND password = '" + password + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Admin Section
     * */

    /**
     * Utility Section
     * */

}
