<%-- 
    Document   : Graficar
    Created on : 31-10-2014, 10:51:57 PM
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
        <h1>Gráfico SVG</h1>
        
        <style>

            .chart rect {
                fill: steelblue;
            }

            .chart text {
                fill: white;
                font: 10px sans-serif;
                text-anchor: end;
            }
        </style>

        <%
            int dim = 35;
            int a, b, c, d, e;
            a = Integer.parseInt(request.getParameter("b1"));
            b = Integer.parseInt(request.getParameter("b2"));
            c = Integer.parseInt(request.getParameter("b3"));
            d = Integer.parseInt(request.getParameter("b4"));
            e = Integer.parseInt(request.getParameter("b5"));
        %>

        <svg class="chart" width="420" height="120">
        <g transform="translate(0,0)">
        <rect width="<%=a * 10%>" height="19"></rect>
        <text x="37" y="9.5" dy="."<%=dim%>"em"><%=a%></text>
        </g>

        <g transform="translate(0,20)">
        <rect width="<%=b * 10%>" height="19"></rect>
        <text x="37" y="9.5" dy="."<%=dim%>"em"><%=b%></text>
        </g>

        <g transform="translate(0,40)">
        <rect width="<%=c * 10%>" height="19"></rect>
        <text x="37" y="9.5" dy="."<%=dim%>"em"><%=c%></text>
        </g>

        <g transform="translate(0,60)">
        <rect width="<%=d * 10%>" height="19"></rect>
        <text x="37" y="9.5" dy="."<%=dim%>"em"><%=d%></text>
        </g>

        <g transform="translate(0,80)">
        <rect width="<%=e * 10%>" height="19"></rect>
        <text x="37" y="9.5" dy="."<%=dim%>"em"><%=e%></text>
        </g>
        </svg>
    </body>
</html>
