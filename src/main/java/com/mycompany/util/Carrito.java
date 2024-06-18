package com.mycompany.util;

import com.mycompany.modelo.DetallePedido;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

public class Carrito {
    // Método para agregar un detalle de pedido al carrito
    public void AgregarCarrito(DetallePedido detalle, HttpServletRequest request) {
        ArrayList<DetallePedido> lista = ObtenerSesion(request);// Obtener la lista de detalles de pedido del carrito desde la sesión
        int posc = ExisteProducto(lista, detalle.getProducto().getIdProd());// Verificar si el producto ya existe en el carrito
        
        if (posc == -1) {
            lista.add(detalle);// Si el producto no existe en el carrito, agregarlo a la lista
        }else{
            // Si el producto ya existe, aumentar la cantidad en el detalle existente
            DetallePedido objDet = lista.get(posc);
            objDet.AumentarCantidad(detalle.getCantidad());
            lista.set(posc, objDet);
        }
        GuardarSesion(request, lista);// Guardar la lista actualizada de detalles de pedido en la sesión
    }
    // Método para calcular el importe total del carrito
    public double ImporteTotal(ArrayList<DetallePedido> lista){
        double total = 0;
        for(DetallePedido item : lista){
            total += item.Importe();// Calcular el importe de cada detalle y sumarlo al total
        }
        return total;
    }
    // Método para remover un item del carrito por índice
    public void RemoverItemCarrito(HttpServletRequest request, int indice ){
        ArrayList<DetallePedido> lista = ObtenerSesion(request);// Obtener la lista de detalles de pedido del carrito desde la sesión
        lista.remove(indice);// Remover el item del carrito según el índice proporcionado
        GuardarSesion(request, lista);// Guardar la lista actualizada de detalles de pedido en la sesión
    }
    // Método para obtener la lista de detalles de pedido del carrito desde la sesión        
    public ArrayList<DetallePedido> ObtenerSesion(HttpServletRequest request) {
        ArrayList<DetallePedido> lista;
        // Verificar si existe una sesión para el carrito
        if (request.getSession().getAttribute("carrito") == null) {
            lista = new ArrayList<>();// Si no existe, crear una nueva lista
        } else {
            lista = (ArrayList<DetallePedido>) request.getSession().getAttribute("carrito");
            // Si existe, obtener la lista almacenada en la sesión
        }
        return lista;
    }
    // Método para guardar la lista de detalles de pedido en la sesión
    public void GuardarSesion(HttpServletRequest request, ArrayList<DetallePedido> lista) {
        request.getSession().setAttribute("carrito", lista);// Guardar la lista en la sesión
    }
    // Método para verificar si un producto ya existe en el carrito
    public int ExisteProducto(ArrayList<DetallePedido> lista, int idProd){
        // Iterar sobre la lista de detalles de pedido para buscar el producto por su id
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getProducto().getIdProd() == idProd){
                return i;// Devolver el índice donde se encuentra el producto
            }
        }
        return -1;// Devolver -1 si el producto no está en el carrito
    }
}
