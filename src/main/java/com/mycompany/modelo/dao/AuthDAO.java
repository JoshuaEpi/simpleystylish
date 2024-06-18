package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;// Importación de la clase de configuración de conexión
import com.mycompany.modelo.Cliente;// Importación de la clase Cliente del modelo
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthDAO {

    private Connection cn = null;// Objeto de conexión a la base de datos
    private PreparedStatement ps = null;// Objeto para ejecutar consultas preparadas
    private ResultSet rs = null;// Objeto para almacenar resultados de consultas
    
    // Método para realizar el inicio de sesión de un cliente
    public Cliente Login(String correo, String password) {
        Cliente obj = null;// Objeto Cliente que se va a devolver
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select * from Cliente where correo = ? and password = ?";// Consulta SQL parametrizada
            ps = cn.prepareStatement(sql);// Preparar la consulta
            // Establecer los parámetros en la consulta preparada
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado
            
            // Verificar si se encontró un resultado
            if (rs.next()) {
                // Establecer los datos del cliente con los datos obtenidos de la base de datos
                obj = new Cliente();// Crear un nuevo objeto Cliente
                obj.setIdCliente(rs.getInt("id_cli"));
                obj.setNombres(rs.getString("nombres"));
                obj.setApellidos(rs.getString("apellidos"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();// Manejar cualquier excepción imprimiendo el rastreo de la pila
        } finally {
        // Cerrar conexiones y recursos en el bloque finally para asegurar que se liberan correctamente    
            try {
                if (cn != null) {
                    cn.close();// Cerrar la conexión a la base de datos
                }
                if (ps != null) {
                    ps.close();// Cerrar la consulta preparada
                }
                if (rs != null) {
                    rs.close();// Cerrar el resultado de la consulta
                }
            } catch (Exception ex) {
                                    // Manejar cualquier excepción imprimiendo el rastreo de la pila
            }
        }
        return obj;// Devolver el objeto Cliente obtenido de la base de datos o null si no se encontró
    }
}
