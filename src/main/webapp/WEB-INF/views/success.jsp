<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
	<h1>${Header}</h1>
	<p>${Desc}</p>
	<h1 style="color: green">${msg}</h1>
	<hr>
	
	<%-- <h1>Welcome, ${uname} </h1>
	<h1>Your email is ${email}</h1>
	<h1>Your password is ${upassword} </h1> --%>
	<h1>Welcome, ${user.uname} </h1>
	<h1>Your email is ${user.email}</h1>
	<h1>Your password is ${user.upassword} </h1>

</body>
</html>