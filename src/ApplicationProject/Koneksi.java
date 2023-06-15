/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApplicationProject;
import java.sql.*;
/**
 *
 * @author novad
 */
public class Koneksi {
    private static Connection conn;
    
    public static Connection koneksi() {
        try {
            // Load the MySQL JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
        String url = "jdbc:mysql://localhost:3306/carwash";
        String user = "root";
        String password = "";
        conn = DriverManager.getConnection(url, user, password);
        
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return conn;
    }
    
    public static void closeConnection() {
        if(conn!= null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }
}

