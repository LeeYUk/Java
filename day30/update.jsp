<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%
	String id = request.getParameter("id");
	String tel = request.getParameter("tel");
	
	MemberVO bag= new MemberVO(); //VO호출 인스턴스 생성후
	bag.setId(id);
	bag.setTel(tel);
	
	MemberDAO3 dao =new MemberDAO3();//DAO에 인자 전달
	dao.update(bag);
%>
<title>Insert title here</title>

<style type="text/css">
body {
	background: lime;
}

</style>

</head>
<body>
 값 넘어옴
	<hr color="red">
	가입한 id:<%= id %><br><!--출력  -->
	가입한 tel:<%= tel %><br><!--출력  -->
</body>
</html>