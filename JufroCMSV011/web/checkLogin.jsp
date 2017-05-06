<%-- 
    Document   : checkLogin
    Created on : 11-08-2015, 4:08:56
    Author     : Zimri
--%>


<%@page import="jufroweb.Item"%>
<%@page import="jufroweb.JufroMenu"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="miaplicacionweb.Usuario"%>

<%
    String email = request.getParameter("username");
    String password = request.getParameter("password");
    String redirectURLprueba = "index.jsp";

    Usuario a = new Usuario();
    if (a.login(email, password)) {
        HttpSession as = request.getSession();
        session.setAttribute("usuario", email);
        as.getId();
        JufroMenu mimenu = new JufroMenu();

        response.sendRedirect(redirectURLprueba);
        System.out.println(" as : " + as);

    } else {
        MiConfiguracion miweb = new MiConfiguracion();
        String html = "";

        html = "<h2>Ingrese sus datos de usuario</h2>"
                + "<h3 style='color: #FF0000;'>Error en datos ingresados</h3>"
                + "<form action='checkLogin.jsp'class='col-md-3 col-md-offset-5'>"
                + "<table class='box-table-d' >"
                + "<tr><td>Nombre:</td><td> <input name='username' size=15 type='text'/> </td></tr><tr><td> Password: </td> <td> <input type='password' name='password' />  </td> </tr><tr><td><input type='submit' value='login' /></td><td><a href='registro.jsp'> No estas registrado? Registrarse</a></td></tr></table></form>";

        miweb.setContent(html, request, session);
        out.print(miweb.getWebPage());
    }
%>
