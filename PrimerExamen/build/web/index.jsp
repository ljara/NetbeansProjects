<%-- 
    Document   : index
    Created on : 09-12-2014, 05:54:16 PM
    Author     : Zisi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <style>

            input, label {
                display: block;
            }
        </style>
        <meta charset="utf8" >
    </head>
    <body>


        <h2>File Upload</h2>
        <form  action="subir.jsp" enctype="multipart/form-data" method="post">
                <label>Nombre </label><input type = "text" name = "submitname"> <br>   
                <label>apellido </label><input type = "text" name = "submitlastname"> <br> 
                <label for="uploadFile">Selecciona archivos</label> 
                <input type="file" name="CargarArchivo1" > 
               	<input type="file" name="CargarArchivo2" > 
                <input type="file" name="CargarArchivo3" > 

                <input type="submit" value="Subir" ><br>
        </form>
    </body>
</html>
