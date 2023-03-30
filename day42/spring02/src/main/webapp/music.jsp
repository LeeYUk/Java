<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원검색 화면입니다. </h3>
<a href="list">모든 회원정보 가지고오기</a>
<hr color="red">
<form action="one" method="get">
	id : <input name="id" value="2"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>