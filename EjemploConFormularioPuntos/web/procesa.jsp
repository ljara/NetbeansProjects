<%@page import="geometria.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.awt.Point"%>
<%@page import="geometria.Triangulo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%                
                Point p, q, r;
                int a, b;
                a = Integer.parseInt(request.getParameter("p1x"));
                b = Integer.parseInt(request.getParameter("p1y"));
                p = new Point(a, b);
                
                a = Integer.parseInt(request.getParameter("p2x"));
                b = Integer.parseInt(request.getParameter("p2y"));
                q = new Point(a, b);
                
                a = Integer.parseInt(request.getParameter("p3x"));
                b = Integer.parseInt(request.getParameter("p3y"));
                r = new Point(a, b);
                
                Triangulo t = new Triangulo(p, q, r); 
                if (! t.esTriangulo() ) {
                    out.println(" <b>No</b> forman un triangulo");
                } else {
                    out.println("Forman un triangulo");
                }
            
        %>

       
    </body>
</html>
