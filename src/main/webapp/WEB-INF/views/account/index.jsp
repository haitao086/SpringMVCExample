<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Account Register</h3>
	<s:form method="post" commandName="account"
		action="${pageContext.request.contextPath }/account/save">
		<table cellpadding="2" cellspacing="2" border="0">
			<tr>
				<td>Username</td>
				<td><s:input path="username" /></td>
			</tr>
			<tr valign="top">
				<td>Password</td>
				<td><s:password path="password"
						title="One Upper case, one special char, one number, total length 6 to 20 chars. Example: aA1!bcf" /></td>
				<td><s:errors path="password" cssClass="error"></s:errors></td>
			</tr>
			<tr valign="top">
				<td>Age</td>
				<td><s:input path="age" /></td>
				<td><s:errors path="age" cssClass="error"></s:errors></td>
			</tr>


			<tr valign="top">
				<td>Email</td>
				<td><s:input path="email" /></td>
				<td><s:errors path="email" cssClass="error"></s:errors></td>
			</tr>

			<tr valign="top">
				<td>Website</td>
				<td><s:input path="website" /></td>
				<td><s:errors path="website" cssClass="error"></s:errors></td>
			</tr>



			<tr>
				<td>Full Name</td>
				<td><s:input path="fullName" /></td>
			</tr>
			<tr>
				<td>Birthday</td>
				<td><s:input path="birthday" /></td>
			</tr>



			<tr>
				<td>Role</td>
				<td><s:select path="role" items="${roles }" itemValue="id"
						itemLabel="name"></s:select></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</s:form>

</body>
</html>