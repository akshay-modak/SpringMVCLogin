<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Login</title>
</head>
<body>
	
	<form action="log" method="get">
		<div align="center">
			<h1>Login Page</h1>
			<hr>
			<p>
				<label for="un">User Name :</label>
				<input type="text" id="un" name="uName" path="uName"/>
			</p> 
			<p>
				<label for="pwd">Password :</label>
				<input type="password" id="pwd" name="pWord" path="pWord"/>
			</p>
			
			<input type="submit" value="submit">
			&nbsp;&nbsp; <div><a href="newuser"> New User?>>></a></div>
		</div>
	</form>
</body>
</html>
