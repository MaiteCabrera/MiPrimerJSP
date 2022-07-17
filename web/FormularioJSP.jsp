<%-- 
    Document   : FormularioJSP
    Created on : 17-jul-2022, 14:36:37
    Author     : Covid
INTERACCIÓN ENTRE UN JSP Y UN SERVLET 
PASAJE/ALTA DE DATOS (POST)
Vamos a armar un formulario HTML para proporciopnar los datos desde el lado del
cliente. 
las etiquetas HTML dentro del JSP, donde en el formulario, en el apartado action,
se hace referencia al servlet que creamos anteriormente “SvPrueba” para hacer la 
redirección y enviar los datos del formulario al mencionado; al mismo tiempo 
agregamos el método por el cual será enviado, en este caso el POST.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvPrueba" method="POST">
            <p><label>DNI:      </label><input type="text" name="dni"     ></p>
            <p><label>Nombre:   </label><input type="text" name="nombre"  ></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Teléfono  </label><input type="text" name="teléfono"></p>
            <button type="submit"> Enviar </button>
        </form>
        <!--Recuperación de datos desde un Servlets a un JSP mediante GET   -->
        <h1>Ver lista de clientes<h/>
            <p>Si desea ver todos los clientes haga click en el botón mostrar clientes</p>
            <form action="SvPrueba" method="GET">
                <button type="submit">Mostrar Clientes</button>
            </form>
          
    </body>
</html>

