<%-- 
    Document   : verRol
    Created on : 24-08-2015, 0:02:26
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Permiso"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="miaplicacionweb.Rol"%>
<%@page import="miaplicacionweb.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!DOCTYPE html>

<h2>Edición roles</h2>
<label>Rol: </label>
<%
    String id= request.getParameter("id");
    //out.println(id);
    
    Rol a = new Rol();
    out.println(a.toHtml(Integer.parseInt(id)));
    
    Permiso b = new Permiso();
    out.println(b.mostrarPermisos());
   
   
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>verRol</title>
    </head>
    <body>
        
        <form action="crearPermiso.jsp" method="POST">
            <h2>Crear permiso</h2>
            <input type="text" name="rolid" value="<%= id%>"   hidden/>
            <label>
                Descripcion
                <input type="text" name="descripcion"  />
            </label>
            <input type="submit" value="Guardar" />
            
            <input type="button" value="Volver" onClick="location.href = 'verUsuario.jsp?id='+<%= id%>+ "><br>
            <input type="button" value="Volvera a menu " onClick="location.href = 'gestionUsuario.jsp' "><br>
          
            
        </form>
    </body>
</html>
<%                   MiConfiguracion miweb = new MiConfiguracion();
              miweb.setContent("Gestion de roles y permisos",request,session);
        out.print(miweb.getWebPage());%>