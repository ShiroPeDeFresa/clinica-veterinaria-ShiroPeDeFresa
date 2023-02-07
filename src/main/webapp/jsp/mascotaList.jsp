<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Mascotas</title>
</head>
<body>

<table>
	<tr>
		<th>Chip</th>
		<th>Nombre</th>
		<th>Vacunado</th>
	</tr>
	<c:forEach var="i" items="${mascotaList}">
		<tr>
		<form:form action="editarMascotas" method="post" modelAttribute="mascota">
			<td><form:input readonly="true" path="numChip" type="text" name="numChip" value="${i.numChip}"/></td>
			<td><form:input path="nombre" type="text" name="nombre" value="${i.nombre}"/></td>
			<td><form:input path="vacunado" value="${i.vacunado}"/></td>
			<td><input type="submit"></td>
			<td><a href="/eliminarMascotas">Eliminar</a></td>
		</form:form>
		</tr>
	</c:forEach>
</table>

	
</body>
</html>