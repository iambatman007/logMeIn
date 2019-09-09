<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.login.LoginBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
<h1>You Have successfully logged into your account</h1>>
</body>
</html>


<%
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getUsername());
%>