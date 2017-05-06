<%-- 
    Document   : index
    Created on : 18-05-2015, 09:25:46 AM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="generadorHTML.ColorHTML" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"></link>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SegundoJSP</title>
    </head>
    <body>
        <%ColorHTML w = new ColorHTML(); %>
        <%= w.tablaColores() %>
    </body>
</html>
