<%-- 
    Document   : index
    Created on : 31-10-2014, 10:49:00 AM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gráfico SVG</title>
    </head>
    <body>
        <h1>Gráfico svg</h1>
        
        <form action="Graficar.jsp" method="post">            
            Barra 1:<input type="text" name="b1"/><br/>
            Barra 2:<input type="text" name="b2"/><br/>
            Barra 3:<input type="text" name="b3"/><br/>
            Barra 4:<input type="text" name="b4"/><br/>
            Barra 5:<input type="text" name="b5"/><br/>
            <input type="submit" value="Graficar"/>
        </form>
    </body>
</html> 