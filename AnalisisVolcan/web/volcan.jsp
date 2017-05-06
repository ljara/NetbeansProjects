<%-- 
    Document   : busqueda
    Created on : 13-06-2015, 13:24:23
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="gestionBaseDatos.Conexion"%>
<%@ page language ="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ingresarVolcan.jsp" method="POST">
            Ingrese Datos de Volcan
            <TABLE BORDER=0>
                <TR>
                    <TD>Nombre</TD>
                    <TD>
                        <INPUT type=text name="nombreVol">
                    </TD>
                </TR>

                <TR>
                    <TD>Zona</TD>
                    <TD>
                        <INPUT type=text name="zona">
                    </TD>

                </TR>
                <TR>
                    <TD>Coordenadas</TD>
                    <TD>
                        <INPUT type=text name="coord">
                    </TD>

                </TR>
            </TABLE>
            <input type="submit" value="enviar Datos" action="volcan.jsp" />
            <input type="button" value="Volver a Menu" onClick="location.href = 'menu.jsp' "><br>
        </FORM>   
    </body>
</html>

