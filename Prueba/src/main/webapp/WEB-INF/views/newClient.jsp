<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Crear Cliente</title>
</head>
<body>
	<div align="center">
        <form:form action="/Prueba/clientCreated" method="post" commandName="clientForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Crear Perfil</h2></td>
                </tr>
                <tr>
                    <td><form:label path="nombre">Nombre</form:label></td>
                    <td><form:input path="nombre" /></td>
                </tr>
                <tr>
                    <td><form:label path="email">E-Mail</form:label></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Añadir" /></td>
                </tr>
            </table>
            <button type="button" onclick="location.href='/Prueba/home'">Volver</button>
        </form:form>
    </div>

</body>
</html>