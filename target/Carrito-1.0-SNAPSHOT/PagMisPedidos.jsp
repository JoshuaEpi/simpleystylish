<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Pedidos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="components/Navegacion.jsp" />
        <jsp:include page="components/Mensaje.jsp" />

        <div class="container-fluid mt-3">
            <h5>Mis Pedidos</h5>
            <hr/>

            <div class="row">
                <div class="col-sm-12">
                    <div class="card">
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th># Pedido</th>
                                            <th>Fecha</th>
                                            <th>Total (S/)</th>
                                            <th>Estado</th>
                                            <th>Detalle</th>
                                        </tr>  
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${pedidos}" var="item">
                                            <tr>
                                                <td>${item.idPedido}</td>
                                                <td>${item.fecha}</td>
                                                <td>${item.total}</td>
                                                <td>${item.estado}</td>
                                                <td>
                                                    <button type="button" class="btn btn-info btn-sm" 
                                                            data-bs-toggle="modal" data-bs-target="#modalDetalle_${item.idPedido}">
                                                        Ver
                                                    </button>

                                                    <div class="modal fade" id="modalDetalle_${item.idPedido}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                        <div class="modal-dialog modal-lg">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h1 class="modal-title fs-5">::: Pedido #${item.idPedido} :::</h1>
                                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <table class="table table-bordered table-striped">
                                                                        <thead>
                                                                            <tr>
                                                                                <th>Imagen</th>
                                                                                <th>Producto</th>
                                                                                <th>Precio (S/)</th>
                                                                                <th>Cantidad</th>
                                                                                <th>Importe (S/)</th>
                                                                            </tr>  
                                                                        </thead>
                                                                        <tbody>
                                                                            <c:forEach items="${item.detalles}" var="detalle">
                                                                                <tr>
                                                                                    <td>
                                                                                        <img src="img/productos/${detalle.producto.imagen}" width="50" height="60" 
                                                                                             alt="${detalle.producto.nombre}"/>
                                                                                    </td>
                                                                                    <td>${detalle.producto.nombre}</td>
                                                                                    <td>${detalle.producto.precio}</td>
                                                                                    <td>${detalle.cantidad}</td>
                                                                                    <td>${detalle.Importe()}</td>
                                                                                    
                                                                                </tr>
                                                                            </c:forEach>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                                <div class="modal-footer">
                                                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr> 
                                        </c:forEach>
                                    </tbody>
                                </table> 
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    </body>
</html>