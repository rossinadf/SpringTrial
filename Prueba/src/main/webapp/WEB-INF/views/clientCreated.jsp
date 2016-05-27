<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Crear Cliente</title>
</head>
<body>
<h2>Cliente creado!</h2>
   <table>
    <tr>
        <td>Id</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Nombre</td>
        <td>${nombre}</td>
    </tr>
    <tr>
        <td>E-Mail</td>
        <td>${email}</td>
    </tr>
</table>
<button type="button" onclick="location.href='/Prueba/home'">Volver</button>
</body>
</html>