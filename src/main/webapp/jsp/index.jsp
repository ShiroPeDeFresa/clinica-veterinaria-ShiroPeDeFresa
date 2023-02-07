<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Dueños</title>
</head>
<body>
<h1>Introduce los datos del dueño</h1>
	<form:form action="addDuenoForm" method="post" modelAttribute="dueno">
		<span>Nombre:</span>
		<form:input path="nombre" type="text" name="nombre"/>
		<span>DNI:</span>
		<form:input path="dni" type="text" name="dni"/>
		<span>Mascota:</span>
		<form:select path="mascotasDescompuesto"> 
			<form:options items="${allMascotas}" itemLabel="nombre"/> 
		</form:select>	
		<input type="submit"/>
	</form:form>

<h1>Introduce los datos de la Mascota</h1>
	<form:form action="addMascotaForm" method="post" modelAttribute="mascota">
		<span>Chip:</span>
		<form:input path="numChip" type="number" name="numChip"/>
		<span>Nombre</span>
		<form:input path="nombre" type="text" name="nombre"/>
		<span>Vacunado:	</span>
			Si <form:radiobutton path="vacunado" value="True"/>  
        	No <form:radiobutton path="vacunado" value="False"/>  
		<input type="submit"/>
	</form:form>
	
	<a href="listadoMascotas">Listado de mascotas</a>
	<a href="listadoDuenos">Listado de dueños</a>
</body>
</html>