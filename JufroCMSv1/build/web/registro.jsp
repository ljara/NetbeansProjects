<%@page contentType="text/html" pageEncoding="UTF-8"%>

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

    <div class="container">
        <h2>Registrarse</h2>
        <form role="form">
            <div class="form-group">
                <label for="Nombre completo">Nombre completo:</label>
                <input type="nombre" class="form-control" name="nombreUserNormal" placeholder="Nombre completo">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" placeholder="Email">
            </div>
            <div class="form-group">
                <label for="pwd">Contraseña:</label>
                <input type="password" class="form-control" name="password" placeholder="Contraseña">
            </div>
            <div class="checkbox">
                <label><input type="checkbox">Mantener Conectado</label>
            </div>
            <button type="submit" class="btn btn-default" name="Entrar">Ingresar</button>
        </form>
    </div>
    <p>${sessionScope['error']}</p>

</body>
</html>
