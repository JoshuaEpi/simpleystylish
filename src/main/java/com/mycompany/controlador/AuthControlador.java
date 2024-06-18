package com.mycompany.controlador;

import com.mycompany.modelo.Cliente;
import com.mycompany.modelo.dao.AuthDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthControlador extends HttpServlet {
    // Instancia del DAO de autenticación para manejar las operaciones de la base de datos relacionadas con la autenticación
    private AuthDAO authDao = new AuthDAO();
    // Nombre de la página de login
    private final String pagLogin = "PagLogin.jsp";
    // Este método procesa todas las solicitudes HTTP (GET y POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");// Obtiene el parámetro "accion" de la solicitud
        // Dependiendo del valor del parámetro "accion", se llama al método correspondiente
        switch (accion) {
            case "login":
                Login(request, response);
                break;
            case "autentificarse":
                Autentificarse(request, response);
                break;
            case "logout":
                Logout(request, response);
                break;
            default:
                throw new AssertionError();// Si la acción no coincide con ninguno de los casos, lanza un error.
        }
    }
    // Método para autenticar al usuario
    protected void Autentificarse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Obtiene los parámetros de correo y contraseña de la solicitud
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        // Llama al método de login del DAO de autenticación
        Cliente obj = authDao.Login(correo, password);
        // Si el usuario es autenticado correctamente (obj no es null)
        if (obj != null) {
            request.getSession().setAttribute("usuario", obj);
            response.sendRedirect("index.jsp");
        } else {
            request.getSession().setAttribute("error", "Correo y/o contraseña incorrecto!");
            request.getRequestDispatcher(pagLogin).forward(request, response);
        }
    }
    // Método para mostrar la página de login
    protected void Login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Redirige a la página de login
        request.getRequestDispatcher(pagLogin).forward(request, response);

    }
    // Método para cerrar la sesión del usuario
    protected void Logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Elimina el atributo de usuario de la sesión
        request.getSession().removeAttribute("usuario");
        response.sendRedirect("index.jsp");// Redirige al usuario a la página principal (index.jsp)
        
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
