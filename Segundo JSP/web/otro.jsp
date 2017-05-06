<%-- 
    Document   : otro
    Created on : 01-06-2015, 04:06:04 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Valores Recuperados</h1>
        <%
        String recu1 = request.getParameter("fondo");
        String recu2 = request.getParameter("letra");
        String browser = request.getHeader("USER-AGENT");
        String ip = request.getRemoteAddr();
        %>
        <h2>Valor fondo <%=recu1%></h2>
        <h2>Valor letra <%=recu2%></h2>
        <h2>Navegador <%=browser%></h2>
        <h2>IP <%=ip%></h2>
    </body>
</html>
