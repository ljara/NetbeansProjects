<%-- 
    Document   : estacion
    Created on : 12-06-2015, 13:05:59
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ingresarEvento.jsp" method="POST">
            <h2>Clasificación Volcán</h2>
            <TABLE BORDER=0>
                <TR>
                    <TD>Tipo de Evento</TD>
                    <TD>
                        <INPUT type=text name="nombreEvento">
                    </TD>
                </TR>
                <TR>
                    <TD>Fecha</TD>
                    <TD>
                        <INPUT type=text name="fecha">
                    </TD>
                </TR>
                <TR>
                    <TD>Volcán</TD>
                    <TD>
                        <INPUT type=text name="vnomv">
                    </TD>
                </TR>
                <TR>
                    <TD>Sigla estación</TD>
                    <TD>
                        <INPUT type=text name="estacion">
                    </TD>

                </TR>
            </TABLE>
            <input type="button" value="Volver Menu" onClick="location.href = 'menu.jsp' ">
            <input type="submit" value="Guardar" action="evento.jsp" />
        </FORM>   
    </body>
</html>
