<%@page import="com.nit.dto.StockDetailsDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Stock Details</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty stockDetails}">
			<table border="1" bgcolor="cyan" align="center">
				<tr>
					<th>stockId</th>
					<th>Stock Name</th>
					<th>Stock Value</th>
					<th>Company</th>
					<th>Stock Type</th>
					<th>Exchange Name</th>
					<th>Listed On</th>
					<th>NextOneYearStockValue</th>
					<th>NextTwoYearStockValue</th>
					<th>NextThreeYearStockValue</th>
					<th>Change Percentage</th>
					<th>Verified On</th>
				</tr>
				<tr>
					<td>${stockDetails.stockId}</td>
					<td>${stockDetails.stockName}</td>
					<td>${stockDetails.stockValue}</td>
					<td>${stockDetails.company}</td>
					<td>${stockDetails.stockType}</td>
					<td>${stockDetails.exchangeName}</td>
					<td>${stockDetails.listedOn}</td>
					<td>${stockDetails.nextOneYearStockValue}</td>
					<td>${stockDetails.nextTwoYearStockValue}</td>
					<td>${stockDetails.nextThreeYearStockValue}</td>
					<td>${stockDetails.changePercentage}</td>
					<td>${stockDetails.verifiedOn}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1 style="color: red; text-align: center">Stock not found</h1>
		</c:otherwise>
	</c:choose>
	<br>
	<br>
	<h1 style="color: red; text-align: center">
		<a href="get_stock_details.jsp">Home Page</a>
	</h1>
</body>
</html>