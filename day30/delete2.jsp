<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String no = request.getParameter("no"); 
    
    	BbsVO bag=new BbsVO();
    	int no2= Integer.parseInt(no);
    	bag.setNo(no2);
    	
    	BbsDAO dao =new BbsDAO();
    	dao.delete(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	no: <%= no %><br>
</body>
</html>