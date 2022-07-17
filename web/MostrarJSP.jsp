<%-- 
    Creamos el nuevo JSP "MostrarJsp" para recibir el parámetro enviado desde el servlet 
y mostrarlo a usuario. 
--%>

<%@page import="Servlets.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Lista de clientes</h1>
        <%
            List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            int cont=1;
            for (Cliente cli : listaClientes){ %>
            <p><b>Cliente N°<%=cont%></b></p>
            <p><b>Dni: <%=cli.getDni() %></b></p>
            <p><b>Nombre: <%=cli.getNombre()%></b></p>
            <p><b>Apellido: <%=cli.getApellido()%></b></p>
            <p><b>Teléfono: <%=cli.getTelefono()%></b></p>
            
           <%-- Incremento mi contador, 
           para mostrar correctamente cada num de cliente --%>
           <% cont= cont+1; %>
           <%}%>
            
    </body>
</html>
