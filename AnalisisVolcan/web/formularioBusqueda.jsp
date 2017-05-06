<%-- 
    Document   : formularioBusqueda
    Created on : 13-06-2015, 16:14:40
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Buscar Datos</h3>
        
        <form action="busquedaDatos.jsp" method="POST">
            <td>Evento</td>
            <td><input name="registro" type="text"></td>
            <input type="submit" value="Buscar" />
            <input type="button" value="Volver" onClick="location.href = 'menu.jsp' "><br>
        </form>

    </body>
</html>
