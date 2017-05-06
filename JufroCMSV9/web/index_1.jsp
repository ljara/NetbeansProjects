




        <%@page import="miaplicacionweb.MiConfiguracion"%>
<h2>Ingrese sus datos de usuario</h2>
        <form action="checkLogin.jsp"class="col-md-3 col-md-offset-5"> 
            <table class="box-table-d" >
                <tr>
                <h1>Ingreso Validado por JSP</h1>
                <td>Nombre:</td> 
                <td> <input name="username" size=15 type="text" /> </td>
                </tr>
                <tr>
                    <td> Password: </td>
                    <td> <input type="password" name="password" />  </td> 
                </tr>
                <tr>
                    <td><input type="submit" value="login" /></td>
                    <td><a href="registro.jsp"> No estas registrado? Registrarse</a></td>
                </tr>

            </table>            
        </form>

        <form action="validarUsuario"class="col-md-3 col-md-offset-5"> 
            <table class="box-table-d" >
                <tr>
                <h1>Ingreso Validado por BD</h1>
                <td>Username:</td> 
                <td> <input name="username" size=15 type="text" /> </td>
                </tr>
                <tr>
                    <td> Password: </td>
                    <td> <input type="password" name="password" />  </td> 
                </tr>
                <tr>
                    <td><input  type="submit" value="login" /></td>
                    <td><a href="registro.jsp"> No estas registrado? Registrarse</a></td>
                </tr>


            </table>            
        </form>


