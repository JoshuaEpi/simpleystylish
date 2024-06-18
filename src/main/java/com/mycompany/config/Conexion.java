
package com.mycompany.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    private static String database="bd_carrito";
    private static String username="root";
    private static String password="1234";
    private static String url="jdbc:mysql://localhost:3306/"+ database;
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion establecida!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
