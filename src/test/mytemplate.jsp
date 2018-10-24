<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="category" uri="categoryTag" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Template</title>
<style type="text/css">
li {
	list-style-type: none;
}
</style>
</head>
<body>

	<table border="1" cellpadding="5" cellspacing="5" width="500">
		<tr>
			<td colspan="2">
				<a href="${pageContext.request.contextPath}/home">Home</a> |
				<a href="${pageContext.request.contextPath}/aboutus">About Us</a> |
				<a href="${pageContext.request.contextPath}/news">News</a>
			</td>
		</tr>
		<tr>
			<td valign="top" align="left" width="200">
				<category:categoryiesList/>
			</td>
			<td valign="top" align="left">
				<tiles:insertAttribute name="content"></tiles:insertAttribute>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				Copyright PMK Lab
			</td>
		</tr>
	</table>

</body>
</html>