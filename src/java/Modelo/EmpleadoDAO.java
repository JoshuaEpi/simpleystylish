
package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
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

    /*Método para registrar un nuevo empleado en la base de datos*/
    public void registrarEmpleados(empleado emp) throws Exception {
        String sql;
        sql = "INSERT INTO Empleado (NOMBRE, APELLIDOS, SEXO, TELEFONO, FECHANACIMIENTO, TIPODOCUMENTO, NUMERODOCUMENTO,IDUSUARIO) "
                + "VALUES ('" + emp.getNombre() + "', '"
                + emp.getApellidos() + "', "
                + emp.getSexo()+"',"
                + emp.getTelefono()+"',"
                + emp.getFechaNacimiento()+"',"
                + emp.getTipoDocumento()+"',"
                + ", " + emp.getUsuario().getId_usuario() + ")";
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }

    /* Método para leer un empleado específico de la base de datos*/
    public empleado leerEmpleado(empleado emp) throws Exception {
        empleado empl = null;
        ResultSet rs = null;
        String sql = "SELECT E.NOMBRE, E.APELLIDOS, E.SEXO, E.TELEFONO, "
                + "E.FECHANACIMIENTO, E.TIPODOCUMENTO, "
                + "E.NUMERODOCUMENTO, E.IDUSUARIO "
                + "FROM empleado E WHERE E.IDUSUARIO  = " +  emp.getId_Empleado();

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            if (rs.next() == true) {
                empl = new empleado();
                empl.setId_Empleado(rs.getInt("IDEMPLEADO"));
                empl.setNombre(rs.getString("NOMBRE"));
                empl.setApellidos(rs.getString("APELLIDOS"));
                empl.setSexo(rs.getString("SEXO"));
                empl.setTelefono(rs.getString("TELEFONO"));
                empl.setFechaNacimiento(rs.getDate("FECHANACIMIENTO"));
                empl.setTipoDocumento("TIPODOCUMENTO");
                empl.setNumeroDocumento("NUMERODOCUMENTO");
                empl.setUsuario(new usuario());
                empl.getUsuario().setId_usuario(rs.getInt("IDUSUARIO"));
            }
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        } finally {
        }
        return empl;
    }
  /*Método para actualizar la información de un empleado en la base de datos*/
    public void actualizarEmpleados(empleado emp) throws Exception {
        String sql = "UPDATE empleado SET NOMBRE = '"
                + emp.getNombre() + "', APELLIDOS = '"
                + emp.getApellidos() + "', SEXO = "
                + emp.getSexo() + "', TELEFONO = "
                + emp.getTelefono() + "', FECHANACIMIENTO = "
                + emp.getFechaNacimiento() + "', TIPODOCUMENTO"
                + emp.getTipoDocumento() + "', NUMERODOCUMENTO"
                + emp.getNumeroDocumento()
                + " WHERE IDEMPLEADO = " + emp.getId_Empleado();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }
  /* Método para eliminar un empleado de la base de datos*/
    public void eliminarEmpleado(empleado emp) throws Exception {
        String sql = "DELETE FROM EMPLEADO"
                + " WHERE IDEMPLEADO = " + emp.getId_Empleado();
        try {
            this.conectar(false);
            this.ejecutarOrden(sql);
            this.cerrar(true);
        } catch (Exception e) {
            this.cerrar(false);
            throw e;
        }
    }

    public List<empleado> listarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

