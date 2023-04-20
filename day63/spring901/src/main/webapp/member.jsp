<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 화면입니다</h3>
<hr>
<form action="insert" method="get">
아이디: <input name="id"><br>
패스워드: <input name="pw"><br>
이름: <input name="name"><br>
전화번호: <input name="tel"><br>
<button type="submit">push</button>
</form>
<hr color="red">

<h3>회원수정 화면입니다. </h3>
<hr color="red">
<form action="update" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원검색 화면입니다. </h3>
<a href="list">모든 회원정보 가지고오기</a>
<hr color="red">
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>로그인. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="apple"><br>
	<button type="submit">로그인</button>
</form>
<hr color="red">
</form>
</body>
</html>