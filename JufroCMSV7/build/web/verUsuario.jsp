<%-- 
    Document   : verUsuario
    Created on : 23-08-2015, 21:24:42
    Author     : Luis
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="miaplicacionweb.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>VerUsuario</title>
    </head>
    <body>
        <h2>Role(s) asignado(s)</h2>
        
        <form action="#" method="POST">
            <%    String id = request.getParameter("id");
        //Saca el ID del usuario actual        
                Usuario a = new Usuario();
                out.println(a.toHtml(Integer.parseInt(id)));%>
        </form>
        <form action="#" method="POST">
            <%   //Saca todos los roles y los que tiene asignado el usuario actual
                out.println(a.rolesToHtml(Integer.parseInt(id)));
            
            %>
            <input  type = "submit" value = "actualizar" />
        </form>

            <%  
                String roles[]=request.getParameterValues("roles[]");
                ArrayList<Integer> rolesId= new ArrayList<Integer>();
                if(roles!= null && roles.length>0){
                    for(String rol : roles){
                    rolesId.add(Integer.parseInt(rol));
                }
                a.asignarRoles(rolesId, Integer.parseInt(id));
                }
            
            %>
    </body>
</html>
