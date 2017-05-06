<%-- 
    Document   : ingresarEvento
    Created on : 13-06-2015, 15:58:02
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
        <h1>Hello World!</h1>
    </body>
</html>
<%
        Conexion mic= new Conexion();
        

        if (mic.isOK()){
        
        
            
         String nomE = request.getParameter("nombreEvento");
         String fecha = request.getParameter("fecha");
         String VolnombreVol = request.getParameter("vnomv");
         String siglaEst = request.getParameter("estacion");
        
            
            
            String camposValores = " '%s','%s','%s','%s' ";
            camposValores = String.format(camposValores, nomE, fecha, VolnombreVol, siglaEst);
            String campos = "tipoEvento,fecha,Volcannombrevolcan,estacionsiglaEstacion";
 
            boolean ingresar= mic.insercion("evento", campos, camposValores);
        
            if (ingresar){
                out.print("Evento agregado correctamente <br>");
                out.print(" <a href='evento.jsp'> Agregar otro Evento </a> ");
            }else {
                out.print(mic.ultimomensaje());
                out.print(" <a href='evento.jsp'> Volver </a> ");
            }
                
        }else{
            out.print("no ingresa");
        }
        
        
        %>
