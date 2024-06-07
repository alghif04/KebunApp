package kebunsampahapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/kebunappdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Connection established.");
                connection.close();
            } else {
                System.out.println("Failed to establish connection.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("MySQL JDBC Driver not found. Include it in your library path.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Connection failed. Check output console.");
        }
    }
}
