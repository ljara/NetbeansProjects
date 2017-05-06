<%-- 
    Document   : busquedaDatos
    Created on : 13-06-2015, 16:30:07
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
        <h1>Muestra resultado por busqueda de nombre</h1>
                
        <%
                 Conexion mic= new Conexion();
        
                String nombreColor="";
                String codColor="";
                
                String tabla ="evento";
                String campo2="Volcannombrevolcan";
                String prefijo ="=";
                String camposValores = "'%s'";
                String condicion = request.getParameter("registro");
            camposValores = String.format(camposValores, condicion);
            out.print(camposValores);;
                 
        // select(String tabla, String campos, String prefijo,String campo, String condicion

        //select nombre_persona from personas where nombre_persona = 'Sofia';
            //select nombre from evento where nombrevolcan= villarrica
                if (mic.isOK()){
             
                ResultSet resp= mic.select("nombre", tabla, prefijo, campo2, camposValores);
                
            
                    while (resp.next()){
                        nombreColor = resp.getString(1);
                        //codColor = resp.getString("edad");
                        
                        out.print ("<TR>");
                        out.print("<TD>"+nombreColor+"</TD>");
                        //out.print("<TD>"+codColor+"</TD>");
                        out.print ("</TR>");
                    }
                }
         
         
            %>
          
    </body>
    <input type="button" value="Volver" onClick="location.href = 'formularioBusqueda.jsp' "><br>
</html>
