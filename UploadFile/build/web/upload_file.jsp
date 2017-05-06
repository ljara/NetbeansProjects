<%-- 
    Document   : upload_file
    Created on : 11-12-2014, 04:51:50 PM
    Author     : Luis
--%>

<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@page import="java.util.List" %>


<%
        String saveDir = "files\\";
	DiskFileItemFactory factory = new DiskFileItemFactory();
	ServletFileUpload upload = new ServletFileUpload(factory);
         //obtiene la ruta real del servidor
        String appPath = request.getServletContext().getRealPath("");
        // Construye la ruta del directorio para guardar el archivo subido
        String savePath = appPath + File.separator + saveDir;
         // Crea el directorio sino existe
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        
        MultipartRequest mpr=new MultipartRequest(request,savePath);
        mpr.getFile("uploadFile");
        String nom  = mpr.getParameter("nombre");
        out.print(nom);
        
        
        
       
	
       
        //Captura los archivos desde el request
	List<FileItem> fileItems = upload.parseRequest(request);
       
	for(FileItem item : fileItems) {
		if(!item.isFormField()) {
			File file = new File(savePath + item.getName());
			item.write(file);
		}
	}
 %>
