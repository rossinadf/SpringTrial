<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Inicio</title>
</head>
<body>
<h1>
	¡Bienvenido a nuestra tienda!  
</h1>

<P>  Por favor, selecciona la opcion que deseas: </P>

<button type="button" onclick="location.href='/Prueba/products'">Ver Catalogo Productos</button>
<button type="button" onclick="location.href='/Prueba/newOrder'">Nuevo Pedido</button>
<input type="submit" value="Ver Pedidos"/>
<input type="submit" value="Registrarse"/>
</body>
</html>
