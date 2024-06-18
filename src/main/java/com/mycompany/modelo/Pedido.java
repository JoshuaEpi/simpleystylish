package com.mycompany.modelo;

import java.util.ArrayList;

public class Pedido {
    // Campos privados que representan la información de un pedido
    private int idPedido; // Identificador único del pedido
    private Cliente cliente; // Cliente que realizó el pedido
    private double total; // Total del pedido
    private String fecha; // Fecha en la que se realizó el pedido
    private String estado; // Estado actual del pedido (pendiente, entregado)
    private ArrayList<DetallePedido> detalles; // Lista de detalles asociados al pedido

    // Métodos getters y setters para acceder y modificar los campos privados
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
    }
    
    
}
