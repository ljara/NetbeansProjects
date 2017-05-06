<%-- 
    Document   : verPermiso
    Created on : 24-08-2015, 16:44:30
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Permiso"%>
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
    
    Permiso a = new Permiso();
    out.println(a(Integer.parseInt(id)));
    

   
   
    %>