package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("        <!-- Stylesheet -->\n");
      out.write("        <style>\n");
      out.write("            label, input{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Coordenadas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Coordenadas</h1>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Poligono.jsp\">\n");
      out.write("            <label>Coordenada 1:</label><input type = \"text\" name = \"c1\">\n");
      out.write("            <label>Coordenada 2:</label><input type = \"text\" name = \"c2\">\n");
      out.write("            <label>Coordenada 3:</label><input type = \"text\" name = \"c3\">\n");
      out.write("            <label>Coordenada 4:</label><input type = \"text\" name = \"c4\">\n");
      out.write("            <label>Coordenada 5:</label><input type = \"text\" name = \"c5\">\n");
      out.write("            <label>Coordenada 6:</label><input type = \"text\" name = \"c6\">\n");
      out.write("            <label>Coordenada 7:</label><input type = \"text\" name = \"c7\">\n");
      out.write("            <label>Coordenada 8:</label><input type = \"text\" name = \"c8\">\n");
      out.write("            <label>Coordenada 9:</label><input type = \"text\" name = \"c9\">\n");
      out.write("            <input type=\"submit\" value=\"Enviar Consulta\">\n");
      out.write("            \n");
      out.write("        </form>\n");
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
