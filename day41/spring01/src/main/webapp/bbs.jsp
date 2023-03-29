<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>insert입니다</h3>
<hr>
<form action="insert2" method="get">

title: <input name="title" value="apple"><br>
content: <input name="content" value="apple"><br>
writer: <input name="writer" value="apple"><br>
<button type="submit">push</button>
</form>
<hr>

<h3>delete입니다</h3>
<form action="delete2" method="get">
no: <input name="no" value="1"><br>
<button type="submit">push</button>
</form>
<hr>

<h3>update입니다</h3>
<form action="update2" method="get">
no: <input name="no" value="1"><br>
content: <input name="content"><br>
<button type="submit">push</button>
</form>
<hr>

<h3>one입니다</h3>
<form action="one2" method="get">
no: <input name="no"><br>
<button type="submit">push</button>
</form>
<hr>

</body>
</html>