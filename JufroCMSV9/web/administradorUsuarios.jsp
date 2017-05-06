<%-- 
    Document   : administradorUsuarios
    Created on : 23-08-2015, 20:34:03
    Author     : Zimri
--%>


<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%@page import="miaplicacionweb.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h2>Administrar Usuarios</h2>
    <form action="verUsuario.jsp" method="POST" align="center">
            <%
        MiConfiguracionAdmin miweb = new MiConfiguracionAdmin();
        Usuario a = new Usuario();

        String todos = a.allToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
                 
                        
                 


            %>
            <input type="button" value="Volver" onClick="location.href = 'gestionUsuario.jsp'"><br>
        </form>

