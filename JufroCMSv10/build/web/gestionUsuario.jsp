<%-- 
    Document   : gestionUsuario
    Created on : 23-08-2015, 20:03:08
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.MiConfiguracion"%>
<%

    MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
    //Content gestor = new Content();
    //String todos = gestor.allToHtml();
    //miweb.setContent(todos,request,session);

    miweb.setContent("Gestion de Usuarios", request, session);
    out.print(miweb.getWebPage());

%>