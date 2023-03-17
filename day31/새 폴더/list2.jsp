<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>


<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    	MusicDAO dao =new MusicDAO();
    	ArrayList<MusicVO> list =dao.list();
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
	for(MusicVO bag2: list){
		
%>
<tr>
<td><%= bag2.getId() %></td>
<td><a href="http://localhost:8888/webTest/one2.jsp?id=<%=bag2.getId()%>"><%=bag2.getName() %></a></td>
<td><%=bag2.getName() %></td>
<td><%=bag2.getSinger() %></td>
<td><%=bag2.getGenre()%></td>
<td><%=bag2.getAlbum() %></td>
</tr>
<% } %>
</table>
<% } %>
</body>
</html>