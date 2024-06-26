package com.mycompany.controlador;

import com.mycompany.modelo.Cliente;
import com.mycompany.modelo.DetallePedido;
import com.mycompany.modelo.Pedido;
import com.mycompany.modelo.dao.PedidoDAO;
import com.mycompany.util.Carrito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PedidoControlador extends HttpServlet {
    // Instancia del DAO de pedidos para manejar operaciones de la base de datos relacionadas con pedidos
    private PedidoDAO pedidoDao = new PedidoDAO();
    // Instancia del objeto Carrito para manejar el carrito de compras
    private Carrito objCarrito = new Carrito();
    // Rutas a las páginas JSP relevantes
    private final String pagLogin = "PagLogin.jsp";
    private final String pagCarrito = "PagCarrito.jsp";
    private final String pagMisPedidos = "PagMisPedidos.jsp";
    // Método que procesa todas las solicitudes HTTP (GET y POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");// Obtiene el parámetro "accion" de la solicitud

        switch (accion) {
            case "procesar":
                Procesar(request, response);
                break;
            case "mis_pedidos":
                MisPedidos(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }
    // Método para listar los pedidos del usuario
    protected void MisPedidos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Verifica si el usuario está autenticado
        if (request.getSession().getAttribute("usuario") != null) {
            Cliente objCli = (Cliente) request.getSession().getAttribute("usuario");
            ArrayList<Pedido> listaPed = pedidoDao.ListarPorIdCliente(objCli.getIdCliente());// Obtiene la lista de pedidos del usuario
            request.setAttribute("pedidos", listaPed);
            request.getRequestDispatcher(pagMisPedidos).forward(request, response);
        } else {
            request.getRequestDispatcher(pagLogin).forward(request, response);
        }

    }
    // Método para procesar un pedido
    protected void Procesar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Verifica si el usuario está autenticado
        if (request.getSession().getAttribute("usuario") != null) {
            Pedido objPed = new Pedido();
            Cliente objCli = (Cliente) request.getSession().getAttribute("usuario");
            ArrayList<DetallePedido> lista = objCarrito.ObtenerSesion(request);
            double total = objCarrito.ImporteTotal(lista);
            // Establece los atributos del pedido
            objPed.setCliente(objCli);
            objPed.setDetalles(lista);
            objPed.setTotal(total);
            objPed.setEstado("Pendiente");

            int result = pedidoDao.GenerarPedido(objPed);// Genera el pedido en la base de datos

            if (result > 0) {
                objCarrito.GuardarSesion(request, new ArrayList<DetallePedido>());
                request.getSession().setAttribute("success",
                        "Pedido procesado de forma correcta!");
                response.sendRedirect("PedidoControlador?accion=mis_pedidos");
            } else {
                request.getSession().setAttribute("error",
                        "No se pudo procesar pedido!");

                request.getRequestDispatcher(pagCarrito).forward(request, response);
            }

        } else {
            request.getSession().setAttribute("error", "Debe autentificarse primero,"
                    + " antes de procesar su compra");
            request.getRequestDispatcher(pagLogin).forward(request, response);
        }

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
