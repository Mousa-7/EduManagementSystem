package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=StudentDB;encrypt=false;";
    private static final String USER = "sa";
    private static final String PASS = "12345";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Connection Failed: " + ex.getMessage());
            return null;
        }
    }
}
