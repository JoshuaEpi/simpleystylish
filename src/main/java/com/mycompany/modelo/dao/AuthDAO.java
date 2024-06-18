package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;
import com.mycompany.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthDAO {

    private Connection cn = null;// Conexión a la base de datos
    private PreparedStatement ps = null;// Consulta preparada
    private ResultSet rs = null;// Resultado de la consulta
    // Método para realizar el login de un cliente
    public Cliente Login(String correo, String password) {
        Cliente obj = null;
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select * from Cliente where correo = ? and password = ?";// Consulta SQL para buscar un cliente por correo y contraseña
            ps = cn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();// Ejecutar la consulta
            // Verificar si se encontró un resultado
            if (rs.next()) {
                // Si se encontró, crear un objeto Cliente y asignar los valores desde el ResultSet
                obj = new Cliente();
                obj.setIdCliente(rs.getInt("id_cli"));
                obj.setNombres(rs.getString("nombres"));
                obj.setApellidos(rs.getString("apellidos"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();// Manejar cualquier excepción imprimiendo el stack trace
        } finally {
            try {
                // Cerrar todos los recursos abiertos (Connection, PreparedStatement, ResultSet)
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) { // Manejar cualquier excepción durante el cierre de recursos

            }
        }
        return obj;// Devolver el objeto Cliente encontrado o null si no se encontró
    }
}
