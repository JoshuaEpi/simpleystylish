package com.mycompany.controlador;

import com.mycompany.modelo.DetallePedido;
import com.mycompany.modelo.Producto;
import com.mycompany.modelo.dao.ProductoDAO;
import com.mycompany.util.Carrito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CarritoControlador extends HttpServlet {
    
    private String PagListarCarrito = "PagCarrito.jsp";// Ruta a la página que muestra el carrito de compras
    private String PagInicio = "index.jsp";// Ruta a la página de inicio
    private ProductoDAO prodDao = new ProductoDAO();// Instancia del DAO de productos para manejar operaciones relacionadas con productos
    private Carrito objCarrito = new Carrito();// Instancia del objeto Carrito para manejar el carrito de compras
    // Método que procesa todas las solicitudes HTTP (GET y POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");// Obtiene el parámetro "accion" de la solicitud

        switch (accion) {
            case "listar":
                Listar(request, response);
                break;
            case "agregar":
                Agregar(request, response);
                break;
            case "eliminar":
                Eliminar(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }
    // Método para eliminar un ítem del carrito
    protected void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int indice = Integer.parseInt(request.getParameter("indice"));// Obtiene el índice del ítem a eliminar desde la solicitud
        
        objCarrito.RemoverItemCarrito(request, indice);// Remueve el ítem del carrito
        
        response.sendRedirect("CarritoControlador?accion=listar");// Redirige a la acción de listar el carrito después de eliminar el ítem
    }
    // Método para agregar un producto al carrito
    protected void Agregar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int idProd = Integer.parseInt(request.getParameter("id"));
        Producto obj = prodDao.BuscarPorId(idProd);

        if (obj != null) {
            DetallePedido objDet = new DetallePedido();
            objDet.setProducto(obj);
            objDet.setCantidad(1);

            objCarrito.AgregarCarrito(objDet, request);
        }
        request.getRequestDispatcher(PagInicio).forward(request, response);
    }
    // Método para listar los ítems en el carrito
    protected void Listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<DetallePedido> lista = objCarrito.ObtenerSesion(request);// Obtiene la lista de detalles de pedido desde la sesión
        // Establece la lista de ítems y el total como atributos de la solicitud
        request.setAttribute("carrito", lista);
        request.setAttribute("total", objCarrito.ImporteTotal(lista));
        // Redirige a la página que muestra el carrito de compras
        request.getRequestDispatcher(PagListarCarrito).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
