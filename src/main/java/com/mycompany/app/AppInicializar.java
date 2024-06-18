
package com.mycompany.app;

// Importa la clase ProductoDAO desde el paquete dao del modelo
import com.mycompany.modelo.dao.ProductoDAO;
// Importa clases necesarias para trabajar con el ciclo de vida del servlet
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// Anotación que indica que esta clase será un listener del contexto del servlet
@WebListener
public class AppInicializar implements ServletContextListener{
    // Instancia de ProductoDAO para interactuar con la base de datos de productos
    private ProductoDAO prodDAO = new ProductoDAO();
    
    // Método que se ejecuta al iniciar el contexto del servlet
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Almacena en el contexto del servlet una lista de todos los productos
        // para que esté disponible durante toda la vida de la aplicación web
        sce.getServletContext().setAttribute("productos", prodDAO.ListarTodos());
    }
    // Método que se ejecuta al destruir el contexto del servlet (se puede dejar vacío)
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // No se realiza ninguna acción específica al destruir el contexto
    }
    
}
