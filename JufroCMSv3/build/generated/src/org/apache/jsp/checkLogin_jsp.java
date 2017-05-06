package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"application/xhtml+xml; charset=utf-8\" />\n");
      out.write("<style type=\"text/css\"></style>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/script.js\"></script>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("<div class=\"contenido\">\n");

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String redirectURLprueba = "paginaAdmin.jsp";
            String redirectURLliveall = "../####/####/pagina.html";
            String redirectURLlogin = "./loginES.jsp";
            
         

            // Here you put the check on the username and password
            if (username.toLowerCase().trim().equals("administrador") && password.toLowerCase().trim().equals("123123")) {
               //out.println("Welcome " + username + " <a href=\"index.jsp\">Back to main</a>");
               // session.setAttribute("username", username);
            	response.sendRedirect(redirectURLprueba);}
            if (username.toLowerCase().trim().equals("admin1") && password.toLowerCase().trim().equals("admin1")) {
                  response.sendRedirect(redirectURLliveall );                  
            }  
          else 
               {
        	  
      out.write("\n");
      out.write("        \t  <table class=\"box-table-d\" >\n");
      out.write("              <tr><td colspan=\"2\" >Error en la contraseña o usuario, vuelve atras por favor.</td></tr> \n");
      out.write("             </table>  \n");
      out.write("        \t ");

          }


      out.write(" \n");
      out.write("</div>\n");
      out.write("    </BODY>\n");
      out.write("</HTML>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
