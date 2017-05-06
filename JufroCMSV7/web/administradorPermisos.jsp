<%-- 
    Document   : administradorPermisos
    Created on : 23-08-2015, 20:34:26
    Author     : Luis
--%>

<%@page import="miaplicacionweb.Permiso"%>
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
        <title>AdminPermisos</title>
    </head>
    <body>
        <h2>Administrar permisos</h2>
        
        
    </body>
</html>
<%
    Permiso a = new Permiso();
    
    out.print(a.allToHtml());
    %>