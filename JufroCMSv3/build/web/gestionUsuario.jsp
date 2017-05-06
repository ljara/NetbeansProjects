<%-- 
    Document   : gestionUsuario
    Created on : 11-08-2015, 2:11:12
    Author     : Zimri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <h2>Ingrese sus datos de usuario</h2>
        <table>
          
            
                      <form name="formulario" method="post" action="Estaciones" >
                <tr><td>Usuarios</td><td><select name="user">
                        <option value="adminlist">Juanito</option>
                        <option value="nombre1">Pedro</option>
                  
                                  </select></td></tr>
           
                <tr><td>Roles</td><td><select name="rol">
                        <option value="adminlist">Administrador</option>
                        <option value="lector">Lector</option>
                        <option value ="desarrollador">Desarrollador</option>
                        <option value ="comun">Comun</option>                                           
                                  </select></td></tr>
                
                <tr><td>Permisos</td><td><select name="permiso">
                        <option value="menu1">Home</option>
                        <option value="menu2">Servicios</option>
                        <option value="menu3">Productos</option>
                        <option value="menu4">Servicios</option> 
                                  </select></td></tr>
           <!-- <tr><td>Volcan</td><td><input type="text" name="volcan"/> -->
                      
                        
                                                
                                 </td></tr>
            <tr><td>
                    <input type ="submit" value="Guardar">
                
           <!-- <input type="button" value="No estas registrado? registrate" onClick="location.href = 'registro.jsp' "><br> -->
          
                </td></tr>
           </form>
        </table>
    </body>
</html>
