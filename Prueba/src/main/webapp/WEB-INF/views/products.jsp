<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products List</title>
    </head>
    <body>
        <div align="center">
            <h1>Lista de Productos</h1>
            <table border="1">
                <tr><td>Id</td>
                <td>Nombre</td></tr>
                <c:forEach var="product" items="${productsList}">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.nombre}</td>           
                </tr>
                </c:forEach>             
            </table>
            <button type="button" onclick="location.href='/Prueba/home'">Volver</button>
        </div>
    </body>
</html>