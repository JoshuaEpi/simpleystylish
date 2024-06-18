package com.mycompany.util;

import com.mycompany.modelo.DetallePedido;// Importación de la clase DetallePedido
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

public class Carrito {
    // Método para agregar un detalle de pedido al carrito
    public void AgregarCarrito(DetallePedido detalle, HttpServletRequest request) {
        ArrayList<DetallePedido> lista = ObtenerSesion(request);// Obtener la lista de detalles del carrito desde la sesión
        int posc = ExisteProducto(lista, detalle.getProducto().getIdProd());// Verificar si el producto ya existe en el carrito
        
        if (posc == -1) { // Si el producto no existe en el carrito, se agrega como un nuevo detalle
            lista.add(detalle);
        }else{ // Si el producto ya existe en el carrito, se aumenta la cantidad del detalle existente
            DetallePedido objDet = lista.get(posc);
            objDet.AumentarCantidad(detalle.getCantidad());
            lista.set(posc, objDet);// Actualizar el detalle en la lista
        }
        GuardarSesion(request, lista);// Guardar la lista actualizada en la sesión
    }
    // Método para calcular el importe total de todos los detalles en el carrito
    public double ImporteTotal(ArrayList<DetallePedido> lista){
        double total = 0;
        for(DetallePedido item : lista){
            total += item.Importe();// Sumar el importe de cada detalle al total
        }
        return total;
    }
    // Método para remover un detalle del carrito basado en su índice
    public void RemoverItemCarrito(HttpServletRequest request, int indice ){
        ArrayList<DetallePedido> lista = ObtenerSesion(request);// Obtener la lista de detalles del carrito desde la sesión
        lista.remove(indice);// Remover el detalle en el índice especificado
        GuardarSesion(request, lista);// Guardar la lista actualizada en la sesión
    }
    // Método para obtener la lista de detalles del carrito almacenada en la sesión        
    public ArrayList<DetallePedido> ObtenerSesion(HttpServletRequest request) {
        ArrayList<DetallePedido> lista;

        if (request.getSession().getAttribute("carrito") == null) { // Verificar si la sesión no contiene la lista de carrito
            lista = new ArrayList<>();// Si no existe, crear una nueva lista vacía
        } else {
            lista = (ArrayList<DetallePedido>) request.getSession().getAttribute("carrito");
        }
        return lista;// Devolver la lista de detalles del carrito
    }
    // Método para guardar la lista de detalles del carrito en la sesión
    public void GuardarSesion(HttpServletRequest request, ArrayList<DetallePedido> lista) {
        request.getSession().setAttribute("carrito", lista);// Establecer la lista en la sesión con el nombre "carrito"
    }
    // Método para verificar si un producto ya existe en la lista de detalles del carrito
    public int ExisteProducto(ArrayList<DetallePedido> lista, int idProd){
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getProducto().getIdProd() == idProd){// Comparar el ID del producto en cada detalle con el ID proporcionado
                return i;// Devolver el índice del detalle si el producto ya existe en el carrito
            }
        }
        return -1;// Devolver -1 si el producto no existe en el carrito
    }
}
