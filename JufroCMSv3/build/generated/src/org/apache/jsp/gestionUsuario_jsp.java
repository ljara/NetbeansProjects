package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gestionUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               <h2>Ingrese sus datos de usuario</h2>\n");
      out.write("        <table>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("                      <form name=\"formulario\" method=\"post\" action=\"Estaciones\" >\n");
      out.write("                <tr><td>Usuarios</td><td><select name=\"user\">\n");
      out.write("                        <option value=\"user\">Juanito</option>\n");
      out.write("                        <option value=\"user1\">Pedro</option>                                            \n");
      out.write("                                  </select></td></tr>\n");
      out.write("           \n");
      out.write("                <tr><td>Roles</td><td><select name=\"rol\">\n");
      out.write("                        <option value=\"rol\">Juanito</option>\n");
      out.write("                        <option value=\"rol1\">Pedro</option>                                            \n");
      out.write("                                  </select></td></tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Permisos</td><td><select name=\"permiso\">\n");
      out.write("                        <option value=\"per\">aaaaaaa</option>\n");
      out.write("                        <option value=\"per1\">xxxxx</option>                                            \n");
      out.write("                                  </select></td></tr>\n");
      out.write("           <!-- <tr><td>Volcan</td><td><input type=\"text\" name=\"volcan\"/> -->\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                                                \n");
      out.write("                                 </td></tr>\n");
      out.write("            <tr><td>\n");
      out.write("                    <input type =\"submit\" value=\"Guardar\">\n");
      out.write("                \n");
      out.write("           <!-- <input type=\"button\" value=\"No estas registrado? registrate\" onClick=\"location.href = 'registro.jsp' \"><br> -->\n");
      out.write("          \n");
      out.write("                </td></tr>\n");
      out.write("           </form>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
