<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Account Info</h3>
	<table cellpadding="2" cellspacing="2" border="1">

		<tr valign="top">
			<td>Username</td>
			<td>${account.username }</td>
		</tr>

		<tr valign="top">
			<td>Password</td>
			<td>${account.password }</td>
		</tr>

		<tr valign="top">
			<td>Age</td>
			<td>${account.age }</td>
		</tr>

		<tr valign="top">
			<td>Birthday</td>
			<td><fmt:formatDate var="birthday" value="${account.birthDay }"
					pattern="MM/dd/yyyy" /> ${birthday }</td>
		</tr>

		<tr valign="top">
			<td>Email</td>
			<td>${account.email }</td>
		</tr>

		<tr valign="top">
			<td>Website</td>
			<td>${account.website }</td>
		</tr>

	</table>

</body>


</html>