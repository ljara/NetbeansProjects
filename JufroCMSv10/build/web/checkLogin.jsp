<%-- 
    Document   : checkLogin
    Created on : 11-08-2015, 4:08:56
    Author     : Zimri
--%>


<%@page import="miaplicacionweb.Usuario"%>

            <%
                String email = request.getParameter("username");
                String password = request.getParameter("password");
                String redirectURLprueba = "index.jsp";
                String redirectURLliveall = "index.jsp";
                String redirectURLlogin = "./loginES.jsp";

                Usuario a = new Usuario();
                if (a.login(email, password)) {
                    HttpSession as = request.getSession();
                    session.setAttribute("usuario", email);
                    as.getId();
                    response.sendRedirect(redirectURLprueba);
                    System.out.println(" as : " + as);

                } else {
            %>
            <table class="box-table-d" >
                <tr><td colspan="2" >Error en la contraseña o usuario, vuelve atras por favor.</td></tr> 
            </table><%
                }

            %>
