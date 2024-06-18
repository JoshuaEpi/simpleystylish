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
    private final String pagLogin = "PagLogin.jsp";// Nombre de la página de login

    // Este método procesa todas las solicitudes HTTP (GET y POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
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
                throw new AssertionError();
        }
    }
    // Método para autenticar al usuario
    protected void Autentificarse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Obtiene los parámetros de correo y contraseña de la solicitud
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");

        Cliente obj = authDao.Login(correo, password);// Llama al método de login del DAO de autenticación

        if (obj != null) { // Si el usuario es autenticado correctamente (obj no es null)
            request.getSession().setAttribute("usuario", obj);// Se establece el objeto de usuario en la sesión
            response.sendRedirect("index.jsp");// Redirige al usuario a la página principal (index.jsp)
        } else {
            request.getSession().setAttribute("error", "Correo y/o contraseña incorrecto!");// Si la autenticación falla, se establece un mensaje de error en la sesión
            request.getRequestDispatcher(pagLogin).forward(request, response);// Redirige al usuario de vuelta a la página de login
        }
    }
    // Método para mostrar la página de login
    protected void Login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        request.getRequestDispatcher(pagLogin).forward(request, response);// Redirige a la página de login

    }
    // Método para cerrar la sesión del usuario.
    protected void Logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        request.getSession().removeAttribute("usuario");// Elimina el atributo de usuario de la sesión
        response.sendRedirect("index.jsp"); // Redirige al usuario a la página principal (index.jsp)
        
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
