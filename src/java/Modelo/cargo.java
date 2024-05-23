
package Modelo;

public class cargo {
    /* Declaración de los atributos privados de la clase*/
    private int codigo;
    private String nombreCargo;
    private boolean estado;

    /* Método getter para obtener el código del cargo*/
    public int getCodigo() {
        return codigo;
    }
    /* Método setter para establecer el código del cargo*/
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   /* Método getter para obtener el nombre del cargo*/
    public String getNombreCargo() {
        return nombreCargo;
    }
   /* Método setter para establecer el nombre del cargo*/
    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
   /* Método getter para obtener el estado del cargo*/
    public boolean isEstado() {
        return estado;
    }
   /* Método setter para establecer el estado del cargo*/
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
