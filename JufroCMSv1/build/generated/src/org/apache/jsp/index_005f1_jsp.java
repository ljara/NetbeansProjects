package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jufroweb.JufroMenu;
import miaplicacionweb.MiConfiguracion;
import jufroweb.Content;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Ingreso Usuario</h2>        \n");
      out.write("        <form role=\"form\" class=\"col-md-3 col-md-offset-5\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"Nombre completo\">Usuario:</label>\n");
      out.write("                <input type=\"nombre\" class=\"form-control\" name=\"user\" placeholder=\"usuario\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"pwd\">Contraseña:</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\" name=\"Entrar\">Ingresar </button>\n");
      out.write("        </form>\n");
      out.write("        <p>¿No estas registrado?<a href=\"registro.jsp\"> Registrate</a></p>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");


    // JufroMenu mimenu = new JufroMenu();
    //  mimenu.addMenuItemFromHtml("Ini", "layout.html");
    //MiConfiguracion miweb = new MiConfiguracion();
    //JufroPage mipagina = new JufroPage(mic,request,session);
    //Content gestor = new Content();
    //String todos = gestor.allToHtml();
    //miweb.setContent(todos,request,session);
    // out.print(miweb.getWebPage());
    MiConfiguracion miweb = new MiConfiguracion();
    //JufroPage mipagina = new JufroPage(mic,request,session);

    miweb.setContent("HOLA MUNDO", request, session);
    out.print(miweb.getWebPage());
    

      out.write('\n');
      out.write('\n');
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
