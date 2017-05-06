<%-- 
    Document   : gestionUsuario
    Created on : 23-08-2015, 20:03:08
    Author     : Zimri
--%>

<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu Opciones de Administrador</h1>
        <form action="administradorRoles.jsp" method="POST">

            <ul type="circle">
                <li>Editar Roles</li>
                <input type="submit" value="Acceder"  />
            </ul>


        </form>

        <form action="administradorPermisos.jsp">
            <ul type="circle">
                <li>Editar Permisos</li>
                <input type="submit" value="Acceder" />
            </ul>


        </form>

        <form action="administradorUsuarios.jsp">
            <ul type="circle">
                <li>Editar Usuarios</li>
                <input type="submit" value="Acceder" />
            </ul>

        </form>

    </body>
</html>
<%
        
        MiConfiguracion miweb = new MiConfiguracion();
        //JufroPage mipagina = new JufroPage(mic,request,session);
        Content gestor = new Content();
        String todos = gestor.allUserToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
        
        
        %>