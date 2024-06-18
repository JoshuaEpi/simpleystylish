
package com.mycompany.app;

import com.mycompany.modelo.dao.ProductoDAO;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInicializar implements ServletContextListener{
    private ProductoDAO prodDAO = new ProductoDAO();
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("productos", prodDAO.ListarTodos());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    
    }
    
}
