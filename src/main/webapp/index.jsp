<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ScanDoc Pro - Login</title>
</head>
<body style="font-family: Arial, sans-serif; text-align: center; background-color: #f0f0f0; padding-top: 50px;">
    <h1>Bienvenido a ScanDoc Pro</h1>
    <div style="background: white; display: inline-block; padding: 20px; border-radius: 10px; shadow: 0px 0px 10px #ccc;">
        <form action="login" method="POST">
            <input type="text" name="user" placeholder="Usuario" required
                   style="padding: 10px; margin-bottom: 10px; width: 200px;"><br>
            <input type="password" name="pass" placeholder="Contraseña" required
                   style="padding: 10px; margin-bottom: 10px; width: 200px;"><br>
            <button type="submit" style="padding: 10px 20px; cursor: pointer; background: #28a745; color: white; border: none; border-radius: 5px;">
                Entrar
            </button>
        </form>
    </div>
</body>
</html>