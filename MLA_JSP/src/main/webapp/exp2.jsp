<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exceptions</title>
</head>
<body>
	<%
	
		int x=100;
		int y=0;
		out.println(x/y);
	
	//no need of try catch block, because this <%@page errorPage="error.jsp" will handle
	%>
</body>
</html>