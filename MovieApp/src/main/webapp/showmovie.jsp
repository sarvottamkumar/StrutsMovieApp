 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String username =(String) session.getAttribute("username");

%>
<h1>Hi ${username }</h1>
<%
List<String> movies = (List)request.getAttribute("movies");
out.print(movies);
%>

</body>
</html>