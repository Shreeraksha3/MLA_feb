<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%><!-- converting java into xml file -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tags</title>
</head>
<body>
	<!-- Declaration tag --><!-- -custom functions we can create here,not built in -->
	<%!
	int x=200;
	int y=300;
	public int add()
	{
		return x+y;
	}
	%>
	
	<!--  Expression tag -->
	<%=add() %>
	
	<!-- scriplet tag --><!--  both custom and built in functions -->
	<br>
	<% 
	out.println("CURRENT DATE: "+new Date());
	%>
	
</body>
</html>