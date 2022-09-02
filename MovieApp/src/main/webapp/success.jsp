 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

out.print("WELCOME :"+session.getAttribute("username"));


%>
<%= session.getId() %>
<form action="MovieServlet">
<br>
Enter Choice<select name="language">
<option value="select">-------select------</option>
<option value="English">English</option>
<option value="Telagu">Telagu</option>
<option value="Tamil">Tamil</option>
<option value="Kannada">Kannada</option>

<input type="submit" value="Enter"><br>
</form>
</body>
</html>