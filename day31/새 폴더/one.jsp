<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id"); 
    
    	MovieVO bag=new MovieVO();
    	
    	MovieDAO dao =new MovieDAO();
    	MovieVO bag2=dao.one(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  
</head>
<body>
	검색한 id: <%= id %><br>
	<hr color="red">
	
<table class="table table-dark table-striped">
<tr>
	<td> id:</td>
	<td><%= bag2.getId() %></td>
</tr>

<tr>
	<td> tltle:</td>
	<td><%= bag2.getTitle() %></td>
</tr>

<tr>
	<td>content:</td>
	<td><%= bag2.getContent() %></td>
</tr>

<tr>
	<td>location:</td>
	<td><%= bag2.getLocation() %></td>
</tr>

<tr>
	<td>director:</td>
	<td><%= bag2.getDirector() %></td>
</tr>

</table>
</body>
</html>