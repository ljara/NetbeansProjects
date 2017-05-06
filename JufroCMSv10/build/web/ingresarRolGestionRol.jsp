<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<form action="ingresoRol.jsp" method="POST">
    <h2>Ingresar Roles</h2>
    <input type="text" name="tipo_rol"  />
    <%

        MiConfiguracion miweb = new MiConfiguracion();
        Layout ejemplo = new Layout("C:\\Users\\Zimri\\Documents\\NetBeansProjects\\JufroCMS\\web\\ingresarRolGestionRol.jsp");
        miweb.setContent(ejemplo.getWebPage(), request, session);
//String todos = rol.allToHtml();
        //miweb.setContent(todos, request, session);
        out.print(miweb.getWebPage());
    %>
    <input type="submit" value="Ingresar" />
</form>
