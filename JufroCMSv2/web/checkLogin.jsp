<%-- 
    Document   : checkLogin
    Created on : 11-08-2015, 4:08:56
    Author     : Zimri
--%>


<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=utf-8" />
<style type="text/css"></style>
<link rel="stylesheet" href="../css/style.css" type="text/css"/>
<script type="text/javascript" src="../js/script.js"></script>
</head>
    
<body>
<div class="contenido">
<%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String redirectURLprueba = "paginaAdmin.jsp";
            String redirectURLliveall = "../####/####/pagina.html";
            String redirectURLlogin = "./loginES.jsp";
            
         

            // Here you put the check on the username and password
            if (username.toLowerCase().trim().equals("a") && password.toLowerCase().trim().equals("1")) {
               //out.println("Welcome " + username + " <a href=\"index.jsp\">Back to main</a>");
               // session.setAttribute("username", username);
            	response.sendRedirect(redirectURLprueba);}
            if (username.toLowerCase().trim().equals("admin1") && password.toLowerCase().trim().equals("admin1")) {
                  response.sendRedirect(redirectURLliveall );                  
            }  
          else 
               {
        	  %>
        	  <table class="box-table-d" >
              <tr><td colspan="2" >Error en la contraseña o usuario, vuelve atras por favor.</td></tr> 
             </table>  
        	 <%
          }

%> 
</div>
    </BODY>
</HTML>
