<%-- 
    Document   : administradorRoles
    Created on : 23-08-2015, 20:12:07
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Rol"%>
<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>adminRoles</title>
    </head>
    <body>
        <h2>Ingresar Roles</h2>
        <form action="ingresoRol.jsp" method="POST">
            <input type="text" name="tipo_rol"  />
            <input type="submit" value="Ingresar" />
        </form>
    </body>
</html> 