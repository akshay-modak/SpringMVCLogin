<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="register" method="get">
		<div align="center">
			<h1>User Registration</h1>
			<hr>
			<p>
				<label for="uid">User ID :</label>
				<input type="text" id="uid" name="uId" path="uId"/>
			</p>
			
			<p>
				<label for="un">User Name :</label>
				<input type="text" id="un" name="uName" path="yName"/>
			</p> 
			<p>
				<label for="pwd">Password :</label>
				<input type="password" id="pwd" name="pWord" path="pWord"/>
			</p>
			
			<input type="submit" value="submit">
			
		</div>
	</form>
</body></html>