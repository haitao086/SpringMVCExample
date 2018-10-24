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

		<tr>
			<td>Role Name</td>
			<td>${account.role.name }</td>
		</tr>
		<tr>
		<td>Birthday </td>
			<td><fmt:formatDate var="birthday" value="${account.birthday }"
					pattern="MM/dd/yyyy" /> ${birthday }</td>
		</tr>
	</table>

</body>
</html>