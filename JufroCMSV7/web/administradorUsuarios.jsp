<%-- 
    Document   : administradorUsuarios
    Created on : 23-08-2015, 20:34:03
    Author     : Luis
--%>

<%@page import="miaplicacionweb.Usuario"%>
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
        <title>administrarUsuarios</title>
    </head>
    <body>
        <h2>Administrar Usuarios</h2>
        
        
<%
    Usuario a = new Usuario();
    
    out.print(a.allToHtml());
%>
    </body>
</html>

