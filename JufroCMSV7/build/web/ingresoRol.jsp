<%-- 
    Document   : ingresoRol
    Created on : 25-08-2015, 01:33:29 AM
    Author     : Luis
--%>

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
        <h2>Eliminar rol </h2>
    </body>
</html>
<%
        
        Rol  rol = new Rol();
        String tipo_rol= request.getParameter("tipo_rol");

        
        String camposValores = " '%s'";
        camposValores = String.format(camposValores, tipo_rol);
        
        boolean ingresar= rol.insert(camposValores);
        
            if (ingresar){
                out.print(" fue agregado correctamente <br>");
                out.print(rol.mostrarRoles());
            }else {
                out.print("no se agrega");
             
            }
       
 
    
    out.print(rol.allToHtml());
    %>