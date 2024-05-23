
package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CategoriaDAO extends Conexion {
    public List<categoria> listarCategoria() throws Exception {
        List<categoria> categoria;
        categoria cat;
        ResultSet rs = null;
        String sql = "SELECT C.IDCATEGORIA, C.NOMBRECATEGORIA, C.ESTADO FROM CATEGORIA C "
                + "ORDER BY C.IDCATEGORIA";

        try {
            this.conectar(false);
            rs = this.ejecutarOrdenDatos(sql);
            categoria = new ArrayList<>();
            while (rs.next() == true) {
                cat = new categoria();
                cat.setId_categoria(rs.getInt("IDCATEGORIA"));
                cat.setNombreCategoria(rs.getString("NOMBRECATEGORIA"));
                cat.setEstado(rs.getBoolean("ESTADO"));
                categoria.add(cat);
            }
            this.cerrar(true);
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return categoria;
    }
}


