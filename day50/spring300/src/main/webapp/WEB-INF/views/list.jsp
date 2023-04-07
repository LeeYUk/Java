<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 테그추가 지시자 core사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식(expression) -->

<!-- bag.getId() -->
<c:forEach items="${list}" var="bag">
${bag.id}<br>
${bag.pw}<br>
${bag.name}<br>
${bag.tel}<br>
</c:forEach>
</body>
</html>