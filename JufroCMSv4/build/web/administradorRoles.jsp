<%-- 
    Document   : administradorRoles
    Created on : 23-08-2015, 20:12:07
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Rol"%>
<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
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
        
        MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
        Rol gestor = new Rol();
        String todos = gestor.allToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
        
        
        %>