<%-- 
    Document   : index
    Created on : 24-04-2015, 09:04:17 AM
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
       <%-- start web service invocation --%><hr/>
    <%
    try {
	Services.webservices.ProductoWS_Service service = new services.webservices.ProductoWS_Service();
	Services.webservices.ProductoWS port = service.getProductoWSPort();
	 // TODO initialize WS operation arguments here
	int codigo = 0;
	java.lang.String nombre = "";
	int precio = 0;
	int stock = 0;
	java.lang.String descripcion = "";
	// TODO process result here
	java.lang.String result = port.ingresarProducto(codigo, nombre, precio, stock, descripcion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	services.webservices.ProductoWS_Service service = new services.webservices.ProductoWS_Service();
	services.webservices.ProductoWS port = service.getProductoWSPort();
	// TODO process result here
	java.util.List<services.webservices.Producto> result = port.consultarProductos();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	services.webservices.ProductoWS_Service service = new services.webservices.ProductoWS_Service();
	services.webservices.ProductoWS port = service.getProductoWSPort();
	 // TODO initialize WS operation arguments here
	int codigo = 0;
	java.lang.String nombre = "";
	int precio = 0;
	int stock = 0;
	java.lang.String descripcion = "";
	// TODO process result here
	java.lang.String result = port.ingresarProducto(codigo, nombre, precio, stock, descripcion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    </body>
</html>
