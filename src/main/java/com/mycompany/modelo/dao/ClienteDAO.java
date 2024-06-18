package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;
import com.mycompany.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {

    private Connection cn = null;// Conexión a la base de datos
    private PreparedStatement ps = null;// Consulta preparada
    private ResultSet rs = null;// Resultado de la consulta

    public int Guardar(Cliente obj) {
        int result = 0;

        try {
            cn = Conexion.getConnection();// Obtener conexión a la base de datos
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
            try {
                if (cn != null) {
                    cn.close();// Cerrar la conexión a la base de datos
                }
                if (ps != null) {
                    ps.close();// Cerrar el PreparedStatement
                }
            } catch (Exception ex) { // Manejar cualquier excepción durante el cierre de recursos
            }
        }
        return result;// Devolver el número de filas afectadas (0 si no se insertó nada)
    }
    // Método para verificar si un correo electrónico ya está registrado en la base de datos
    public boolean ExisteCorreo(String correo) {
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select count(1) from Cliente where correo = ?";// Consulta SQL para contar registros con el correo dado
            ps = cn.prepareStatement(sql);// Preparar la consulta
            // Establecer el parámetro en la consulta preparada
            ps.setString(1, correo);
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado

            if (rs.next()) {
                return (rs.getInt(1) > 0);// Devolver true si existe al menos un registro con el correo dado
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
