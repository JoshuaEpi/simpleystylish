<%-- 
    Document   : detalles
    Created on : 23 may 2024, 9:53:51 a.m.
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

    <title>Detalles</title>
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
            <!-- Left elements -->

            <div class="order-lg-last col-lg-5 col-sm-8 col-8">
              <div class="d-flex float-end">
                <a
                  href="registro.jsp"
                  class="me-1 border rounded py-1 px-3 nav-link d-flex align-items-center"
                  target="_blank"
                >
                  <i class="fas fa-user-alt m-1 me-md-2"></i>
                  <p class="d-none d-md-block mb-0">Iniciar sesion</p>
                </a>
                
               
                <a
                  href="carrito.jsp"
                  class="border rounded py-1 px-3 nav-link d-flex align-items-center"
                  target="_blank"
                >
                  <i class="fas fa-shopping-cart m-1 me-md-2"></i>
                  <p class="d-none d-md-block mb-0">Mi carrito</p>
                </a>
              </div>
            </div>
            <!-- Center elements -->

            <!-- Right elements -->
            <div class="col-lg-5 col-md-12 col-12">
              <div class="input-group float-center">
                <div class="form-outline">
                  <input type="search" id="form1" class="form-control" />
                  <label class="form-label" for="form1">Search</label>
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
      
              <a href="detalles.jsp" class="text-white">Detalles del producto</a>
            </h6>
          </nav>
     
        </div>
      </div>
    
    </header>

    <section class="py-5">
      <div class="container">
        <div class="row gx-5">
          <aside class="col-lg-6">
            <div class="border rounded-4 mb-3 d-flex justify-content-center">
              <a
                data-fslightbox="mygalley"
                class="rounded-4"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
              >
                <img
                  style="max-width: 100%; max-height: 100vh; margin: auto"
                  class="rounded-4 fit"
                  src="/dist/img/2.jpg"
                />
              </a>
            </div>
            <div class="d-flex justify-content-center mb-3">
              <a
                data-fslightbox="mygalley"
                class="border mx-1 rounded-2"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
                class="item-thumb"
              >
                <img
                  width="60"
                  height="60"
                  class="rounded-2"
                  src="/dist/img/2.jpg"
                />
              </a>
              <a
                data-fslightbox="mygalley"
                class="border mx-1 rounded-2"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
                class="item-thumb"
              >
                <img
                  width="60"
                  height="60"
                  class="rounded-2"
                  src="/dist/img/2.jpg"
                />
              </a>
              <a
                data-fslightbox="mygalley"
                class="border mx-1 rounded-2"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
                class="item-thumb"
              >
                <img
                  width="60"
                  height="60"
                  class="rounded-2"
                  src="/dist/img/2.jpg"
                />
              </a>
              <a
                data-fslightbox="mygalley"
                class="border mx-1 rounded-2"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
                class="item-thumb"
              >
                <img
                  width="60"
                  height="60"
                  class="rounded-2"
                  src="/dist/img/2.jpg"
                />
              </a>
              <a
                data-fslightbox="mygalley"
                class="border mx-1 rounded-2"
                target="_blank"
                data-type="image"
                href="/dist/img/2.jpg"
                class="item-thumb"
              >
                <img
                  width="60"
                  height="60"
                  class="rounded-2"
                  src="/dist/img/2.jpg"
                />
              </a>
            </div>
      
          </aside>
          <main class="col-lg-6">
            <div class="ps-lg-3">
              <h4 class="title text-dark">
               Bolso marron
              </h4>
              <div class="d-flex flex-row my-3">
                <div class="text-warning mb-1 me-2">
                  <i class="fa fa-star"></i>
                  <i class="fa fa-star"></i>
                  <i class="fa fa-star"></i>
                  <i class="fa fa-star"></i>
                  <i class="fas fa-star-half-alt"></i>
                  <span class="ms-1"> 4.5 </span>
                </div>
                <span class="text-muted"
                  ><i class="fas fa-shopping-basket fa-sm mx-1"></i>154
                  ordenes</span
                >
                <span class="text-success ms-2">Disponible</span>
              </div>

              <div class="mb-3">
                <span class="h5">S/275.00</span>
                <span class="text-muted">/por bolso</span>
              </div>

              <p>
                Este bolso negro clásico es el complemento perfecto para cualquier ocasión. Confeccionado con materiales de alta calidad, este bolso no solo es elegante, sino también duradero y resistente al desgaste diario.
              </p>

              <div class="row">
                <dt class="col-3">Tamaño:</dt>
                <dd class="col-9">Medianor</dd>

                <dt class="col-3">Color</dt>
                <dd class="col-9">Marron</dd>

                <dt class="col-3">Material</dt>
                <dd class="col-9">Cuero</dd>

                <dt class="col-3">Marca</dt>
                <dd class="col-9">Lacoste</dd>
              </div>

              <hr />

              <div class="row mb-4">
                <div class="col-md-4 col-6">
                  <label class="mb-2">Tamaño</label>
                  <select
                    class="form-select border border-secondary"
                    style="height: 35px"
                  >
                    <option>Pequeño</option>
                    <option>Mediano</option>
                    <option>Grande</option>
                  </select>
                </div>
                <!-- col.// -->
                <div class="col-md-4 col-6 mb-3">
                  <label class="mb-2 d-block">Cantidad</label>
                  <div class="input-group mb-3" style="width: 170px">
                    <button
                      class="btn btn-white border border-secondary px-3"
                      type="button"
                      id="button-addon1"
                      data-mdb-ripple-color="dark"
                    >
                      <i class="fas fa-minus"></i>
                    </button>
                    <input
                      type="text"
                      class="form-control text-center border border-secondary"
                      placeholder="14"
                      aria-label="Example text with button addon"
                      aria-describedby="button-addon1"
                    />
                    <button
                      class="btn btn-white border border-secondary px-3"
                      type="button"
                      id="button-addon2"
                      data-mdb-ripple-color="dark"
                    >
                      <i class="fas fa-plus"></i>
                    </button>
                  </div>
                </div>
              </div>
              <a href="checkout.jsp" class="btn btn-warning shadow-0"> Comprar ahora</a>
              <a href="carrito.jsp" class="btn btn-primary shadow-0">
                <i class="me-1 fa fa-shopping-basket"></i>Agregar al carrito
              </a>
            </div>
          </main>
        </div>
      </div>
    </section>
    <!-- content -->

    <section class="bg-light border-top py-4">
      <div class="container">
        <div class="row gx-4">
          <div class="col-lg-8 mb-4">
            <div class="border rounded-2 px-3 py-2 bg-white">
              <!-- Pills navs -->
              <ul
                class="nav nav-pills nav-justified mb-3"
                id="ex1"
                role="tablist"
              >
                <li class="nav-item d-flex" role="presentation">
                  <a
                    class="nav-link d-flex align-items-center justify-content-center w-100 active"
                    id="ex1-tab-1"
                    data-mdb-toggle="pill"
                    href="#ex1-pills-1"
                    role="tab"
                    aria-controls="ex1-pills-1"
                    aria-selected="true"
                    >Detalles</a
                  >
                </li>
                <div class="tab-content" id="ex1-content">
                    <div
                    class="tab-pane fade show active"
                    id="ex1-pills-1"
                    role="tabpanel"
                    aria-labelledby="ex1-tab-1"
                    >
                    <p>


