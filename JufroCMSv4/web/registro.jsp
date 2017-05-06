<%-- 
    Document   : registro
    Created on : 05-08-2015, 16:14:08
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesion</title>
    </head>
    <body>
        <h1>Registro de Usuario</h1>
        <form action="hello.jsp" method="POST">
            <table border="1" align="center">

                <tbody>
                    <tr>
                        <td>Nombre</td>
                        <td> <input type="text" name="user" /></td>
                    </tr>
                    <tr>
                        <td>Mail</td>
                        <td><input type="text" name="email"  /></td>
                    </tr>
                    <tr>
                        <td>Contraseña</td>
                        <td><input type="password" name="pass"  /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Enviar" /></td>
                        
                    </tr>
                </tbody>
            </table>

        </form>

            
    </body>
</html>
