<%-- 
    Document   : carrito
    Created on : 23 may 2024, 9:56:52 a.m.
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

    <title>Carrito</title>
  </head>
  <body>
    <header>

      <div class="p-3 text-center bg-white border-bottom">
        <div class="container">
          <div class="row gy-3">

            <div class="col-lg-2 col-sm-4 col-4">
                <img
                  src="/dist/img/1.jpg"
                  height="50"
                  
                />
              </a>
            </div>
      
            <div class="order-lg-last col-lg-5 col-sm-8 col-8">
              <div class="d-flex float-end">
                <a
                  href="registro.jsp"
                  class="me-1 border rounded py-1 px-3 nav-link d-flex align-items-center"
                  target="_blank"
                >
                  <i class="fas fa-user-alt m-1 me-md-2"></i>
                  <p class="d-none d-md-block mb-0">Iniciar Sesion</p>
                </a>
              
                <a
                  href="carrito.jsp"
                  class="border rounded py-1 px-3 nav-link d-flex align-items-center"
                  target="_blank"
                >
                  <i class="fas fa-shopping-cart m-1 me-md-2"></i>
                  <p class="d-none d-md-block mb-0">Carrito</p>
                </a>
              </div>
            </div>
         
            <div class="col-lg-5 col-md-12 col-12">
              <div class="input-group float-center">
                <div class="form-outline">
                  <input type="search" id="form1" class="form-control" />
                  <label class="form-label" for="form1">Busqueda</label>
                </div>
                <button type="button" class="btn btn-primary shadow-0">
                  <i class="fas fa-search"></i>
                </button>
              </div>
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
              <a href="" class="text-white"><u>Carrito de compras</u></a>
            </h6>
          </nav>
        
        </div>
      </div>
    
    </header>

    <section class="bg-light my-5">
      <div class="container">
        <div class="row">
        
          <div class="col-lg-9">
            <div class="card border shadow-0">
              <div class="m-4">
                <h4 class="card-title mb-4">Tu carro de compras</h4>
                <div class="row gy-3 mb-4">
                  <div class="col-lg-5">
                    <div class="me-lg-5">
                      <div class="d-flex">
                        <img
                          src="/dist/img/3.jpg"
                          class="border rounded me-3"
                          style="width: 96px; height: 96px"
                        />
                        <div class="">
                          <a href="#" class="nav-link"
                            >Bolso negro</a
                          >
                          <p class="text-muted">Renso acosta</p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div
                    class="col-lg-2 col-sm-6 col-6 d-flex flex-row flex-lg-column flex-xl-row text-nowrap"
                  >
                    <div class="">
                      <select style="width: 100px" class="form-select me-4">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                      </select>
                    </div>
                    <div class="">
                      <text class="h6">S/160.00</text> <br />
                      <small class="text-muted text-nowrap">
                        S/160.00 / por producto
                      </small>
                    </div>
                  </div>
                  <div
                    class="col-lg col-sm-6 d-flex justify-content-sm-center justify-content-md-start justify-content-lg-center justify-content-xl-end mb-2"
                  >
                    <div class="float-md-end">
                      <a
                        href="#!"
                        class="btn btn-light border px-2 icon-hover-primary"
                        ><i class="fas fa-heart fa-lg px-1 text-secondary"></i
                      ></a>
                      <a
                        href="#"
                        class="btn btn-light border text-danger icon-hover-danger"
                      >
                        Remover</a
                      >
                    </div>
                  </div>
                </div>

                <div class="row gy-3 mb-4">
                  <div class="col-lg-5">
                    <div class="me-lg-5">
                      <div class="d-flex">
                        <img
                          src="/dist/img/3.jpg"
                          class="border rounded me-3"
                          style="width: 96px; height: 96px"
                        />
                        <div class="">
                          <a href="#" class="nav-link"
                            >Bolso negro</a
                          >
                          <p class="text-muted">Renso acosta</p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div
                    class="col-lg-2 col-sm-6 col-6 d-flex flex-row flex-lg-column flex-xl-row text-nowrap"
                  >
                    <div class="">
                      <select style="width: 100px" class="form-select me-4">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                      </select>
                    </div>
                    <div class="">
                      <text class="h6">S/160.00</text> <br />
                      <small class="text-muted text-nowrap">
                        S/160.00 / por producto
                      </small>
                    </div>
                  </div>
                  <div
                    class="col-lg col-sm-6 d-flex justify-content-sm-center justify-content-md-start justify-content-lg-center justify-content-xl-end mb-2"
                  >
                    <div class="float-md-end">
                      <a
                        href="#!"
                        class="btn btn-light border px-2 icon-hover-primary"
                        ><i class="fas fa-heart fa-lg px-1 text-secondary"></i
                      ></a>
                      <a
                        href="#"
                        class="btn btn-light border text-danger icon-hover-danger"
                      >
                        Remover</a
                      >
                    </div>
                  </div>
                </div>
                <div class="row gy-3 mb-4">
                  <div class="col-lg-5">
                    <div class="me-lg-5">
                      <div class="d-flex">
                        <img
                          src="/dist/img/3.jpg"
                          class="border rounded me-3"
                          style="width: 96px; height: 96px"
                        />
                        <div class="">
                          <a href="#" class="nav-link"
                            >Bolso negro</a
                          >
                          <p class="text-muted">Renso acosta</p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div
                    class="col-lg-2 col-sm-6 col-6 d-flex flex-row flex-lg-column flex-xl-row text-nowrap"
                  >
                    <div class="">
                      <select style="width: 100px" class="form-select me-4">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                      </select>
                    </div>
                    <div class="">
                      <text class="h6">S/160.00</text> <br />
                      <small class="text-muted text-nowrap">
                        S/160.00 / por producto
                      </small>
                    </div>
                  </div>
                  <div
                    class="col-lg col-sm-6 d-flex justify-content-sm-center justify-content-md-start justify-content-lg-center justify-content-xl-end mb-2"
                  >
                    <div class="float-md-end">
                      <a
                        href="#!"
                        class="btn btn-light border px-2 icon-hover-primary"
                        ><i class="fas fa-heart fa-lg px-1 text-secondary"></i
                      ></a>
                      <a
                        href="#"
                        class="btn btn-light border text-danger icon-hover-danger"
                      >
                        Remover</a
                      >
                    </div>
                  </div>
                </div>
              </div>

              <div class="border-top pt-4 mx-4 mb-4">
                <p>
                  <i class="fas fa-truck text-muted fa-lg"></i> Entrega gratis
                  dentro de 1-2 semanas
                </p>
                <p class="text-muted">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip
                </p>
              </div>
            </div>
          </div>

          <div class="col-lg-3">
            <div class="card mb-3 border shadow-0">
              <div class="card-body">
                <form>
                  <div class="form-group">
                    <label class="form-label">¿Tienes un cupon?</label>
                    <div class="input-group">
                      <input
                        type="text"
                        class="form-control border"
                        name=""
                        placeholder="Codigo de cupon"
                      />
                      <button class="btn btn-light border">Aplicar</button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="card shadow-0 border">
              <div class="card-body">
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Precio total:</p>
                  <p class="mb-2">S/450.00</p>
                </div>
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Descuento:</p>
                  <p class="mb-2 text-success">-S/60.00</p>
                </div>
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Impuestos:</p>
                  <p class="mb-2">S/14.00</p>
                </div>
                <hr />
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Precio total:</p>
                  <p class="mb-2 fw-bold">S/404.00</p>
                </div>

                <div class="mt-3">
                  <a href="#" class="btn btn-success w-100 shadow-0 mb-2">
                    Comprar
                  </a>
                  <a href="home.jsp" class="btn btn-light w-100 border mt-2">
                   Volver a la tienda
                  </a>
                </div>
              </div>
            </div>
          </div>
          
        </div>
      </div>
    </section>
 
    <section>
      <div class="container my-5">
        <header class="mb-4">
          <h3>Productos recomendados</h3>
        </header>

        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card px-4 border shadow-0 mb-4 mb-lg-0">
              <div class="mask px-2" style="height: 50px">
                <div class="d-flex justify-content-between">
                  <h6>
                    <span class="badge bg-danger pt-1 mt-3 ms-2">New</span>
                  </h6>
                  <a href="#"
                    ><i
                      class="fas fa-heart text-primary fa-lg float-end pt-3 m-2"
                    ></i
                  ></a>
                </div>
              </div>
              <a href="#" class="">
                <img
                  src="/dist/img/2.jpg"
                  class="card-img-top rounded-2"
                />
              </a>
              <div class="card-body d-flex flex-column pt-3 border-top">
                <a href="#" class="nav-link">Bolso marron</a>
                <div class="price-wrap mb-2">
                  <strong class="">S/150.00</strong>
                  <del class="">$200.00</del>
                </div>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="#" class="btn btn-outline-primary w-100"
                    >Agregar</a
                  >
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card px-4 border shadow-0 mb-4 mb-lg-0">
              <div class="mask px-2" style="height: 50px">
                <a href="#"
                  ><i
                    class="fas fa-heart text-primary fa-lg float-end pt-3 m-2"
                  ></i
                ></a>
              </div>
              <a href="#" class="">
                <img
                  src="/dist/img/4.jpg"
                  class="card-img-top rounded-2"
                />
              </a>
              <div class="card-body d-flex flex-column pt-3 border-top">
                <a href="#" class="nav-link">Bolso negro con doradot </a>
                <div class="price-wrap mb-2">
                  <strong class="">S/120.00</strong>
                </div>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="#" class="btn btn-outline-primary w-100"
                    >Agregar</a
                  >
                </div>
              </div>
            </div>
          </div>
        
    </section>
  
    <footer class="text-center text-lg-start text-muted bg-primary mt-3">
      </footer>
  
  </body>
  <script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.umd.min.js"
  ></script>
</html>
