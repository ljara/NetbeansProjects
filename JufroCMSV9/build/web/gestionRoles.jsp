<%-- 
    Document   : gestionRoles
    Created on : 28-08-2015, 2:33:33
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%
    MiConfiguracionAdmin miweb = new MiConfiguracionAdmin();
        //JufroPage mipagina = new JufroPage(mic,request,session);
    //Content gestor = new Content();
    //String todos = gestor.allToHtml();
    //miweb.setContent(todos,request,session);

    miweb.setContent("Gestion de roles y permisos", request, session);
    out.print(miweb.getWebPage());
%>