<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>list 요청 성공</h3>
<c:forEach items="${list}" var="bag">
id: ${bag.id}<br>
노래이름: ${bag.name}<br>
가수: ${bag.singer}<br>
장르: ${bag.genre}<br>
앨범사진: <img src="resources/img/${bag.album}" width="250" height="250"><br>
<hr>
</c:forEach>
</body>
</html>