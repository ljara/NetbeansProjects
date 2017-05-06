<%-- 
    Document   : index
    Created on : 12-06-2015, 13:15:24
    Author     : Luis
--%>

<%@page import="jufroweb.JufroMenu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Content"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h2>Ingrese sus datos de usuario</h2>
        <form action="checkLogin.jsp"class="col-md-3 col-md-offset-5"> 
            <table class="box-table-d" >
                <tr>
                    <td>Username:</td> 
                    <td> <input name="username" size=15 type="text" /> </td>
                </tr>
                <tr>
                    <td> Password: </td>
                    <td> <input type="password" name="password" />  </td> 
                </tr>
                <tr>
                    <td><input type="submit" value="login" /></td>
                    <td><a href="registro.jsp"> No estas registrado? Registrarse</a></td>
                </tr>

            </table>            
        </form>

    </body>
</html>

<%

    // JufroMenu mimenu = new JufroMenu();
    //  mimenu.addMenuItemFromHtml("Ini", "layout.html");
    //MiConfiguracion miweb = new MiConfiguracion();
    //JufroPage mipagina = new JufroPage(mic,request,session);
    //Content gestor = new Content();
    //String todos = gestor.allToHtml();
    //miweb.setContent(todos,request,session);
    // out.print(miweb.getWebPage());
    MiConfiguracion miweb = new MiConfiguracion();
    //JufroPage mipagina = new JufroPage(mic,request,session);

    miweb.setContent("HOLA MUNDO", request, session);
    out.print(miweb.getWebPage());
%>

