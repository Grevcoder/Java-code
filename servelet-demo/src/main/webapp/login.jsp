<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/home" method="post">
<h2>Welcome to login page</h2>
<div class="main">
<div class="submain">
<label for="username">User Name:</label>
<input type="text" name="uname"  placeholder="type username" />
</div>
<div class="submain">
<label for="password]">Password:</label>
<input type="password" name="password" placeholder="type password" id="pwd"/><br>
</div>
<input type="submit" value="Login" class="button"/>
</div>
</form>
</body>
</html>