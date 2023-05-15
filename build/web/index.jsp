<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>formulario</title>
    </head>
    <body>
        <h1>Datos de la persona.</h1>
        <form action="SvPersona" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Posicion: </label> <input type="text" name="posicion"></p>
            <p><label>Ubicacion </label> <input type="text" name="ubicacion"></p>
            <p><label>Foto: </label> <input type="text" name="imagenUrl"></p>
            <button type="submit"> Enviar</button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <p>Ingrese el DNI de la persona a eliminar</p>
        <form action=" " method=" ">
            <p><label>DNI:</label><input type="text" name=""> </p>
            <button type="submit">Eliminar</button>
        </form>
    </body>
</html>
