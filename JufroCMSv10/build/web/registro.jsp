<%-- 
    Document   : registro
    Created on : 05-08-2015, 16:14:08
    Author     : Zimri
--%>

<%@page import="jufroweb.Layout"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>


        <h2>Registro de Usuario</h2>
        <form action="ingresoRegristoBD.jsp" method="POST">
            <table border="1" align="center">

                <tbody>
                    <tr>
                        <td>Nombre</td>
                        <td> <input type="text" name="user" /></td>
                    </tr>
                    <tr>
                        <td>Mail</td>
                        <td><input type="text" name="email"  /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass"  /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Enviar" /></td>
                        
                    </tr>
                </tbody>
            </table>

        </form>
        <%
        MiConfiguracion miweb= new MiConfiguracion();
        
        %>

            

