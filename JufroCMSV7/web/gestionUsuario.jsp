<%-- 
    Document   : gestionUsuario
    Created on : 23-08-2015, 20:03:08
    Author     : Zimri
--%>

<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
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
        <title>gestionUser</title>
    </head>
    <body>
        <h2>Menu Administrador</h2>
        
        <form action="administradorRoles.jsp" method="POST">
            <div class="form-group">
                <label>Editar Roles</label>
                <input type="submit" value="Acceder"  />
            </div>
        </form>

        <form action="administradorUsuarios.jsp">
            <div class="form-group">
                <label>Editar Usuarios</label>
                <input type="submit" value="Acceder" />
            </div>
        </form>

    </body>
</html>
<%
        
        MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
        Content gestor = new Content();
        String todos = gestor.allToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
        
        
        %>