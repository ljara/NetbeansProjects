<%-- 
    Document   : paginaAdmin
    Created on : 11-08-2015, 1:59:40
    Author     : Zimri
--%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>



        <%
        
        MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
        miweb.setContent("Bienvenido Administrador",request,session);
        out.print(miweb.getWebPage());
        
        
        %>
