<%-- 
    Document   : index
    Created on : 11-12-2014, 04:50:41 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <style>
            input, label {
                display: block;
            }
        </style>
        <meta charset="utf8" >
    </head>
    <body>

        <h2>File Upload</h2>
        <form method="post" action="upload_file.jsp" enctype="multipart/form-data">
            <label for="uploadFile">Select file to upload: </label> 
            <input	type="file" name="uploadFile"  />
            <label for="uploadFile">Nombre:  </label>  
            <input	type="text" name="nombre"/> 
            <input type="submit" value="Upload" />
        </form>
    </body>
</html>

