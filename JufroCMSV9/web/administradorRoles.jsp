<%-- 
    Document   : administradorRoles
    Created on : 23-08-2015, 20:12:07
    Author     : Zimri
--%>

<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%@page import="miaplicacionweb.Rol"%>
<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h2>Ingresar Rol</h2>
<form action="ingresarRolGestionRol.jsp" method="POST">

    <%
        MiConfiguracionAdmin miweb = new MiConfiguracionAdmin();
        Rol a = new Rol();
        String todos = a.allToHtml();
        miweb.setContent(todos, request, session);
        out.print(miweb.getWebPage());

    %>
    <input type="button" value="Volver" onClick="location.href = 'gestionRoles.jsp'"><br>
</form> 

