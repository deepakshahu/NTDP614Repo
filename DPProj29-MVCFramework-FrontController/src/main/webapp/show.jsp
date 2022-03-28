<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result JSP Page</title>
</head>
<body>
	<h1 style="color: red; text-align: center">Result JSP Page</h1>
	<br>
	<h2 style="color: blue; text-align: center">Persons Information</h2>
	<c:if test="${!empty profileData}">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>PID</th>
				<th>PNAME</th>
				<th>PADDRS</th>
				<th>MOBILE NO</th>
				<th>AADHAR NO</th>
				<th>PASSPORT NO</th>
			</tr>
			<tr>
				<td>${profileData.pid}</td>
				<td>${profileData.pname}</td>
				<td>${profileData.paddrs}</td>
				<td>${profileData.mobileNo}</td>
				<td>${profileData.aadharNo}</td>
				<td>${profileData.passportNo}</td>
			</tr>
		</table>
	</c:if>
	<br>
	<br>
	<h1 style="text-align: center">
		<a href="index.jsp">Home Page</a>
	</h1>
</body>
</html>