<%-- 
    Document   : eliminarPermiso
    Created on : 24-08-2015, 17:57:37
    Author     : Zimri
--%>



<%@page import="miaplicacionweb.Permiso"%>
<%
    String idPermiso= request.getParameter("id");
    String rolId = request.getParameter("rolid");
    
    out.print(rolId);
    
    Permiso p = new Permiso();
    
    
    p.eliminarPermiso(Integer.parseInt(idPermiso));
    
    String back = "http://localhost:8084/JufroCMS/verRol.jsp?id="+ rolId;

    response.sendRedirect(back);
    
    %>