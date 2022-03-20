<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GET STOCK DETAILS</title>
</head>
<body>
	<h1 style="color: red; text-align: center">Get the Stock Details</h1>
	<form action="controller" method="POST">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<td>Stock Name ::</td>
				<td><input type="text" name="stockName"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="GET STOCK DETAILS"></td>
			</tr>
		</table>
	</form>
</body>
</html>