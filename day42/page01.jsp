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
	//쿠키객체 생성 브라우저에 저장할 정보 1개당 쿠키1개
	Cookie c1 =new Cookie("category","exercise");
	Cookie c2 =new Cookie("exercise","soccer");
	
	//2.쿠키를 서버에서 브라우저로 보냄
	response.addCookie(c1);
	response.addCookie(c2);
%>
<hr>브라우저에 쿠키를 심음
<a href="page02.jsp">page01쿠키출력</a>

</body>
</html>