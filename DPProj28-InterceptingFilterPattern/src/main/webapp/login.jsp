<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 style="color: red; text-align: center">Login Page</h1>
	<form action="loginurl" method="POST">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<td>Username ::</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password ::</td>
				<td><input type="text" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	<c:if test="${!empty errorMsg}">
		<h1 style="color: red; text-align: center">${errorMsg}</h1>
	</c:if>
</body>
</html>