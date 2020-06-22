<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Artículos Java Web JSP y Servlet</title>
</head>
<body>
	<h1>Administrar Artículos</h1>
	<table border="1" width="50%" align="center">
		<tr>
			<td align="center"><a href="adminArticulo?action=nuevo">Nuevo</a></td>			
		</tr>
		<tr>
			<td align="center"><a href="adminArticulo?action=mostrar">Mostrar</a></td>
		</tr>
	</table>
	<form action="adminArticulo">
		<p>
			<label for="nombre">Nombre:</label>
			<input type="text" name="nombre" id="nombre" maxlength="50" />
		</p>
		<input type="submit" value="Enviar">
	</form>
	
</body>
</html>