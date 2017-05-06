<%-- 
    Document   : administradorUsuarios
    Created on : 23-08-2015, 20:34:03
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<%
    Usuario a = new Usuario();
    
    out.print(a.allToHtml());
    %>