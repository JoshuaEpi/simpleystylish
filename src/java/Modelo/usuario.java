package Modelo;

public class usuario {

    /*Declarar los atributos privados de la clase*/
    private int id_usuario;
    private String nombreUsuario;
    private String clave;
    private boolean estado;
    private cargo cargo;

    /*Método para obtener el identificador del usuario*/
    public int getId_usuario() {
        return id_usuario;
    }

    /* Método para establecer el identificador del usuario*/
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /*Método para obtener el nombre del usuario*/
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /*Método para establecer el nombre del usuario*/
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public cargo getCargo() {
        return cargo;
    }

    public void setCargo(cargo cargo) {
        this.cargo = cargo;
    }

}
