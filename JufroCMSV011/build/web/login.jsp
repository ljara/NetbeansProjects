<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.Usuario"%>



<%

    MiConfiguracion miweb = new MiConfiguracion();
    String html = "";
%>


<%
    if (session.getAttribute("usuario") == null) {
        html = "<h2>Ingrese sus datos de usuario</h2>"
                + "<form action='checkLogin.jsp'class='col-md-3 col-md-offset-5'>"
                + "<table class='box-table-d' >"
                + "<tr><h1>Ingreso Validado por JSP</h1><td>Nombre:</td><td> <input name='username' size=15 type='text'/> </td></tr><tr><td> Password: </td> <td> <input type='password' name='password' />  </td> </tr><tr><td><input type='submit' value='login' /></td><td><a href='registro.jsp'> No estas registrado? Registrarse</a></td></tr></table></form>";
    } else {
        html = "Iniciada la sesion";
        html += "<div> <a href='logout.jsp'> Cerrar sesión </a> </div>";
    }

    miweb.setContent(html, request, session);
    out.print(miweb.getWebPage());

%>


