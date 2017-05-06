<%-- 
    Document   : hello
    Created on : 22-08-2015, 18:31:21
    Author     : Zimri
--%>

<%@page import="miaplicacionweb.Usuario"%>
<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.JufroCMSConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
        
        Usuario mic= new Usuario();
        String user= request.getParameter("user");
        String email = request.getParameter("email");
        String pass= request.getParameter("pass");
        
        String camposValores = " '%s','%s','%s' ";
        camposValores = String.format(camposValores, user, pass, email);
        
       
        out.println(user);
        boolean ingresar= mic.insert(camposValores);
        
            if (ingresar){
                out.print(" fue agregado correctamente <br>");
                
            }else {
                out.print("no se agrega");
             
            }
            
    String back = "http://localhost:8084/JufroCMS/index.jsp";

    response.sendRedirect(back);

%>