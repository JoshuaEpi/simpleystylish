package Modelo;

import java.sql.ResultSet; 
import java.util.ArrayList; // Importa la clase ArrayList para trabajar con listas
import java.util.List; // Importa la interfaz List para definir listas

public class CargoDAO extends Conexion {

    public List<cargo> listarCargos() throws Exception { // Método para listar los cargos de la base de datos
        List<cargo> cargos; // Declarar una lista para almacenar los cargos
        cargo car;
        ResultSet rs = null;
        String sql = "SELECT C.IDCARGO, C.NOMBRECARGO, C.ESTADO FROM CARGO C " // Consulta SQL para obtener los datos de los cargos
                + "ORDER BY C.IDCARGO";

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            cargos = new ArrayList<>(); // Inicializa la lista de cargos como un ArrayList vacío
            while (rs.next() == true) {
                car = new cargo(); // Crea un nuevo objeto cargo para almacenar los datos de cada registro
                car.setCodigo(rs.getInt("IDCARGO")); // Asigna el valor del campo IDCARGO al objeto cargo
                car.setNombreCargo(rs.getString("NOMBRECARGO"));
                car.setEstado(rs.getBoolean("ESTADO"));
                cargos.add(car);
            }
            this.cerrar(true); // Cierra la conexión a la base de datos
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return cargos; // Devuelve la lista de cargos obtenida de la base de datos
    }
}
