<%-- 
    Document   : Poligono
    Created on : 15-12-2014, 10:44:32 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="utils.Utilidades" %>
<%@page import="org.Poligono" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Poligono</title>
    </head>
    <body>
        <h1>Poligono</h1>
        
        <%
            int [] c1,c2,c3,c4,c5,c6,c7,c8,c9;
            
            c1 = Utilidades.convertir(request.getParameter("c1").split(","));
            c2 = Utilidades.convertir(request.getParameter("c2").split(","));
            c3 = Utilidades.convertir(request.getParameter("c3").split(","));
            c4 = Utilidades.convertir(request.getParameter("c4").split(","));
            c5 = Utilidades.convertir(request.getParameter("c5").split(","));
            c6 = Utilidades.convertir(request.getParameter("c6").split(","));
            c7 = Utilidades.convertir(request.getParameter("c7").split(","));
            c8 = Utilidades.convertir(request.getParameter("c8").split(","));
            c9 = Utilidades.convertir(request.getParameter("c9").split(","));
            
            int [][] coordenadas = {c1,c2,c3,c4,c5,c6,c7,c8,c9};
            Poligono coor = new Poligono(coordenadas);
            out.print(coor.getArea());
        %>
    </body>
</html>
