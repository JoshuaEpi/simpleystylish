
package com.mycompany.app;

// Importaciones necesarias para Servlet y anotaciones
import com.mycompany.modelo.dao.ProductoDAO;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// Clase que implementa ServletContextListener para escuchar eventos de inicio y fin de la aplicación web
@WebListener
public class AppInicializar implements ServletContextListener{
    // Instancia del DAO de Producto para acceder a los datos
    private ProductoDAO prodDAO = new ProductoDAO();
    // Método invocado cuando la aplicación web se inicializa
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Al inicio de la aplicación, se obtienen todos los productos y se almacenan en el contexto de la aplicación
        sce.getServletContext().setAttribute("productos", prodDAO.ListarTodos());
    }
    // Método invocado cuando la aplicación web se destruye o se detiene
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Aquí podría realizarse alguna limpieza o liberación de recursos al detener la aplicación
    }
    
}
