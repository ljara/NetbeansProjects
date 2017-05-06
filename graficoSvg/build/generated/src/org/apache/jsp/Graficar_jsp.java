package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Graficar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .chart rect {\n");
      out.write("                fill: steelblue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chart text {\n");
      out.write("                fill: white;\n");
      out.write("                font: 10px sans-serif;\n");
      out.write("                text-anchor: end;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        ");

            int dim = 35;
        
      out.write("\n");
      out.write("        \n");
      out.write("        <svg class=\"chart\" width=\"420\" height=\"120\">\n");
      out.write("            <g transform=\"translate(0,0)\">\n");
      out.write("            <rect width=\"40\" height=\"19\"></rect>\n");
      out.write("            <text x=\"37\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">4</text>\n");
      out.write("            </g>\n");
      out.write("            \n");
      out.write("            <g transform=\"translate(0,20)\">\n");
      out.write("            <rect width=\"80\" height=\"19\"></rect>\n");
      out.write("            <text x=\"77\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">8</text>\n");
      out.write("            </g>\n");
      out.write("            \n");
      out.write("            <g transform=\"translate(0,40)\">\n");
      out.write("            <rect width=\"150\" height=\"19\"></rect>\n");
      out.write("            <text x=\"147\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">15</text>\n");
      out.write("            </g>\n");
      out.write("            \n");
      out.write("            <g transform=\"translate(0,60)\">\n");
      out.write("            <rect width=\"160\" height=\"19\"></rect>\n");
      out.write("            <text x=\"157\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">16</text>\n");
      out.write("            </g>\n");
      out.write("            \n");
      out.write("            <g transform=\"translate(0,80)\">\n");
      out.write("            <rect width=\"230\" height=\"19\"></rect>\n");
      out.write("            <text x=\"227\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">23</text>\n");
      out.write("            </g>\n");
      out.write("            \n");
      out.write("            <g transform=\"translate(0,100)\">\n");
      out.write("            <rect width=\"420\" height=\"19\"></rect>\n");
      out.write("            <text x=\"417\" y=\"9.5\" dy=\".\"");
      out.print(dim);
      out.write("\"em\">42</text>\n");
      out.write("            </g>\n");
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
