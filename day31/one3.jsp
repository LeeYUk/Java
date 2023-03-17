<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id"); 
    
    	ProductVO bag=new ProductVO();
    	
    	ProductDAO dao =new ProductDAO();
    	ProductVO bag2=dao.one(id);
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
	<td> 상품id:</td>
	<td><%= bag2.getId() %></td>
</tr>

<tr>
	<td> 상품이름:</td>
	<td><%= bag2.getName() %></td>
</tr>

<tr>
	<td>상품 내용:</td>
	<td><%= bag2.getContent() %></td>
</tr>

<tr>
	<td>상품 가격:</td>
	<td><%= bag2.getPrice() %></td>
</tr>

<tr>
	<td>검색한 회사:</td>
	<td><%= bag2.getCompany() %></td>
</tr>

<tr>
	<td>검색한 사진:</td>
	<td><%= bag2.getImg() %></td>
</tr>

</table>
</body>
</html>