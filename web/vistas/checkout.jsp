<%-- 
    Document   : checkout
    Created on : 23 may 2024, 9:55:30 a.m.
    Author     : joshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.min.css"
      rel="stylesheet"
    />

    <title>Checkout</title>
  </head>
  <body>
    <header>
      
      <div class="p-3 text-center bg-white border-bottom">
        <div class="container">
          <div class="d-flex justify-content-between">
            
            <div class="">
              <a href="home.jpg" target="_blank" class="">
                <img src="dist/img/1.jpg" height="50" />
              </a>
            </div>
           
            <div class="">
              <a href="registro.jsp" class="me-1 border rounded py-1 px-3 nav-link" target="_blank"> <i class="fas fa-user-alt me-2"></i>Iniciar sesion </a>
            </div>
          
          </div>
        </div>
      </div>
    
      <div class="bg-primary">
        <div class="container py-4">
    
          <nav class="d-flex">
            <h6 class="mb-0">
              <a href="" class="text-white-50">Inicio</a>
              <span class="text-white-50 mx-2"> > </span>
              <a href="" class="text-white-50">2. Carrito de compras</a>
              <span class="text-white-50 mx-2"> > </span>
              <a href="" class="text-white"><u>3. Checkout</u></a>
              <span class="text-white-50 mx-2"> > </span>
              <a href="" class="text-white-50">4. Pago</a>
            </h6>
          </nav>
       
        </div>
      </div>
     
    </header>
    
    <section class="bg-light py-5">
      <div class="container">
        <div class="row">
          <div class="col-xl-8 col-lg-8 mb-4">
            <div class="card mb-4 border shadow-0">
              <div class="p-4 d-flex justify-content-between">
                <div class="">
                  <h5>¿Tienes una cuenta?</h5>
                  <p class="mb-0 text-wrap ">Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
                </div>
                <div class="d-flex align-items-center justify-content-center flex-column flex-md-row">
                  <a href="registro.jsp" class="btn btn-outline-primary me-0 me-md-2 mb-2 mb-md-0 w-100">Registrarte</a>
                  <a href="registro.jsp" class="btn btn-primary shadow-0 text-nowrap w-100">Iniciar sesion</a>
                </div>
              </div>
            </div>
    
            <div class="card shadow-0 border">
              <div class="p-4">
                <h5 class="card-title mb-3">Datos del cliente</h5>
                <div class="row">
                  <div class="col-6 mb-3">
                    <p class="mb-0">Nombres</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" placeholder="Type here" class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-6">
                    <p class="mb-0">Apellidos</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" placeholder="Type here" class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-6 mb-3">
                    <p class="mb-0">Telefono</p>
                    <div class="form-outline">
                      <input type="tel" id="typePhone" value="+51 " class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-6 mb-3">
                    <p class="mb-0">Email</p>
                    <div class="form-outline">
                      <input type="email" id="typeEmail" placeholder="example@gmail.com" class="form-control" />
                    </div>
                  </div>
                </div>
    
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault" />
                  <label class="form-check-label" for="flexCheckDefault">Mantenme actualizado con nuevas promociones.</label>
                </div>
    
                <hr class="my-4" />
    
                <h5 class="card-title mb-3">Manera de envio</h5>
    
                <div class="row mb-3">
                  <div class="col-lg-4 mb-3">
                 
                    <div class="form-check h-100 border rounded-3">
                      <div class="p-3">
                        <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked />
                        <label class="form-check-label" for="flexRadioDefault1">
                          Envio express <br />
                          <small class="text-muted">3-4 dias </small>
                        </label>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-4 mb-3">
                  </div>
                  </div>
                  <div class="col-lg-4 mb-3">
                  </div>
                </div>
    
                <div class="row">
                  <div class="col-sm-8 mb-3">
                    <p class="mb-0">Direccion</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" placeholder="Type here" class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-sm-4 mb-3">
                    <p class="mb-0">Ciudad</p>
                    <select class="form-select">
                      <option value="1">Lima</option>
                      <option value="2">Callao</option>
                      
                    </select>
                  </div>
    
                  <div class="col-sm-4 mb-3">
                    <p class="mb-0">Referencias</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" placeholder="Type here" class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-sm-4 col-6 mb-3">
                    <p class="mb-0">Codigo postal</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" class="form-control" />
                    </div>
                  </div>
    
                  <div class="col-sm-4 col-6 mb-3">
                    <p class="mb-0">Zip</p>
                    <div class="form-outline">
                      <input type="text" id="typeText" class="form-control" />
                    </div>
                  </div>
                </div>
    
                <div class="form-check mb-3">
                  <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault1" />
                  <label class="form-check-label" for="flexCheckDefault1">Guardar esta direccion</label>
                </div>
    
                <div class="mb-3">
                  <p class="mb-0">Otros detalles</p>
                  <div class="form-outline">
                    <textarea class="form-control" id="textAreaExample1" rows="2"></textarea>
                  </div>
                </div>
    
                <div class="float-end">
                  <button class="btn btn-light border">Cancelar</button>
                  <button class="btn btn-success shadow-0 border">Continuar</button>
                </div>
              </div>
            </div>
           
          </div>
          <div class="col-xl-4 col-lg-4 d-flex justify-content-center justify-content-lg-end">
            <div class="ms-lg-4 mt-4 mt-lg-0" style="max-width: 320px;">
              <h6 class="mb-3">Detalles</h6>
              <div class="d-flex justify-content-between">
                <p class="mb-2">Precio Total:</p>
                <p class="mb-2">S/450.00</p>
              </div>
              <div class="d-flex justify-content-between">
                <p class="mb-2">Descuento:</p>
                <p class="mb-2 text-danger">- S/60.00</p>
              </div>
              <div class="d-flex justify-content-between">
                <p class="mb-2">Costo de envio:</p>
                <p class="mb-2">+ S/14.00</p>
              </div>
              <hr />
              <div class="d-flex justify-content-between">
                <p class="mb-2">Precio total:</p>
                <p class="mb-2 fw-bold">S/404.00</p>
              </div>
    
              <div class="input-group mt-3 mb-4">
                <input type="text" class="form-control border" name="" placeholder="Codigo de promocion" />
                <button class="btn btn-light text-primary border">Aplicar</button>
              </div>
    
              <hr />
              <h6 class="text-dark my-4">Productos en el carrito</h6>
    
              <div class="d-flex align-items-center mb-4">
                <div class="me-3 position-relative">
                  <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill badge-secondary">
                    1
                  </span>
                  <img src="dist/img/3.jpg" style="height: 96px; width: 96x;" class="img-sm rounded border" />
                </div>
                <div class="">
                  <a href="#" class="nav-link">
                   Bolso negro <br />
                    Color negro
                  </a>
                  <div class="price text-muted">Total: S/150.00</div>
                </div>
              </div>
              <div class="d-flex align-items-center mb-4">
                <div class="me-3 position-relative">
                  <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill badge-secondary">
                    1
                  </span>
                  <img src="dist/img/3.jpg" style="height: 96px; width: 96x;" class="img-sm rounded border" />
                </div>
                <div class="">
                  <a href="#" class="nav-link">
                   Bolso negro <br />
                    Color negro
                  </a>
                  <div class="price text-muted">Total: S/150.00</div>
                </div>
              </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    </body>
  <script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.umd.min.js"
  ></script>
</html>
