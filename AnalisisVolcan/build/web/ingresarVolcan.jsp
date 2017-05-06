<%-- 
    Document   : ingresarDatos
    Created on : 13-06-2015, 15:08:41
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
        
        
            
         String nomV = request.getParameter("nombreVol");
         out.print(nomV);
         String zona = request.getParameter("zona");
         String coord = request.getParameter("coord");
         String analistanom= "Analista";
        
            
            
            String camposValores = " '%s','%s','%s' ";
            camposValores = String.format(camposValores, nomV, zona, coord);
            String campos = "nombreVolcan,zona,coordenadas";
        
            
         
            
            boolean ingresar= mic.insercion("volcan", campos, camposValores);
        
            if (ingresar){
                out.print("Volcan fue agregado correctamente <br>");
                out.print(" <a href='volcan.jsp'> Agregar otro volcan </a> ");
            }else {
                out.print(mic.ultimomensaje());
                out.print(" <a href='volcan.jsp'> Volver </a> ");
            }
                
        }else{
            out.print("no ingresa");
        }
        
        
        %>