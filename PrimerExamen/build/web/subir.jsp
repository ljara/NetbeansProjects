

<%@page import="java.util.Iterator"%>
<%@page import="newpackage.Conexion"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.util.List" %>
<%@ page import="java.sql.*" %>
<%@page import="java.lang.*" %>

<%-- 
    Document   : a
    Created on : 17-12-2014, 11:57:57 PM
    Author     : Zisi
--%>


<%

    Conexion baseDatos = new Conexion();
    //Directorio donde se guardan lo archivos
    String filePath = "C:\\Users\\Luis\\Documents\\NetBeansProjects\\intento\\web\\files\\";
    String fieldName = "";
    String value = "";
    String mostrar[] = new String[2];
    String fileName = "";
    String nombre = "";
    String apellido = "";


    DiskFileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);

    //Captura los archivos desde el request
    List<FileItem> fileItems = upload.parseRequest(request);
    /**  Iterator<FileItem> iter = fileItems.iterator();
    
    out.println("Nombre y Apellido :  ");
    out.println(" ");
    while (iter.hasNext()) {
    FileItem item = iter.next();
    
    if (item.isFormField()) {
    value = item.getString();
    //out.print("Nombre:  "+name);
    out.print("   "+value);
    
    }
    
    }
    
     **/
    out.println(" ");


    for (FileItem item : fileItems) {

        if (!item.isFormField()) {
            File file = new File(filePath + item.getName());
            //item.write(file);
            if (!file.exists()) {
                        item.write(null);
                        boolean status = file.mkdirs();
            }
            fieldName = item.getFieldName();
            fileName = item.getName();
            //ingreso validacion

            out.println(" Ruta del Archivo " + filePath + " " + fileName + "<br>");
            String camposValores = " '%s','%s','%s' ";
            camposValores = String.format(camposValores, nombre, apellido, fileName);
            String campos = "nombre,apellido,archivo";
            boolean ingresar = baseDatos.insercion("personas", campos, camposValores);

            out.println("<br>" + ingresar);



        }
        if (item.isFormField()) {
            if (item.getFieldName().equals("submitname")) {
                //nombre = item.getFieldName();
                nombre = item.getString();
                out.println("Nombre:  " + nombre);
                //out.print("   "+value);                                                                                                         
            }
            if (item.getFieldName().equals("submitlastname")) {
                apellido = item.getString();
                out.println("Apellido:  " + apellido + "<br>");
            }
        }
    }

    //nombre archivo
    //out.print(" "+fileName);
    //nombre del formulario
    //out.println(" "+ nombre);
    //apellido del formulario
    //out.println(" "+apellido);

    //Base de Datos


    // out.println("Nombre y Apellido :  ");
    //for(FileItem item : fileItems) {
    //  if (item.isFormField()){
    //String name = item.getFieldName();
    //    String value = item.getString();

    //out.print("Nombre:  "+name);
    //  out.print("   "+value);
    // }
    // }

    String a = baseDatos.ultimomensaje();
    out.println("<br>" + "\n" + a);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             
</body>
</html>