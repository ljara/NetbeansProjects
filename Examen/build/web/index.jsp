<%-- 
    Document   : index
    Created on : 08-12-2014, 07:27:48 PM
    Author     : Luis
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Gestion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%  /*
            Conexion mic = new Conexion();
            Conexion mic2 = new Conexion();
            String nomColor = request.getParameter("NombreColor");
            String codColor = request.getParameter("CodigoColor");
            String junto = "'"+nomColor+"'"+","+"'"+codColor+"'";
            boolean m = mic.insercion("igcolor", "nombreColor, codColor", junto);
            out.println(m);
            boolean m = mic2.insercion("personas", "nombre, apellido","Luis, Jara");
            out.println(m);
            /*ResultSet resultados = mic2.extraccion("personas", "nombre, apellido");
            String nom, apell;
            while (resultados.next()) {
                nom = resultados.getString(1);
                apell = resultados.getString("codColor");
                out.print(nom + "Es " + apell + " <br>");
            }
 *          */
        
            Conexion asdf = new Conexion();
            boolean prueba = asdf.insercion("personas", "nombre, apellido", "'Luis', 'Jara'");
            out.print(prueba);
            boolean isOK = asdf.isOK();
    out.print(isOK);
%>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>