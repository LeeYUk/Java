<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
session.setAttribute("count", 100);
%>

<hr>브라우저에 쿠키를 심었음.
<a href="page04.jsp">세션출력</a>
</body>
</html>