package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"application/xhtml+xml; charset=utf-8\" />\n");
      out.write("<style type=\"text/css\"></style>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/script.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"cambiarTitulo()\">\n");
      out.write("<div class=\"contenido\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        ");

        String myname =  (String)session.getAttribute("username");
       
        if(myname!=null)
            {
             out.println("Welcome  "+myname+"  , <a href=\"logout.jsp\" >Logout</a>");
             
            }
        
              else 
            {
            
      out.write("\n");
      out.write("            <form action=\"checkLogin.jsp\"> \n");
      out.write("               <table class=\"box-table-d\" >\n");
      out.write("               <tr><td colspan=\"2\" ><img alt=\"Se necesita contraseña\" src=\"../img/locked.gif\"/>Login</td></tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td> Username  : </td><td> <input name=\"username\" size=15 type=\"text\" /> </td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Password  : </td><td> <input name=\"password\" size=15 type=\"text\" /> </td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\"><input type=\"submit\" value=\"login\" /></td></tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <br/><br/><div class=\"anuncio_pass\"><i> Si no tiene contraseña la puede solicitar, enviando un email a Soporte GSIS usando el botón \"Contacta\" o enviando un correo a la siguiente dirreción <a href=\"mailto:support@gsisservices.com\">support@gsisservices.com</a></i></div>\n");
      out.write("            ");
 
            }        
            
            
      out.write("     \n");
      out.write("</div>   \n");
      out.write("</body>\n");
      out.write("</html>");
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
