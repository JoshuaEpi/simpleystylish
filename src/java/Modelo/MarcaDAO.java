
package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MarcaDAO extends Conexion{
    
    public List<marca> listarMarca() throws Exception {
        List<marca> marca;
        marca mar;
        ResultSet rs = null;
        String sql = "SELECT M.IDMARCA, M.NOMBREMARCA, M.ESTADO FROM MARCA M "
                + "ORDER BY M.IDMARCA";

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            marca = new ArrayList<>();
            while (rs.next() == true) {
                mar = new marca();
                mar.setId_marca(rs.getInt("IDMARCA"));
                mar.setNombreMarca(rs.getString("NOMBREMARCA"));
                mar.setEstado(rs.getBoolean("ESTADO"));
                marca.add(mar);
            }
            this.cerrar(true);
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return marca;
    }
}
