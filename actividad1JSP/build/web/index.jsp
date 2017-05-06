<%-- 
    Document   : index
    Created on : 14-05-2015, 12:21:33 PM
    Author     : Luis
--%>

<%@page import="sun.nio.ch.SocketOpts.IP"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<Html> 
    <head> 
        <title> Hello World </title> 
    </head> 
    <body> 
        Hello World! <br/> 
        <% out.println("Su dirección IP es" + request.getRemoteAddr());
        %>

        <form action="Procesamiento" method="post" >
            <input type="text" name="nombre"/>
            <input type="number" name="edad"/>
            <input type="submit" />
        </form>
    </Body> 
