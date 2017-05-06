<%-- 
    Document   : eliminarRol
    Created on : 25-08-2015, 1:17:51
    Author     : Zimri
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="miaplicacionweb.Rol"%>
<%
    
    
    String idPermiso= request.getParameter("id");
    //String rolId = request.getParameter("rolid");
    
    out.print(idPermiso);
    
    Rol p = new Rol();

    
    
    p.eliminarRol(Integer.parseInt(idPermiso));
    
    
    String back = "http://localhost:8084/JufroCMS/ingresoRol.jsp?id="+ idPermiso;

    response.sendRedirect(back);
    
    %>