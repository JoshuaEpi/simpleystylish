package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;// Importación de la clase de configuración de conexión
import com.mycompany.modelo.Cliente;// Importación de la clase Cliente del modelo
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {

    private Connection cn = null;// Objeto de conexión a la base de datos
    private PreparedStatement ps = null;// Objeto para ejecutar consultas preparadas
    private ResultSet rs = null;// Objeto para almacenar resultados de consultas

    // Método para guardar un nuevo cliente en la base de datos
    public int Guardar(Cliente obj) {
        int result = 0;// Variable para almacenar el resultado de la operación

        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "insert into Cliente(nombres,apellidos,telefono,correo,password)"
                    + " values(?,?,?,?,?)";// Consulta SQL para insertar un nuevo cliente
            ps = cn.prepareStatement(sql);// Preparar la consulta
            // Establecer los parámetros en la consulta preparada utilizando los datos del cliente
            ps.setString(1, obj.getNombres().trim());
            ps.setString(2, obj.getApellidos().trim());
            ps.setString(3, obj.getTelefono().trim());
            ps.setString(4, obj.getCorreo().trim());
            ps.setString(5, obj.getPassword());

            result = ps.executeUpdate();// Ejecutar la consulta y obtener el número de filas afectadas
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
            } catch (Exception ex) { // Manejar cualquier excepción imprimiendo el rastreo de la pila
            }
        }
        return result;// Devolver el resultado de la operación (número de filas afectadas)
    }
    // Método para verificar si un correo electrónico ya está registrado en la base de datos
    public boolean ExisteCorreo(String correo) {
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select count(1) from Cliente where correo = ?";// Consulta SQL para contar registros con el correo dado
            ps = cn.prepareStatement(sql);// Preparar la consulta
            ps.setString(1, correo);// Establecer el parámetro en la consulta preparada
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado

            if (rs.next()) {
                return (rs.getInt(1) > 0);// Devolver true si existe al menos un registro con el correo dado
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
            }
        }
        return false;// Devolver false si no se encontró ningún registro con el correo dado
    }
}
