<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login is now successfull</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/demoApp/getDetails">
Firstname:<input type="text" name="fname">
<br>
Lastname:<input type="text" name="lname">
<br>
Gender:<input type="radio" name="gender" >Male
<input type="radio" name="gender">Female
<br>
<input type="submit" value="Login">
</form>
</body>
</html>