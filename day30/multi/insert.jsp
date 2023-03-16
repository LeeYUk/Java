<%@page import="multi.MovieDAO"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <%
    	MovieDAO dao= new MovieDAO();
    	dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id: <%= bag.getId() %> <br>
	title: <%= bag.getTitle() %> <br>
	content: <%=bag.getContent() %> <br>
	loaction : <%= bag.getLocation() %> <br>
	director: <%=bag.getDirector() %> <br>
</body>
</html>