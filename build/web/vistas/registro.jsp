<%-- 
    Document   : registro
    Created on : 23 may 2024, 9:52:57 a.m.
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
    <!-- Pills navs -->
    <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
      <li class="nav-item" role="presentation">
        <a
          class="nav-link active"
          id="tab-login"
          data-mdb-pill-init
          href="#pills-login"
          role="tab"
          aria-controls="pills-login"
          aria-selected="true"
          >Iniciar sesion</a
        >
      </li>
      <li class="nav-item" role="presentation">
        <a
          class="nav-link"
          id="tab-register"
          data-mdb-pill-init
          href="#pills-register"
          role="tab"
          aria-controls="pills-register"
          aria-selected="false"
          >Registro</a
        >
      </li>
    </ul>
    <div class="tab-content">
      <div
        class="tab-pane fade show active"
        id="pills-login"
        role="tabpanel"
        aria-labelledby="tab-login"
      >
        <form>
          <div class="text-center mb-3">
            <p>Iniciar con:</p>
            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-facebook-f"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-google"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-twitter"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-github"></i>
            </button>
          </div>

          <p class="text-center">o:</p>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="email" id="loginName" class="form-control" />
            <label class="form-label" for="loginName">Email</label>
          </div>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="password" id="loginPassword" class="form-control" />
            <label class="form-label" for="loginPassword">Contraseña</label>
          </div>

          <div class="row mb-4">
            <div class="col-md-6 d-flex justify-content-center">
              <div class="form-check mb-3 mb-md-0">
                <input
                  class="form-check-input"
                  type="checkbox"
                  value=""
                  id="loginCheck"
                  checked
                />
                <label class="form-check-label" for="loginCheck">
                  Recuerdame
                </label>
              </div>
            </div>

            <div class="col-md-6 d-flex justify-content-center">
              <!-- Simple link -->
              <a href="#!">¿Te olvidaste la contraseña?</a>
            </div>
          </div>

          <!-- Submit button -->
          <button
            type="submit"
            data-mdb-button-init
            data-mdb-ripple-init
            class="btn btn-primary btn-block mb-4"
          >
            Ingresa
          </button>

          <!-- Register buttons -->
          <div class="text-center">
            <p>¿No eres un cliente? <a href="#!">Registrate</a></p>
          </div>
        </form>
      </div>
      <div
        class="tab-pane fade"
        id="pills-register"
        role="tabpanel"
        aria-labelledby="tab-register"
      >
        <form>
          <div class="text-center mb-3">
            <p>Registrate con:</p>
            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-facebook-f"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-google"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-twitter"></i>
            </button>

            <button
              type="button"
              data-mdb-button-init
              data-mdb-ripple-init
              class="btn btn-link btn-floating mx-1"
            >
              <i class="fab fa-github"></i>
            </button>
          </div>

          <p class="text-center">o:</p>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="text" id="registerName" class="form-control" />
            <label class="form-label" for="registerName">Nombre</label>
          </div>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="text" id="registerUsername" class="form-control" />
            <label class="form-label" for="registerUsername">Apellidos</label>
          </div>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="email" id="registerEmail" class="form-control" />
            <label class="form-label" for="registerEmail">Email</label>
          </div>

          <div data-mdb-input-init class="form-outline mb-4">
            <input type="password" id="registerPassword" class="form-control" />
            <label class="form-label" for="registerPassword">Contraseña</label>
          </div>

          <div data-mdb-input-init class="form-outline mb-4">
            <input
              type="password"
              id="registerRepeatPassword"
              class="form-control"
            />
            <label class="form-label" for="registerRepeatPassword"
              >Repetir contraseña</label
            >
          </div>

          <div class="form-check d-flex justify-content-center mb-4">
            <input
              class="form-check-input me-2"
              type="checkbox"
              value=""
              id="registerCheck"
              checked
              aria-describedby="registerCheckHelpText"
            />
            <label class="form-check-label" for="registerCheck">
              Estoy de acuerdo con los terminos y condiciones
            </label>
          </div>

          <button
            type="submit"
            data-mdb-button-init
            data-mdb-ripple-init
            class="btn btn-primary btn-block mb-3"
          >
            Continuar
          </button>
        </form>
      </div>
    </div>
  </body>
  <script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.2.0/mdb.umd.min.js"
  ></script>
</html>
