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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvendo, inicia sesion</h1>
        <%
            /*
        <jsp:useBean id="myBean" scope="page" class="miaplicacionweb.Usuario" />
        <jsp:setProperty name="myBean" property="user"  />
        <jsp:setProperty name="myBean" property="pass"  />
        <jsp:setProperty name="myBean" property="email" />
        */%>
        <table border="1" align ="center">
            <thead>
                <tr>
                    <td> Tus datos han sido ingresados </td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>nombre recibido: </td>
                    <%--<td><jsp:getProperty name="myBean" property="user" /></td>--%>
                </tr>
                <tr>
                    <%--<td><jsp:getProperty name="myBean" property="pass" /></td>--%>
                </tr>
                <tr>
                   <%-- <td><jsp:getProperty name="myBean" property="email" /></td>--%>
                </tr>
            </tbody>
        </table>

    </body>
</html>
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
     /*
        boolean a=myBean.insert();
        
        if(a==true){
            out.print("no sé creo q si");
        }else{
            out.print("creo q no");
        }
    */
%>