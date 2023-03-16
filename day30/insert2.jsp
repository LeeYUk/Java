<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 전달된 값 받아주기 -->
    
    <%
     String title= request.getParameter("title");
     String content = request.getParameter("content");
     String writer = request.getParameter("writer");
     
     BbsVO bag =new BbsVO();
 	 bag.setTitle(title);
 	 bag.setContent(content);
 	 bag.setWriter(writer);
     
     BbsDAO dao =new BbsDAO();
     dao.insert(bag);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	body {
	background: #037bfc;
}
</style>
</head>
<body>
	게시판 업로드 요청됨
	<hr color="red">
	
	작성한 title: <%= title %> <br>
	작성한 content: <%= content %> <br>
	작성한 writer: <%= writer %> <br>
</body>
</html>