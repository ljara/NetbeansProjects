package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Zona Personal </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

      String user = (String)session.getAttribute("vUsuario");
     
      if(user!=null){
        
      out.write("\n");
      out.write("<table width=\"518\" border=\"1\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"105\">Usuario: ");
 out.print(user);   
      out.write("</td><--------------Este es recogido de la pagina del login.jsp pero no de la base de datos que es lo que quiero realizar.\n");
      out.write("    <td width=\"124\">Imagen </td>---->?\n");
      out.write("    <td width=\"131\">fecha  NaCImiento</td>------>?\n");
      out.write("    <td width=\"130\"><a href=\"cerrar_session.jsp\">off Session</a></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<p>\n");
      out.write("Aqui ira el contenido restringuido.\n");
      out.write("</p>\n");
      out.write("<p>&nbsp;</p>\n");

}
  else{
         

      out.write("\n");
      out.write("        <center>\n");
      out.write("<table width=\"326\" border=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"54\"><div align=\"center\">Usuario No Registrado</div>      <div align=\"center\"></div></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td><div align=\"center\"><img src=\"no_valido.png\"  width=\"128\" height=\"128\" /></div><div align=\"center\"></div></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("    </body>\n");
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
