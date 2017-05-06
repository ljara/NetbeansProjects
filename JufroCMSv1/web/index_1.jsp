
<%@page import="jufroweb.JufroMenu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="miaplicacionweb.MiConfiguracion"%>
<%@page import="jufroweb.Content"%>

<!DOCTYPE html>
<html>
     <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <!DOCTYPE html>
</head>
    <body>
        <h2>Ingreso Usuario</h2>        
        <form role="form" class="col-md-3 col-md-offset-5">
            <div class="form-group">
                <label for="Nombre completo">Usuario:</label>
                <input type="nombre" class="form-control" name="user" placeholder="usuario">
            </div>
            <div class="form-group">
                <label for="pwd">Contraseña:</label>
                <input type="password" class="form-control" name="password" placeholder="Contraseña">
            </div>
            <button type="submit" class="btn btn-default" name="Entrar">Ingresar </button>
        </form>
        <p>¿No estas registrado?<a href="registro.jsp"> Registrate</a></p>
        
    </body>
</html>

<%

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
    
%>

