<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id"); 
    
    	MusicVO bag=new MusicVO();
    	
    	MusicDAO dao =new MusicDAO();
    	MusicVO bag2=dao.one(id);
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
	<td> 노래이름:</td>
	<td><%= bag2.getName() %></td>
</tr>

<tr>
	<td>가수:</td>
	<td><%= bag2.getSinger() %></td>
</tr>

<tr>
	<td>장르:</td>
	<td><%= bag2.getGenre() %></td>
</tr>

<tr>
	<td>앨범:</td>
	<td><%= bag2.getAlbum() %></td>
</tr>

</table>
</body>
</html>