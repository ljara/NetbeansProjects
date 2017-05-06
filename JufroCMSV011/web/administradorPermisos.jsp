<%-- 
    Document   : administradorPermisos
    Created on : 23-08-2015, 20:34:26
    Author     : Zimri
--%>


<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.Permiso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminPermisos</title>
    </head>
    <body>
        <h2>Administrar permisos</h2>
        <form action="administradorUsuarios.jsp" method="POST">
            <input type="submit" value="Enviar datos al administradorUsuario" />
        </form>
        
    </body>
</html>
<%
    
        MiConfiguracion miweb = new MiConfiguracion();
        Content a = new Content();

        String todos = a.allToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
                 
                        
                 


           
    
    /*
    Permiso a = new Permiso();
    MiConfiguracionAdmin ab = new MiConfiguracionAdmin();
    Layout ejemplo = new Layout("C:\\Users\\Zimri\\Documents\\NetBeansProjects\\JufroCMS\\web\\administradorUsuarios.jsp");
   ab.setContent(ejemplo.getWebPage(),request,session);
   
    out.print(a.allToHtml());*/
    %>