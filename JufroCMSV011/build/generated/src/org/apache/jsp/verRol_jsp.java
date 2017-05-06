package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import miaplicacionweb.Permiso;
import miaplicacionweb.MiConfiguracion;
import miaplicacionweb.Rol;
import miaplicacionweb.Usuario;

public final class verRol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<h2>Edición roles</h2>\n");
      out.write("<label>Rol: </label>\n");

    String id= request.getParameter("id");
    //out.println(id);
    
    Rol a = new Rol();
    out.println(a.toHtml(Integer.parseInt(id)));
    
    Permiso b = new Permiso();
    out.println(b.mostrarPermisos());
   
   
    
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>verRol</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"crearPermiso.jsp\" method=\"POST\">\n");
      out.write("            <h2>Crear permiso</h2>\n");
      out.write("            <input type=\"text\" name=\"rolid\" value=\"");
      out.print( id);
      out.write("\"   hidden/>\n");
      out.write("            <label>\n");
      out.write("                Descripcion\n");
      out.write("                <input type=\"text\" name=\"descripcion\"  />\n");
      out.write("            </label>\n");
      out.write("            <input type=\"submit\" value=\"Guardar\" />\n");
      out.write("            \n");
      out.write("            <input type=\"button\" value=\"Volver\" onClick=\"location.href = 'verUsuario.jsp?id='+");
      out.print( id);
      out.write("+ \"><br>\n");
      out.write("            <input type=\"button\" value=\"Volvera a menu \" onClick=\"location.href = 'gestionUsuario.jsp' \"><br>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
                   MiConfiguracion miweb = new MiConfiguracion();
              miweb.setContent("Gestion de roles y permisos",request,session);
        out.print(miweb.getWebPage());
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
