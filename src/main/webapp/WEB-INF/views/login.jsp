<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JWeb | Login</title>
</head>
<body>
<form action="/login.do" method="post">
Enter name: <input type="text" name="name" />
Enter Password: <input type="password" name="password" /> 
<input type="submit" value="Login" />
<br> ${error}.
</form>
</body>
</html>