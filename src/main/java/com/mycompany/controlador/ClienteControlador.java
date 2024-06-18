package com.mycompany.controlador;

import com.mycompany.modelo.Cliente;
import com.mycompany.modelo.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteControlador extends HttpServlet {

    private final String pagNuevo = "PagRegistrarCliente.jsp"; // Ruta a la página JSP para registrar un nuevo cliente
    private ClienteDAO cliDao = new ClienteDAO();// Instancia del DAO de clientes para manejar operaciones de la base de datos relacionadas con clientes
    
    // Método que procesa todas las solicitudes HTTP (GET y POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");// Obtiene el parámetro "accion" de la solicitud

        switch (accion) {
            case "nuevo":
                Nuevo(request, response);
                break;
            case "guardar":
                Guardar(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }
    // Método para guardar un nuevo cliente
    protected void Guardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Cliente obj = new Cliente();
        obj.setNombres(request.getParameter("nombres"));
        obj.setApellidos(request.getParameter("apellidos"));
        obj.setTelefono(request.getParameter("telefono"));
        obj.setCorreo(request.getParameter("correo"));
        obj.setPassword(request.getParameter("password"));

        // Verifica si el correo ya está registrado
        if (cliDao.ExisteCorreo(obj.getCorreo().trim()) == false) {
            int result = cliDao.Guardar(obj);// Guarda el cliente en la base de datos

            if (result > 0) {
                request.getSession().setAttribute("success", "Cuenta registrada!");
                response.sendRedirect("ClienteControlador?accion=nuevo");
                return;
            } else {
                request.getSession().setAttribute("error", "No se puede registrar cuenta!");
            }
        } else {
            request.getSession().setAttribute("error", "El correo " +obj.getCorreo()+" "
                    + " ya se encuentra registrado!");
        }

        request.setAttribute("cliente", obj);
        request.getRequestDispatcher(pagNuevo).forward(request, response);
    }
    // Método para mostrar el formulario de registro de un nuevo cliente
    protected void Nuevo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("cliente", new Cliente());
        request.getRequestDispatcher(pagNuevo).forward(request, response);// Redirige a la página de registro de cliente
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
