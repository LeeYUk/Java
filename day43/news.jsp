<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src=https://s.pstatic.net/dthumb.phinf/?src=%22https%3A%2F%2Fdiscovercrop-phinf.pstatic.net%2F%2FMjAyMzAzMjhfOTgg%2FMDAxNjc5OTc5MjE2MjA4.iRxNHcpAMNsVZUUEu3ANStS86HUtT_t-kWKojmLOZV0g.u4UT-ij68QyWnbH-Oha8OMDP2z6VnJz0omPATXjWvCUg.JPEG%2Fimage_374x246.jpg%22&type=nf464_260"
	width="250" height="300">
	
<%if(session.getAttribute("id")!= null){%>
	<form action="aaa">
	댓글<input name="reply"><br>
	<button>댓글달기</button>
	</form>
<%} %>
</body>
</html>