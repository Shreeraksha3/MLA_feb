<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empdata</title>
</head>
<body>
	<h1 align="center">:: Employee Data ::</h1>
	<jsp:useBean id="emp" class="com.test.Employee"><!-- used to create object for the clasess --><!-- equivalent to employee emp=new employee-->
	</jsp:useBean>
	<center>
	<jsp:setProperty property="*" name="emp"/><!-- * means for every method-->
	ID: <jsp:getProperty property="id" name="emp"/><br><br>
	Name: <jsp:getProperty property="name" name="emp"/><br><br>
	Company: <jsp:getProperty property="cmp" name="emp"/><br><br>
	Designation: <jsp:getProperty property="dsg" name="emp"/><br><br>
	</center>
</body>
</html>