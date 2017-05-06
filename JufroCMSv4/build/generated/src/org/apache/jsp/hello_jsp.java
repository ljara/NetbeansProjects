package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import miaplicacionweb.Usuario;
import jufroweb.Content;
import miaplicacionweb.MiConfiguracion;
import jufroweb.JufroCMSConnection;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Bienvendo, inicia sesion</h1>\n");
      out.write("        ");

            /*
        <jsp:useBean id="myBean" scope="page" class="miaplicacionweb.Usuario" />
        <jsp:setProperty name="myBean" property="user"  />
        <jsp:setProperty name="myBean" property="pass"  />
        <jsp:setProperty name="myBean" property="email" />
        */
      out.write("\n");
      out.write("        <table border=\"1\" align =\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Tus datos han sido ingresados </td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>nombre recibido: </td>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   ");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

        //JufroCMSConnection mic= new JufroCMSConnection();
        Usuario mic= new Usuario();
        String user= request.getParameter("user");
        String email = request.getParameter("email");
        String pass= request.getParameter("pass");
        
        out.println(user);
        boolean ingresar= mic.insert(user,pass,email);
        
            if (ingresar){
                out.print(" fue agregado correctamente <br>");
                //out.print(" <a href='volcan.jsp'> Agegar otro volcan </a> ");
            }else {
                out.print("no se agrega");
             //   out.print(" <a href='volcan.jsp'> Volver </a> ");
            }
     /*
        boolean a=myBean.insert();
        
        if(a==true){
            out.print("no sé creo q si");
        }else{
            out.print("creo q no");
        }
    */

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
