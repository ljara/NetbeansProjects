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
      out.write("\n");
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
      out.write("          <form action=\"checkLogin.jsp\"> \n");
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
      out.write("                <p><a href=\"registro.jsp\">No estas registrado? Registrarse</a></p>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");

        
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
         
        miweb.setContent("HOLA MUNDO",request,session);
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
