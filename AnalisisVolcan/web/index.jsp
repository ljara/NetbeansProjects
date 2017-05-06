<%-- 
    Document   : index
    Created on : 12-06-2015, 13:15:24
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Ingrese sus datos de usuario</h2>
        <table>


            <form name="formulario" method="post" action="Estaciones">
                <tr><td>Usuario</td><td><select name="user">
                            <option value="user">Usuario</option>
                            <option value="admin">Analista</option>                                              
                        </select></td></tr>
                <tr><td>Contraseña</td><td><input type="password" name="pwd"></td></tr>
                <!-- <tr><td>Volcan</td><td><input type="text" name="volcan"/> -->



                </td></tr>
                <tr><td><input type ="submit" value="Entrar"</td></tr>
            </form>
        </table>
    </body>
</html>
