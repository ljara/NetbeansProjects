package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import miaplicacionweb.MiConfiguracion;
import jufroweb.Content;
import miaplicacionweb.MiConfiguracionAdmin;
import miaplicacionweb.Usuario;
import miaplicacionweb.MiConfiguracionAdmin;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    if (session.getAttribute("usuario") != null) {

      out.write("\n");
      out.write("<p>iniciada la se</p>\n");

} else {

      out.write("\n");
      out.write("<h2>Ingrese sus datos de usuario</h2>\n");
      out.write("<form action=\"checkLogin.jsp\"class=\"col-md-3 col-md-offset-5\"> \n");
      out.write("    <table class=\"box-table-d\" >\n");
      out.write("        <tr>\n");
      out.write("        <h1>Ingreso Validado por JSP</h1>\n");
      out.write("        <td>Nombre:</td> \n");
      out.write("        <td> <input name=\"username\" size=15 type=\"text\" /> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> Password: </td>\n");
      out.write("            <td> <input type=\"password\" name=\"password\" />  </td> \n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" value=\"login\" /></td>\n");
      out.write("            <td><a href=\"registro.jsp\"> No estas registrado? Registrarse</a></td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>            \n");
      out.write("</form>\n");

    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
