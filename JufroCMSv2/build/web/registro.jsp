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
        <h1>Iniciar sesion</h1>
        
        <form action="/validarUsuario" method="post">w
            <p> Nombre: <input type="text" name="anonimo" </p>
            <p> Email: <input type="text" name="email"></p>
            <p> Contraseña: <input type="password" name="password"></p>
            <p><input type="submit" value="Entrar"></p>
        </form>
    </body>
</html>
