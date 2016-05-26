<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Informacion del pedido</h2>
<form:form method="POST" action="/Prueba/addOrder">
   <table>
    <tr>
        <td><form:label path="nombre">Productos: </form:label></td>
        <td>
	        <form:select name="products" path="nombre" >
		        <c:forEach var="product" items="${productsList}">
		    		<option value="${product.id}" >${product.nombre}</option>
		    	</c:forEach>
  		</form:select>
  		</td>
    </tr>
    <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>