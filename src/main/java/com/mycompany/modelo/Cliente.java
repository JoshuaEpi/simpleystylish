package com.mycompany.modelo;

public class Cliente {
    
    // Campos privados que almacenan la información del cliente
    private int idCliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String password;
    
    // Método para obtener los nombres completos del cliente en mayúsculas
    public String nombresCompletos(){
        return (nombres + " " + apellidos).toUpperCase();
    }
    // Métodos getters y setters para acceder y modificar los campos privados
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
