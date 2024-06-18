
package com.mycompany.modelo;


public class DetallePedido {
    
    // Campos privados que representan los detalles de un producto en un pedido
    private Producto producto;// Producto asociado al detalle
    private int cantidad;// Cantidad del producto en el pedido
    
    // Método para aumentar la cantidad de un producto en el pedido
    public void AumentarCantidad(int cantidad){
        this.cantidad += cantidad;
    }
    // Método para calcular el importe total del detalle (precio del producto * cantidad)
    public double Importe(){
        return producto.getPrecio() * cantidad;
    }
    // Métodos getters y setters para acceder y modificar los campos privados
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    private void exportarFactura(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
    
    ServletOutputStream out = response.getOutputStream();
    try {
        InputStream logoEmpresa = this.getServletConfig()
                .getServletContext()
                .getResourceAsStream("reportesJasper/img/logo.png");

        InputStream logoFooter = this.getServletConfig()
                .getServletContext()
                .getResourceAsStream("reportesJasper/img/logoFooter.png"); // Asegúrate de que este recurso exista

        InputStream reporteEmpleado = this.getServletConfig()
                .getServletContext()
                .getResourceAsStream("reportesJasper/facturas.jasper");

        if (logoEmpresa != null && logoFooter != null && reporteEmpleado != null) {
            String jsonEmpleados = request.getParameter("lista");
            Gson gson = new Gson();
            List<Empleado> reportesEmpleados = new ArrayList<>();

            reportesEmpleados = gson.fromJson(jsonEmpleados, new TypeToken<List<Empleado>>() {
            }.getType());

            JasperReport report = (JasperReport) JRLoader.loadObject(reporteEmpleado);
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(reportesEmpleados);

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("ds", ds);
            parameters.put("logoEmpresa", logoEmpresa);
            parameters.put("imagenAlternativa", logoFooter);

            response.setContentType("application/pdf");
            response.addHeader("Content-disposition", "inline; filename=ReportesEmpleados.pdf");

            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, ds);
            JasperExportManager.exportReportToPdfStream(jasperPrint, out);

            out.flush();
            out.close();
        } else {
            response.setContentType("text/plain");
            out.println("No se pudo generar el reporte");
            out.println("Esto puede deberse a que la lista de datos no fue recibida o el archivo plantilla del reporte no se ha encontrado");
            out.println("Contacte a soporte");
        }
    } catch (Exception e) {
        response.setContentType("text/plain");
        out.print("Ocurrió un error al intentar generar el reporte: " + e.getMessage());
        e.printStackTrace();
    }
}

private Object getServletConfig() {
    throw new UnsupportedOperationException("Not supported yet.");
}

    
}
