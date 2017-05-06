<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verificador</title>
    </head>
    <body>
        <%
           String nom = request.getParameter("nombre");
           String ap = request.getParameter("apellido"); 
           String file = request.getParameter("certificado1");
           
           File f = new File("C:/Users/Luis/Documents/NetBeansProjects/CalcularRadio/public"+ file ); // validar que no se incluyan paths con directorio hacia arriba como ../../C://
           f.createNewFile();
       
       %>
       
       <table style="width:20%">
           <tr>
               <td>nombre</td>
               <td>apellido</td>
               <td></td>
           </tr>
           <tr>
               <td><%out.print(nom);%></td>
               <td><%out.print(ap);%></td>
               <td><%out.print(f);%></td>
               
           </tr>
       </table>
    </body>
</html>
