package com.mycompany.modelo.dao;

import com.mycompany.config.Conexion;// Importación de la clase de configuración de conexión
import com.mycompany.modelo.DetallePedido;
import com.mycompany.modelo.Pedido;
import com.mycompany.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoDAO {

    private Connection cn = null;// Conexión a la base de datos
    private PreparedStatement ps = null;// Consulta preparada
    private ResultSet rs = null;// Resultado de la consulta
    // Método para generar un nuevo pedido en la base de datos
    public int GenerarPedido(Pedido obj) {
        int result = 0;
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            cn.setAutoCommit(false);// Deshabilitar el modo autocommit para realizar transacciones
            // Consulta SQL para insertar un nuevo pedido
            String sql = "INSERT INTO Pedido(id_cli,fecha_ped,total,estado) VALUES(?,NOW(),?,?)";
            ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);// Preparar la consulta
            ps.setInt(1, obj.getCliente().getIdCliente());
            ps.setDouble(2, obj.getTotal());
            ps.setString(3, obj.getEstado());
            result = ps.executeUpdate();// Ejecutar la consulta de inserción y obtener el número de filas afectadas

            if (result > 0) {
                rs = ps.getGeneratedKeys();// Obtener las claves generadas (en este caso, el ID generado)

                if (rs.next()) {
                    int idPed = rs.getInt(1);// Obtener el ID del pedido generado
                    
                    ps = cn.prepareStatement("INSERT INTO Detalle_Pedido"
                            + "(id_ped,id_prod,precio,cantidad) VALUES(?,?,?,?)");
                    for (DetallePedido carrito : obj.getDetalles()) {
                        ps.setInt(1, idPed);
                        ps.setInt(2, carrito.getProducto().getIdProd());
                        ps.setDouble(3, carrito.getProducto().getPrecio());
                        ps.setInt(4, carrito.getCantidad());
                        ps.executeUpdate();
                    }
                    cn.commit();// Confirmar la transacción (todos los detalles del pedido se han insertado correctamente)
                }
            }
        } catch (Exception ex) {
            try {
                if (cn != null) {
                    cn.rollback();// Revertir la transacción en caso de error
                    result = 0;// Establecer el resultado a 0 (indicando error)
                }
            } catch (SQLException ex1) {
            }

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
            }
        }
        return result;// Devolver el resultado de la operación (número de filas afectadas o 0 en caso de error)
    }
    // Método para listar pedidos por ID de cliente
    public ArrayList<Pedido> ListarPorIdCliente(int id) {
        ArrayList<Pedido> lista = new ArrayList<>();
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            String sql = "SELECT * FROM Pedido WHERE id_cli = ?";// Consulta SQL para seleccionar pedidos por ID de cliente
            ps = cn.prepareStatement(sql);// Preparar la consulta
            ps.setInt(1, id);// Establecer el parámetro en la consulta preparada
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado
            // Iterar sobre el resultado y crear objetos Pedido con sus detalles
            while (rs.next()) {
                Pedido obj = new Pedido();
                obj.setIdPedido(rs.getInt("id_ped"));
                obj.setFecha(rs.getString("fecha_ped"));
                obj.setTotal(rs.getDouble("total"));
                obj.setEstado(rs.getString("estado"));
                obj.setDetalles(ListarDetallePorIdPed(obj.getIdPedido()));
                lista.add(obj);// Agregar el pedido a la lista
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
            }
        }
        return lista;// Devolver la lista de pedidos obtenida
    }
    // Método para listar detalles de un pedido por su ID de pedido
    public ArrayList<DetallePedido> ListarDetallePorIdPed(int idPed) {
        ArrayList<DetallePedido> lista = new ArrayList<>();
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cn = Conexion.getConnection();// Obtener una conexión a la base de datos
            // Consulta SQL para seleccionar detalles de un pedido por su ID de pedido
            String sql = "SELECT p.imagen, p.nombre, d.precio, d.cantidad\n"
                    + "FROM Detalle_Pedido d INNER JOIN producto p ON p.id_prod = d.id_prod\n"
                    + "WHERE d.id_ped = ?";
            ps = cn.prepareStatement(sql);// Preparar la consulta
            ps.setInt(1, idPed);// Establecer el parámetro en la consulta preparada
            rs = ps.executeQuery();// Ejecutar la consulta y obtener el resultado
            // Iterar sobre el resultado y crear objetos DetallePedido con sus Productos correspondientes
            while(rs.next()){
                Producto p = new Producto();
                DetallePedido d = new DetallePedido();
                p.setImagen(rs.getString("imagen"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                d.setCantidad(rs.getInt("cantidad"));
                d.setProducto(p);// Establecer el producto en el detalle del pedido
                lista.add(d);// Agregar el detalle del pedido a la lista
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
            }
        }
        return lista;// Devolver la lista de detalles de pedido obtenida
    }
}
