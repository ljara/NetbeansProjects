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


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>verRol</title>
    </head>
    <body>

        <h2>Edición roles</h2>
        <label>Rol: </label>
        <%
            String id = request.getParameter("id");
            //out.println(id);

            Rol a = new Rol();
            out.println(a.toHtml(Integer.parseInt(id)));

        %>

        <form action="crearPermiso.jsp" method="POST">
            <h2>Crear permiso</h2>
            <input type="text" name="rolid" value="<%= id%>"   hidden/>
            <label>
                Descripcion
                <input type="text" name="descripcion"  />
            </label>
            <input type="submit" value="Guardar" />


        </form>
    </body>
</html>
