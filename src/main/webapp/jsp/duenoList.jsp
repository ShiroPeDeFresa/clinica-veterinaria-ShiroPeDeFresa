<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Duenos</title>
</head>
<body>

<table>
	<tr>
		<th>Nombre</th>
		<th>DNI</th>
		<th>Mascota</th>
		<th>Mascota a cambiar</th>
	</tr>
	<c:forEach var="i" items="${duenoList}">
		<tr>
		<form:form action="editarDuenos" method="post" modelAttribute="dueno">
			<td><form:input readonly="true" path="nombre" type="text" name="nombre" value="${i.nombre}"/></td>
			<td><form:input  path="dni" type="text" name="dni" value="${i.dni}"/></td>
			<td><c:out value="${i.mascota.getNombre()}"></c:out></td>
			<td><form:select path="mascotasDescompuesto"> 
					<form:options items="${allMascotas}" itemLabel="nombre"/> 
				</form:select>
			</td>
			<td><input type="submit"></td>
			<td><a href="/eliminarMascotas">Eliminar</a></td>
		</form:form>
		</tr>
	</c:forEach>
</table>
</body>
</html>