Este bolso negro clásico es el complemento perfecto para cualquier ocasión. Confeccionado con materiales de alta calidad, este bolso no solo es elegante, sino también duradero y resistente al desgaste diario.

Detalles:

Material: Cuero sintético de primera calidad
Color: Negro profundo y elegante
Dimensiones: 30 cm de largo x 25 cm de alto x 10 cm de ancho
Compartimentos: Espacioso compartimento principal con cierre de cremallera, bolsillo interior con cremallera y bolsillos abiertos para una fácil organización.
Correa ajustable: Incluye una correa ajustable para llevarlo cómodamente al hombro o cruzado.
Acabado: Detalles en metal dorado que añaden un toque de sofisticación.
Versatilidad: Perfecto para el trabajo, salidas casuales o eventos formales.
                  </p>
                
                  </table>
                </div>
                <div
                  class="tab-pane fade mb-2"
                  id="ex1-pills-2"
                  role="tabpanel"
                  aria-labelledby="ex1-tab-2"
                >
                  Tab content or sample information now <br />
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip ex ea commodo consequat. Duis aute
                  irure dolor in reprehenderit in voluptate velit esse cillum
                  dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                  cupidatat non proident, sunt in culpa qui officia deserunt
                  mollit anim id est laborum. Lorem ipsum dolor sit amet,
                  consectetur adipisicing elit, sed do eiusmod tempor incididunt
                  ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                  quis nostrud exercitation ullamco laboris nisi ut aliquip ex
                  ea commodo
                </div>
                <div
                  class="tab-pane fade mb-2"
                  id="ex1-pills-3"
                  role="tabpanel"
                  aria-labelledby="ex1-tab-3"
                >
                  Another tab content or sample information now <br />
                  Dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                  tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                  minim veniam, quis nostrud exercitation ullamco laboris nisi
                  ut aliquip ex ea commodo consequat. Duis aute irure dolor in
                  reprehenderit in voluptate velit esse cillum dolore eu fugiat
                  nulla pariatur. Excepteur sint occaecat cupidatat non
                  proident, sunt in culpa qui officia deserunt mollit anim id
                  est laborum.
                </div>
                <div
                  class="tab-pane fade mb-2"
                  id="ex1-pills-4"
                  role="tabpanel"
                  aria-labelledby="ex1-tab-4"
                >
                  Some other tab content or sample information now <br />
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip ex ea commodo consequat. Duis aute
                  irure dolor in reprehenderit in voluptate velit esse cillum
                  dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                  cupidatat non proident, sunt in culpa qui officia deserunt
                  mollit anim id est laborum.
                </div>
              </div>
           
            </div>
          </div>
        

                  <div class="d-flex mb-3">
                    <a href="#" class="me-3">
                      <img
                        src="/dist/img/5.jpg"
                        style="min-width: 96px; height: 96px"
                        class="img-md img-thumbnail"
                      />
                    </a>
                    <div class="info">
                      <a href="#" class="nav-link mb-1">
                    Coleccion de bolsos
                      </a>
                      <strong class="text-dark">S/29.50</strong>
                    </div>
                  </div>

                  <div class="d-flex mb-3">
                    <a href="#" class="me-3">
                      <img
                        src="/dist/img/3.jpg"
                        style="min-width: 96px; height: 96px"
                        class="img-md img-thumbnail"
                      />
                    </a>
                    <div class="info">
                      <a href="#" class="nav-link mb-1">
bolso negro                      </a>
                      <strong class="text-dark"> S/120.00</strong>
                    </div>
                  </div>

                  <div class="d-flex">
                    <a href="#" class="me-3">
                      <img
                        src="/dist/img/2.jpg"
                        style="min-width: 96px; height: 96px"
                        class="img-md img-thumbnail"
                      />
                    </a>
                    <div class="info">
                      <a href="#" class="nav-link mb-1">
Bolso marron                      </a>
                      <strong class="text-dark"> S/339.90</strong>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- Footer -->
          </div>
        </div>
      </div>
    </footer>
    <!-- Footer -->
  </body>
  <script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.umd.min.js"
  ></script>
</html>
