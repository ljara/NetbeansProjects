<%-- 
    Document   : verRol
    Created on : 24-08-2015, 0:02:26
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Rol"%>
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
    
    Rol a = new Rol();
    out.println(a.toHtml(Integer.parseInt(id)));
    
    
   
   
    %>