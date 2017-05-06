package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import newpackage.Conexion;
import java.io.File;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import java.util.List;
import java.sql.*;
import java.lang.*;

public final class subir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    Conexion baseDatos = new Conexion();
    //Directorio donde se guardan lo archivos
    String filePath = "C:\\Users\\Luis\\Documents\\NetBeansProjects\\intento\\web\\files\\";
    String fieldName = "";
    String value = "";
    String mostrar[] = new String[2];
    String fileName = "";
    String nombre = "";
    String apellido = "";


    DiskFileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);

    //Captura los archivos desde el request
    List<FileItem> fileItems = upload.parseRequest(request);
    /**  Iterator<FileItem> iter = fileItems.iterator();
    
    out.println("Nombre y Apellido :  ");
    out.println(" ");
    while (iter.hasNext()) {
    FileItem item = iter.next();
    
    if (item.isFormField()) {
    value = item.getString();
    //out.print("Nombre:  "+name);
    out.print("   "+value);
    
    }
    
    }
    
     **/
    out.println(" ");


    for (FileItem item : fileItems) {

        if (!item.isFormField()) {
            File file = new File(filePath + item.getName());
            //item.write(file);
            if (!file.exists()) {
                        item.write(null);
                        boolean status = file.mkdirs();
            }
            fieldName = item.getFieldName();
            fileName = item.getName();
            //ingreso validacion

            out.println(" Ruta del Archivo " + filePath + " " + fileName + "<br>");
            String camposValores = " '%s','%s','%s' ";
            camposValores = String.format(camposValores, nombre, apellido, fileName);
            String campos = "nombre,apellido,archivo";
            boolean ingresar = baseDatos.insercion("personas", campos, camposValores);

            out.println("<br>" + ingresar);



        }
        if (item.isFormField()) {
            if (item.getFieldName().equals("submitname")) {
                //nombre = item.getFieldName();
                nombre = item.getString();
                out.println("Nombre:  " + nombre);
                //out.print("   "+value);                                                                                                         
            }
            if (item.getFieldName().equals("submitlastname")) {
                apellido = item.getString();
                out.println("Apellido:  " + apellido + "<br>");
            }
        }
    }

    //nombre archivo
    //out.print(" "+fileName);
    //nombre del formulario
    //out.println(" "+ nombre);
    //apellido del formulario
    //out.println(" "+apellido);

    //Base de Datos


    // out.println("Nombre y Apellido :  ");
    //for(FileItem item : fileItems) {
    //  if (item.isFormField()){
    //String name = item.getFieldName();
    //    String value = item.getString();

    //out.print("Nombre:  "+name);
    //  out.print("   "+value);
    // }
    // }

    String a = baseDatos.ultimomensaje();
    out.println("<br>" + "\n" + a);


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             \n");
      out.write("</body>\n");
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
