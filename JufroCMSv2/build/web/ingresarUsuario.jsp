<%-- 
    Document   : ingresarUsuario
    Created on : 11-08-2015, 4:37:28
    Author     : Zimri
--%>

<%@page import="jufroweb.JufroCMSConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        JufroCMSConnection mic= new JufroCMSConnection();
        

        if (mic.isOK()){
        
        
            
         String nomV = request.getParameter("nombreUserNormal");
         out.print(nomV);
         String zona = request.getParameter("email");
         String coord = request.getParameter("password");
         String analistanom= "Usuario";
        
            
            
            String camposValores = " '%s','%s','%s','%s' ";
            camposValores = String.format(camposValores, nomV, coord, zona, analistanom);
            String campos = "ADMINISTRADOR,PASS,EMAIL,NOMBRE";
        
            
         
            
            boolean ingresar= mic.insercion("USUARIO", campos, camposValores);
        
            if (ingresar){
                out.print("Usuario fue agregado correctamente <br>");
               out.print(" <a href='index.jsp'> Agegar otro volcan </a> ");
            }else {
                out.print(mic.ultimomensaje());
                out.print(" <a href='registro.jsp'> Volver </a> ");
            }
                
        }else{
            out.print("no ingresa! >:C");
        }
        
        
        %>