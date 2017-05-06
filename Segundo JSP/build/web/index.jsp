<%-- 
    Document   : index
    Created on : 01-06-2015, 03:56:32 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Segundo JSP</title>
    </head>
    <body>
        <h1>Ejemplo de colores</h1>
        <form name="colores" action="otro.jsp" method="GET">
            <br>Color fondo <input type="text" name="fondo"/>
            <br>Color letra <input type="text" name="letra"/>
            <br><input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
