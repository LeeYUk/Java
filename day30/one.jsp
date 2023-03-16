<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id"); 
    
    	MemberVO bag= new MemberVO();
    	
    	MemberDAO3 dao =new MemberDAO3();
    	MemberVO bag2=dao.one(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	no: <%= id %><br>
	<hr color="red">
검색한 비번:<%= bag2.getPw()  %><br>
검색한 이름:<%= bag2.getName()  %><br>
검색한 전화번호:<%= bag2.getTel()  %><br>
</body>
</html>