<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%@page import="miaplicacionweb.Rol"%>
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
        <title>IngresoRol</title>
    </head>
    <body>
        <h2>Ingresar rol </h2>
        <form action="#" method="POST">
            <%

    Rol rol = new Rol();
    String tipo_rol = request.getParameter("tipo_rol");

    String camposValores = " '%s'";
    camposValores = String.format(camposValores, tipo_rol);

    boolean ingresar = rol.insert(camposValores);

    //out.print(rol.allToHtml());
    MiConfiguracionAdmin miweb = new MiConfiguracionAdmin();
        
        String todos = rol.allToHtml();
        miweb.setContent(todos, request, session);
        out.print(miweb.getWebPage());
%>
        </form>
        <input type="button" value="Volvera a menu " onClick="location.href = 'gestionRoles.jsp'"><br>
    </body>
</html>
