
package com.mycompany.config;

// Importa clases necesarias para manejar la conexión a la base de datos
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    // Declaración de variables estáticas para los detalles de la conexión a la base de datos
    private static String database="bd_carrito"; //nombre de la base de datos
    private static String username="root"; // nombre de usuario para la base de datos
    private static String password="1234"; // contraseña para la base de datos
    private static String url="jdbc:mysql://localhost:3306/"+ database; //URL de conexión a la base de datos
    
    // Método estático para obtener una conexión a la base de datos
    public static Connection getConnection(){
        Connection conn = null; // Declaración de la variable de conexión
        try {
            // Carga el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Intenta establecer la conexión con la base de datos usando los detalles especificados
            conn = DriverManager.getConnection(url, username, password);
            // Imprime un mensaje indicando que la conexión se estableció correctamente
            System.out.println("Conexion establecida!");
        } catch (Exception ex) {
            // Imprime el stack trace si ocurre alguna excepción durante la conexión
            ex.printStackTrace();
        }
        return conn;// Devuelve la conexión establecida (o null si falló)
    }
}
