<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Register Form</h3>
	<s:form method="post" commandName="account"
		action="${pageContext.request.contextPath }/account/save">
		<table>
			<tr>
				<td>Username</td>
				<td>
					<s:input path="username"/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<s:password path="password"/>
				</td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td>
					<s:input path="fullName"/>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
					<input type="submit" value="Save"/>
				</td>
			</tr>
		</table>
	</s:form>

</body>
</html>