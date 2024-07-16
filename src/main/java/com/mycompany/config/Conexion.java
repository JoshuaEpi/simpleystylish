
package com.mycompany.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    // Datos de conexión a la base de datos
    private static String database="bd_carrito";
    private static String username="root";
    private static String password="";
    private static String url="jdbc:mysql://localhost:3306/"+ database;
    // Método estático para obtener una conexión a la base de datos
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// Cargar el driver JDBC de MySQL
            conn = DriverManager.getConnection(url, username, password);// Establecer la conexión usando DriverManager
            System.out.println("Conexion establecida!");// Mensaje de éxito
        } catch (Exception ex) {
            ex.printStackTrace();// Manejo de excepciones en caso de fallo en la conexión
        }
        return conn;// Devolver la conexión establecida (o null si falló)
    }
}
