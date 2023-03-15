<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%
	String no = request.getParameter("no");
	String content = request.getParameter("content");
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