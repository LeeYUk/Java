<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%
	String id = request.getParameter("id");
	String tel = request.getParameter("tel");
%>
<title>Insert title here</title>

<style type="text/css">
body {
	background: lime;
}

</style>

</head>
<body>
 값 넘어옴
	<hr color="red">
	가입한 id:<%= id %><br><!--출력  -->
	가입한 tel:<%= tel %><br><!--출력  -->
</body>
</html>