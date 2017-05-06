
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.JufroCMSConnection"%>




        <%
        
        MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
        miweb.setContent("HOLA MUNDO",request,session);
        out.print(miweb.getWebPage());
        JufroCMSConnection ConexionJufro = new JufroCMSConnection(); 
        
        %>

