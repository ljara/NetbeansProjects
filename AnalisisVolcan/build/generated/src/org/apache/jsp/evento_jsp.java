package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class evento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<form action=\"ingresarEvento.jsp\" method=\"POST\">\n");
      out.write("Clasificacion Volcan\n");
      out.write("<TABLE BORDER=0>\n");
      out.write("<TR>\n");
      out.write("\t<TD>Tipo de Evento</TD>\n");
      out.write("\t<TD>\n");
      out.write("\t<INPUT type=text name=\"nombreEvento\">\n");
      out.write("\t</TD>\n");
      out.write("</TR>\n");
      out.write("\n");
      out.write("<TR>\n");
      out.write("\t<TD>Fecha</TD>\n");
      out.write("\t<TD>\n");
      out.write("\t<INPUT type=text name=\"fecha\">\n");
      out.write("\t</TD>\n");
      out.write("        \n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("\t<TD>Volcan</TD>\n");
      out.write("\t<TD>\n");
      out.write("\t<INPUT type=text name=\"vnomv\">\n");
      out.write("\t</TD>\n");
      out.write("        \n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("\t<TD>Sigla estacion</TD>\n");
      out.write("\t<TD>\n");
      out.write("\t<INPUT type=text name=\"estacion\">\n");
      out.write("\t</TD>\n");
      out.write("        \n");
      out.write("</TR>\n");
      out.write("</TABLE>\n");
      out.write("<input type=\"submit\" value=\"enviar Datos\" action=\"evento.jsp\" />\n");
      out.write("<input type=\"button\" value=\"Volver a Menu\" onClick=\"location.href = 'menu.jsp' \"><br>\n");
      out.write("</FORM>   \n");
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
