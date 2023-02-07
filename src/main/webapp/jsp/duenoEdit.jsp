<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Mascotas</title>
</head>
<body>
<h1>Mascota Modificada:</h1>
<table>
	<tr>
		<th>Nombre</th>
		<th>Dni</th>
		<th>Mascota</th>
	</tr>
	<tr>
		<td><c:out value="${dueno.nombre}"/></td>
		<td><c:out value="${dueno.dni}"/></td>
		<td><c:out value="${dueno.mascota}"/></td>
	<tr>
</table>
<a href="/">back to Index</a>

	
</body>
</html>