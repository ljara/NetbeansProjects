<%@page import="gestionDatos.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso 3 Puntos</title>
    </head>
    <body>
        <h1>Ingrese 3 puntos</h1>
        <form action="procesa.jsp" method="post">            
            nombre Color :<input type="text" name="p1x"/>    
            Hexadecimal:<input type="text" name="p1y"/><br/>
            <input type="submit" value="Verificar"/>
        </form>
    </body>
</html>
