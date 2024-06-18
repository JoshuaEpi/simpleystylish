
package com.mycompany.modelo;


public class Producto {
    
    private int idProd;// Identificador único del producto
    private String nombre;// Nombre del producto
    private double precio;// Precio del producto
    private String imagen;// Ruta o nombre de archivo de la imagen del producto

    // Métodos getters y setters para acceder y modificar los campos privados
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
