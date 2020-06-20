<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String uName=(String)session.getAttribute("username"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login Successfull</title>
</head>
<body>

<h1>Login Successfull</h1> <br>
<h3>Welcome <%=uName.toUpperCase() %></h3>
</body>
</html>