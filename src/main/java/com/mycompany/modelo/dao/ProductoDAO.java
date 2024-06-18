package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;// Importación de la clase de configuración de conexión
import com.mycompany.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductoDAO {

    private Connection cn = null;// Conexión a la base de datos
    private PreparedStatement ps = null;// Consulta preparada
    private ResultSet rs = null;// Resultado de la consulta
    // Método para listar todos los productos en la base de datos
    public ArrayList<Producto> ListarTodos() {
        ArrayList<Producto> lista = new ArrayList<Producto>();// Lista para almacenar los productos

        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select * from Producto";// Consulta SQL para seleccionar todos los productos
            ps = cn.prepareStatement(sql);// Preparar la consulta
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado
            // Iterar sobre el resultado y crear objetos Producto
            while (rs.next()) {
                Producto obj = new Producto();
                obj.setIdProd(rs.getInt("id_prod"));
                obj.setNombre(rs.getString("nombre"));
                obj.setPrecio(rs.getDouble("precio"));
                obj.setImagen(rs.getString("imagen"));
                lista.add(obj);// Agregar el producto a la lista
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
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
                ex.printStackTrace();
            }
        }

        return lista;// Devolver la lista de productos obtenida
    }
    // Método para buscar un producto por su ID
    public Producto BuscarPorId(int id) {
        Producto obj = null;// Variable para almacenar el producto encontrado

        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "select * from Producto where id_prod = ?";// Consulta SQL para seleccionar un producto por su ID
            ps = cn.prepareStatement(sql);// Preparar la consulta
            ps.setInt(1, id);// Establecer el parámetro en la consulta preparada
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado
            // Si se encuentra un producto, crear el objeto Producto y asignar los valores
            if (rs.next()) {
                obj = new Producto();
                obj.setIdProd(rs.getInt("id_prod"));
                obj.setNombre(rs.getString("nombre"));
                obj.setPrecio(rs.getDouble("precio"));
                obj.setImagen(rs.getString("imagen"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
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
                ex.printStackTrace();
            }
        }

        return obj;// Devolver el producto encontrado, o null si no se encontró
    }
}
