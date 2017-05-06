<%-- 
    Document   : index
    Created on : 15-12-2014, 10:26:35 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Stylesheet -->
        <style>
            label, input{
                display: block;
            }
        </style>
            
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coordenadas</title>
    </head>
    <body>
        <h1>Coordenadas</h1>
        
        <form method="post" action="Poligono.jsp">
            <label>Coordenada 1:</label><input type = "text" name = "c1">
            <label>Coordenada 2:</label><input type = "text" name = "c2">
            <label>Coordenada 3:</label><input type = "text" name = "c3">
            <label>Coordenada 4:</label><input type = "text" name = "c4">
            <label>Coordenada 5:</label><input type = "text" name = "c5">
            <label>Coordenada 6:</label><input type = "text" name = "c6">
            <label>Coordenada 7:</label><input type = "text" name = "c7">
            <label>Coordenada 8:</label><input type = "text" name = "c8">
            <label>Coordenada 9:</label><input type = "text" name = "c9">
            <input type="submit" value="Enviar Consulta">
            
        </form>
    </body>
</html>
