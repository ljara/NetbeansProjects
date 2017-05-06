<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Ingreso datos</h1>
        
        <form action="verifica.jsp" method="post">            
            Nombre<input type="text" name="nombre"/></br>  
            Apellido<input type="text" name="apellido"/><br/>
            <input name="certificado1" type="file" method="POST" enctype="multipart/form-data"><br/>
            <input name="certificado2" type="file"><br/>
            <input name="certificado3" type="file"><br/>
           
            <br><input type="submit" value="Ingresar"/>
        </form>
    
    </body>
</html>
