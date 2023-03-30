<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>one 요청 성공</h3>
<hr>
id: ${bag.id} ,
노래이름: ${bag.name}, 
가수: ${bag.singer} ,
장르: ${bag.genre} ,
앨범사진: <img src="resources/img/${bag.album}" width="250" height="250"> 
</body>
</html>