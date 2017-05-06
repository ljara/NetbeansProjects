<html>
<head>
<title>Login</title>
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=utf-8" />
<style type="text/css"></style>
<link rel="stylesheet" href="../css/style.css" type="text/css"/>
<script type="text/javascript" src="../js/script.js"></script>
</head>
<body onload="cambiarTitulo()">
<div class="contenido">



       
        <%
        String myname =  (String)session.getAttribute("username");
       
        if(myname!=null)
            {
             out.println("Welcome  "+myname+"  , <a href=\"logout.jsp\" >Logout</a>");
             
            }
        
              else 
            {
            %>
            <form action="checkLogin.jsp"> 
               <table class="box-table-d" >
               <tr><td colspan="2" ><img alt="Se necesita contraseña" src="../img/locked.gif"/>Login</td></tr> 
                    <tr>
                        <td> Username  : </td><td> <input name="username" size=15 type="text" /> </td> 
                        
                    </tr>
                    <tr>
                        <td> Password  : </td><td> <input name="password" size=15 type="text" /> </td> 
                    </tr>
                    <tr><td colspan="2"><input type="submit" value="login" /></td></tr>
                </table>
                
            </form>
            
            <br/><br/><div class="anuncio_pass"><i> Si no tiene contraseña la puede solicitar, enviando un email a Soporte GSIS usando el botón "Contacta" o enviando un correo a la siguiente dirreción <a href="mailto:support@gsisservices.com">support@gsisservices.com</a></i></div>
            <% 
            }        
            
            %>     
</div>   
</body>
</html>