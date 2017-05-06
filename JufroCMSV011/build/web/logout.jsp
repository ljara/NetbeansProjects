<%-- 
    Document   : logout
    Created on : 31-08-2015, 05:06:35 PM
    Author     : Luis
--%>

<%@page import="miaplicacionweb.Usuario"%>

<%
    session.removeAttribute("usuario");
    String url = "login.jsp";
    response.sendRedirect(url);
%>
