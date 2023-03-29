<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 등록</h3>
<form action="insert3.multi">
name:<input type="text" name="name" value="naver"><br>
url:<input type="text" name="url" value="http://www.naver.com"><br>
img:<input type="text" name="img" value="naver.png"><br>
<button type="submit">등록</button>
</form>

<h3>북마크 검색</h3>
<form action="one3.multi">
id:<input type="text" name="name" value="1"><br>
<button type="submit">검색</button>
</form>
</body>
</html>