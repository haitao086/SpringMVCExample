<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Account Info</h3>
	<table>
		<tr>
			<td>Username</td>
			<td>${account.username }</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${account.password }</td>
		</tr>
		<tr>
			<td>Full Name</td>
			<td>${account.fullName }</td>
		</tr>
	</table>

</body>
</html>