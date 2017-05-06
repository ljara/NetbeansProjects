<%-- 
    Document   : eliminarRol
    Created on : 25-08-2015, 01:38:19 AM
    Author     : Luis
--%>

<%@page import="miaplicacionweb.Rol"%>
<%
    String idPermiso= request.getParameter("id");
    //String rolId = request.getParameter("rolid");
    
    //out.print(rolId);
    
    Rol p = new Rol();
    
    
    p.eliminarRol(Integer.parseInt(idPermiso));
    
    String back = "http://localhost:8084/JufroCMS/ingresoRol.jsp?id="+ idPermiso;

    response.sendRedirect(back);
    
    %>