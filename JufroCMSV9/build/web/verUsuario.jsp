<%-- 
    Document   : verUsuario
    Created on : 23-08-2015, 21:24:42
    Author     : Zimri
--%>

<%@page import="jufroweb.Content"%>
<%@page import="miaplicacionweb.MiConfiguracionAdmin"%>
<%@page import="java.util.ArrayList"%>
<%@page import="miaplicacionweb.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VerUsuario</title>
    </head>
    <body>
        <h2>Role(s) asignado(s)</h2>
        <form action="#" method="POST">
            <%    String id = request.getParameter("id");
                
    //out.println(id);
                Usuario ab = new Usuario();
                out.println(ab.toHtml(Integer.parseInt(id)));%>
        </form>
        <form action="#" method="POST">
            <%   
                out.println(ab.rolesToHtml(Integer.parseInt(id)));
            
            %>
            <input  type = "submit" value = "actualizar" />
            <input type="button" value="Volver" onClick="location.href = 'administradorUsuarios.jsp' "><br>
        </form>

            <%  
                String roles[]=request.getParameterValues("roles[]");
                ArrayList<Integer> rolesId= new ArrayList<Integer>();
                if(roles!= null && roles.length>0){
                    for(String rol : roles){
                    rolesId.add(Integer.parseInt(rol));
                }
                ab.asignarRoles(rolesId, Integer.parseInt(id));
                }
                
               
             MiConfiguracionAdmin miweb = new MiConfiguracionAdmin();
              //miweb.setContent("Gestion de roles y permisos",request,session);
              //out.print(miweb.getWebPage());
        Content gestor = new Content();
        String todos = ab.allToHtml();
        miweb.setContent(todos,request,session);
        out.print(miweb.getWebPage());
            
            %>
    </body>
</html>
