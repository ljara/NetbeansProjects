<%@page import="jufroweb.JufroMenu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Content"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso </title>
    </head>
    <body>
        <h2>Login</h2>
          <form action="checkLogin.jsp" method="POST"> 
               <table class="box-table-d" >
               <tr><td colspan="2" >Login</td></tr> 
                    <tr>
                        <td> Username  : </td><td> <input name="username" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Password  : </td><td> <input name="password" size=15 type="text" /> </td> 
                    </tr>
                    <tr><td colspan="2"><input type="submit" value="login" /></td></tr>
                </table>
                <p><a href="registro.jsp">No estas registrado? Registrarse</a></p>
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
         
        miweb.setContent("HOLA MUNDO",request,session);
        out.print(miweb.getWebPage());
        %>

