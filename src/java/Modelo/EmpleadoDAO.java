
package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoDAO extends Conexion {
    public empleado identificar(empleado em) throws Exception {
        empleado emp = null;
        ResultSet rs = null;
        String sql = "SELECT E.IDEMPLEADO, U.NOMBREUSUARIO FROM EMPLEADO E "
                + "INNER JOIN USUARIO U ON E.IDUSUARIO = U.IDUSUARIO "
                + "WHERE E.SEXO = '"+em.getSexo()+"' AND E.NOMBRE = '" +em.getNombre()+"'"
                + "AND E.TELEFONO = '" +em.getTelefono()+"'";
        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            if (rs.next() == true) {
                emp = new empleado();
                emp.setId_Empleado(rs.getInt("IDEMPLEADO"));
                emp.setNombre(em.getNombre());
                emp.setUsuario(new usuario());
                emp.getUsuario().setNombreUsuario(rs.getString("NOMBREUSUARIO"));
                emp.setTelefono(sql);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            this.cerrar(false);
        }
        return emp;
    }

    /* Método para listar todos los empleados de la base de datos*/
    public List<empleado> listarEmpleados() throws Exception {
        List<empleado> empleados;
        empleado emp;
        ResultSet rs = null;
        String sql = "SELECT E.IDEMPLEADO, E.NOMBRE, E.APELLIDOS, E.SEXO, E.TELEFONO, "
                + "E.FECHANACIMIENTO, E.TIPODOCUMENTO, E.NUMERODOCUMENTO, U.IDUSUARIO "
                + "FROM EMPLEADO E INNER JOIN usuario U ON U.IDUSUARIO=E.IDUSUARIO "
                + "ORDER BY E.IDEMPLEADO";

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            empleados = new ArrayList<>();
            while (rs.next() == true) {
                emp = new empleado();
                emp.setId_Empleado(rs.getInt("IDEMPLEADO"));
                emp.setNombre(rs.getString("NOMBRE"));
                emp.setApellidos(rs.getString("APELLIDOS"));
                emp.setSexo(rs.getString("SEXO"));
                emp.setTelefono(rs.getString("TELEFONO"));
                emp.setFechaNacimiento(rs.getDate("FECHANACIMIENTO"));
                emp.setTipoDocumento(rs.getString("TIPODOCUMENTO"));
                emp.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                emp.setUsuario(new usuario());
                emp.getUsuario().setId_usuario(rs.getInt("IDUSUARIO"));
                empleados.add(emp);
            }
            this.cerrar(true);
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return empleados;
    }

    /*Método para registrar un nuevo usuario en la base de datos*/
    public void registrarUsuarios(usuario usu) throws Exception {
        String sql;
        sql = "INSERT INTO Usuario (NOMBREUSUARIO, CLAVE, ESTADO, IDCARGO) "
                + "VALUES ('" + usu.getNombreUsuario() + "', '"
                + usu.getClave() + "', "
                + (usu.isEstado() == true ? "1" : "0")
                + ", " + usu.getCargo().getCodigo() + ")";
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }

    /* Método para leer un usuario específico de la base de datos*/
    public usuario leerUsuario(usuario usu) throws Exception {
        usuario usus = null;
        ResultSet rs = null;
        String sql = "SELECT U.IDUSUARIO, U.NOMBREUSUARIO, U.CLAVE, U.ESTADO, U.IDCARGO "
                + "FROM usuario U WHERE U.IDUSUARIO = " + usu.getId_usuario();

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            if (rs.next() == true) {
                usus = new usuario();
                usus.setId_usuario(rs.getInt("IDUSUARIO"));
                usus.setNombreUsuario(rs.getString("NOMBREUSUARIO"));
                usus.setClave(rs.getString("CLAVE"));
                usus.setEstado(rs.getBoolean("ESTADO"));
                usus.setCargo(new cargo());
                usus.getCargo().setCodigo(rs.getInt("IDCARGO"));
            }
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        } finally {
        }
        return usus;
    }
  /*Método para actualizar la información de un usuario en la base de datos*/
    public void actualizarUsuarios(usuario usu) throws Exception {
        String sql = "UPDATE usuario SET NOMBREUSUARIO = '"
                + usu.getNombreUsuario() + "', CLAVE = '"
                + usu.getClave() + "', ESTADO = "
                + (usu.isEstado() == true ? "1" : "0")
                + ", IDCARGO = "
                + usu.getCargo().getCodigo()
                + " WHERE IDUSUARIO = " + usu.getId_usuario();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }
  /* Método para eliminar un usuario de la base de datos*/
    public void eliminarUsuario(usuario usu) throws Exception {
        String sql = "DELETE FROM USUARIO"
                + " WHERE IDUSUARIO = " + usu.getId_usuario();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }
    /* Método para cambiar el estado de un usuario en la base de datos*/
    public void cambiarVigencia(usuario usus) throws Exception {
        String sql = "UPDATE usuario SET estado = "
                + (usus.isEstado() == true ? "1" : "0")
                + " WHERE idusuario = " + usus.getId_usuario();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }

}

