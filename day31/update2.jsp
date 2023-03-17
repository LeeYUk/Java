<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%
	String no = request.getParameter("no");
	int no2= Integer.parseInt(no);// string 형인 no을 int형으로 형변환
	
	String content = request.getParameter("content");
	
	 BbsVO bag =new BbsVO();
	 bag.setNo(no2);
	 bag.setContent(content);
    
    BbsDAO dao =new BbsDAO();
    dao.update(bag);
%>
<title>Insert title here</title>

<style type="text/css">
body {
	background: #037BFC;
}

</style>

</head>
<body>
 값 넘어옴
	<hr color="red">
	 no:<%= no %><br><!--출력  -->
	 content:<%= content %><br><!--출력  -->
</body>
</html>