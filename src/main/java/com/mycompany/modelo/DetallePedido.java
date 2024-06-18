
package com.mycompany.modelo;


public class DetallePedido {
    
    // Campos privados que representan los detalles de un producto en un pedido
    private Producto producto;// Producto asociado al detalle
    private int cantidad;// Cantidad del producto en el pedido
    
    // Método para aumentar la cantidad de un producto en el pedido
    public void AumentarCantidad(int cantidad){
        this.cantidad += cantidad;
    }
    // Método para calcular el importe total del detalle (precio del producto * cantidad)
    public double Importe(){
        return producto.getPrecio() * cantidad;
    }
    // Métodos getters y setters para acceder y modificar los campos privados
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
