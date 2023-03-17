<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>

<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    	MovieDAO dao =new MovieDAO();
    	ArrayList<MovieVO> list =dao.list();
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
영화갯수 :<%=list.size() %>
<% if(list.size() == 0) { %>
<h3>등록된 정보가 없습니다</h3>
<img src ="img/4.png" width="250" height"250">
<%}else { %>
<a herf="http://localhost:8888/webTest/one.html"><button>돌아가기</button></a>
<table class="table table-dark table-striped">
<hr>

<tr>
<td>id</td>
<td>title</td>
<td>content</td>
<td>location</td>
<td>director</td>
</tr>

<%	
	for(MovieVO bag2: list){
		
%>
<tr>
<td><%= bag2.getId() %></td>
<td><a href="http://localhost:8888/webTest/one.jsp?id=<%=bag2.getId()%>"><%=bag2.getTitle() %></a></td>
<td><%=bag2.getContent() %></td>
<td><%=bag2.getLocation() %></td>
<td><%=bag2.getDirector() %></td>
</tr>
<% } %>
</table>
<% } %>
</body>
</html>