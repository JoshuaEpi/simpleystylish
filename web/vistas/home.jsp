<%-- 
    Document   : home
    Created on : 23 may 2024, 9:40:22 a.m.
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
    <link
    href="./css/home_css.css" rel="stylesheet"
  />
    <title>Inicio</title>
  </head>
  <body>
    <header>
      <div class="p-3 text-center bg-white border-bottom">
        <div class="container">
          <div class="row gy-3">
            <div class="col-lg-2 col-sm-4 col-4">
              <a target="_blank" class="float-start">
                <img src="dist/img/1.jpg" height="50" />
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
                  <p class="d-none d-md-block mb-0">Iniciar sesion</p>
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
                  <label class="form-label" for="form1">Buscar</label>
                </div>
                <button type="button" class="btn btn-primary shadow-0">
                  <i class="fas fa-search"></i>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <nav class="navbar navbar-expand-lg navbar-light bg-white">
        <div
          class="container justify-content-center justify-content-md-between"
        >
          <button
            class="navbar-toggler border py-2 text-dark"
            type="button"
            data-mdb-toggle="collapse"
            data-mdb-target="#navbarLeftAlignExample"
            aria-controls="navbarLeftAlignExample"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <i class="fas fa-bars"></i>
          </button>

          <div class="collapse navbar-collapse" id="navbarLeftAlignExample">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link text-dark" aria-current="page" href="home.jsp"
                  >Principal</a
                >

                <!-- Dropdown menu -->
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li>
                    <a class="dropdown-item" href="#">Action</a>
                  </li>
                  <li>
                    <a class="dropdown-item" href="#">Another action</a>
                  </li>
                  <li><hr class="dropdown-divider" /></li>
                  <li>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </li>
                </ul>
              </li>
            </ul>
            <!-- Left links -->
          </div>
        </div>
        <!-- Container wrapper -->
      </nav>

      <div class="bg-primary text-white py-5">
        <div class="container py-5">
          <h1>Simple & Stylish</h1>
          <p>Productos de moda, precios de fábrica, excelente servicio.</p>
          <button type="button" class="btn btn-outline-light">Conocenos</button>
          <button
            type="button"
            class="btn btn-light shadow-0 text-primary pt-2 border border-white"
          >
            <span class="pt-1">Comprar Ahora</span>
          </button>
        </div>
      </div>
    </header>

    <section>
      <div class="container my-5">
        <header class="mb-4">
          <h3>Morrales</h3>
        </header>

        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/2.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Cartera gucci</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/3.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolso negro</h5>
                <p class="card-text">S/320.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/4.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">bolso negro con oro 🤑</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/5.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">2x1</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/6.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Coleccion de bolsos</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/7.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Mas bolsos</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/8.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolsos coleccion de invierno</h5>
                <p class="card-text">S/99.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border icon-hover px-2 pt-2"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
         </div>
      <div class="container my-5">
        <header class="mb-4">
          <h3>Bolsas</h3>
        </header>

        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/2.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Cartera gucci</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/3.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolso negro</h5>
                <p class="card-text">S/320.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/4.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">bolso negro con oro 🤑</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/5.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">2x1</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/6.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Coleccion de bolsos</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/7.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Mas bolsos</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/8.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolsos coleccion de invierno</h5>
                <p class="card-text">S/99.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border icon-hover px-2 pt-2"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
               </div>
      <div class="container my-5">
        <header class="mb-4">
          <h3>Carteras</h3>
        </header>

        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/2.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Cartera gucci</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/3.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolso negro</h5>
                <p class="card-text">S/320.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/4.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">bolso negro con oro 🤑</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/5.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">2x1</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/6.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Coleccion de bolsos</h5>
                <p class="card-text">S/790.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/7.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Mas bolsos</h5>
                <p class="card-text">S/120.00</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
            <div class="card w-100 my-2 shadow-2-strong">
              <img
                src="dist/img/8.jpg"
                class="card-img-top"
                style="aspect-ratio: auto"
              />
              <div class="card-body d-flex flex-column">
                <h5 class="card-title">Bolsos coleccion de invierno</h5>
                <p class="card-text">S/99.50</p>
                <div
                  class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto"
                >
                  <a href="carrito.jsp" class="btn btn-primary shadow-0 me-1"
                    >Agregar al carrito</a
                  >
                  <a href="#!" class="btn btn-light border icon-hover px-2 pt-2"
                    ><i class="fas fa-heart fa-lg text-secondary px-1"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
               </div>
   
    </section>
    <!-- Products -->

    <!-- Feature -->
    <section class="mt-5" style="background-color: #f5f5f5">
      <div class="container text-dark pt-3">
        <header class="pt-4 pb-3">
          <h3>Por qué elegirnos</h3>
        </header>

        <div class="row mb-4">
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i
                  class="fas fa-camera-retro fa-2x fa-fw text-primary floating"
                ></i>
              </span>
              <figcaption class="info">
                <h6 class="title">Precios razonables
                </h6>
                <p>
                    Ofrecemos productos a precios accesibles sin comprometer la calidad.


                </p>
              </figcaption>
            </figure>
           
          </div>
          
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i class="fas fa-star fa-2x fa-fw text-primary floating"></i>
              </span>
              <figcaption class="info">
                <h6 class="title">La mejor calidad           </h6>
                <p>
                    Nos comprometemos a ofrecerte productos de la más alta calidad para satisfacer tus necesidades.


                </p>
              </figcaption>
            </figure>
          
          </div>
        
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i class="fas fa-plane fa-2x fa-fw text-primary floating"></i>
              </span>
              <figcaption class="info">
                <h6 class="title">Envio mundial</h6>
                <p>
                    ¡Enviamos nuestros productos a todo el mundo para que puedas disfrutar de nuestras creaciones dondequiera que estés!


                </p>
              </figcaption>
            </figure>
          
          </div>
         
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i class="fas fa-users fa-2x fa-fw text-primary floating"></i>
              </span>
              <figcaption class="info">
                <h6 class="title">Satisfacción del cliente
                </h6>
                <p>
                    Nuestro principal objetivo es tu satisfacción. Trabajamos para garantizar que tengas la mejor experiencia de compra posible.


                </p>
              </figcaption>
            </figure>
      
          </div>
        
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i
                  class="fas fa-thumbs-up fa-2x fa-fw text-primary floating"
                ></i>
              </span>
              <figcaption class="info">
                <h6 class="title">Clientes felices</h6>
                <p>
                    Nuestros clientes son nuestra mayor prioridad y nos esforzamos por mantenerlos satisfechos en cada compra.


                </p>
              </figcaption>
            </figure>
          
          </div>
        
          <div class="col-lg-4 col-md-6">
            <figure class="d-flex align-items-center mb-4">
              <span class="rounded-circle bg-white p-3 d-flex me-2 mb-2">
                <i class="fas fa-box fa-2x fa-fw text-primary floating"></i>
              </span>
              <figcaption class="info">
                <h6 class="title">Amplia selección de productos </h6>
                <p>
                    Con una amplia gama de artículos, estamos seguros de que encontrarás el complemento perfecto para tu estilo y necesidades.
                </p>
              </figcaption>
            </figure>
         
          </div>
       
        </div>
      </div>
      
    </section>
 
    <footer
      class="text-center text-lg-start text-muted mt-3"
      style="background-color: #f5f5f5"
    >
     
      </section>

      <div class="">
        <div class="container">
          <div class="d-flex justify-content-between py-4 border-top">
            <div>
              <i class="fab fa-lg fa-cc-visa text-dark"></i>
              <i class="fab fa-lg fa-cc-amex text-dark"></i>
              <i class="fab fa-lg fa-cc-mastercard text-dark"></i>
              <i class="fab fa-lg fa-cc-paypal text-dark"></i>
            </div>
      
                 </div>
    </footer>
  </body>
  <script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.umd.min.js"
  ></script>
</html>
