<%-- 
    Document   : registro
    Created on : 05-08-2015, 16:14:08
    Author     : Zimri
--%>

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
        <title>RegistroUsuario</title>
    </head>
    <body>
        <h2>Registro de Usuario</h2>
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
