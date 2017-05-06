<%@page import="miaplicacionweb.MiConfiguracionGestion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Content"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gestionUsuarios</title>
    </head>
    <body>

        <%

            MiConfiguracion miweb = new MiConfiguracion();
            Content gestor = new Content();
            String todos = gestor.allUserToHtml();
            miweb.setContent(todos, request, session);
            out.print(miweb.getWebPage());

        %>
        
        <h2>Ingrese sus datos de usuario</h2>
            <form name="formulario" method="post" action="" >
                <tr><td>Usuarios</td><td><select name="user">
                            <option value="adminlist">Juanito</option>
                            <option value="nombre1">Pedro</option>

                        </select></td></tr>
                <tr><td>Roles</td><td><select name="rol">
                            <option value="adminlist">Administrador</option>
                            <option value="lector">Lector</option>
                            <option value ="desarrollador">Desarrollador</option>
                            <option value ="comun">Comun</option>                                           
                        </select></td></tr>
                <tr><td>Permisos</td><td><select name="permiso">
                            <option value="menu1">Home</option>
                            <option value="menu2">Servicios</option>
                            <option value="menu3">Productos</option>
                            <option value="menu4">Servicios</option> 
                        </select></td></tr>
                </td></tr>
                <tr><td>
                        <input type ="submit" value="Guardar">
                        <!-- <input type="button" value="No estas registrado? registrate" onClick="location.href = 'registro.jsp' "><br> -->
                    </td></tr>
            </form>
    </body>
</html>
