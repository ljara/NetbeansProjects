<%-- 
    Document   : verUsuario
    Created on : 23-08-2015, 21:24:42
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
    String id= request.getParameter("id");
    //out.println(id);
    
    Usuario a = new Usuario();
    out.println(a.toHtml(Integer.parseInt(id)));
   
   
    %>