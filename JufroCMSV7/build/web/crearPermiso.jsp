<%-- 
    Document   : crearPermiso
    Created on : 24-08-2015, 18:24:38
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Permiso"%>
<%
    String descripcion= request.getParameter("descripcion");
    int rolid= Integer.parseInt(request.getParameter("rolid"));
    
    
    Permiso p = new Permiso();
    
    p.insert(String.format("%s,'%s'",rolid, descripcion));
    
    String back = "http://localhost:8084/JufroCMS/verRol.jsp?id="+ rolid;

    response.sendRedirect(back);
    %>
