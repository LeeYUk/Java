<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함, 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을때 사용하는 객체 필요 -->
    
    <%
        	//이렇게 하면 자바 코드 작성 가능
            	//HttpServletRequest requeset = new HttpServletRequest();  
            	//톰캣은 미리 reqeust를 만들어서 내장시켜놈
            	String id = request.getParameter("id");
            	String pw = request.getParameter("pw");
            	String name = request.getParameter("name");
            	String tel = request.getParameter("tel");
            	
            	MemberVO bag= new MemberVO(); //VO호출 인스턴스 생성후
            	bag.setId(id);
            	bag.setPw(pw);
            	bag.setName(name);
            	bag.setTel(tel);
            	
            	MemberDAO3 dao =new MemberDAO3();//DAO에 인자 전달
            	dao.insert(bag);
        %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
	background: lime;
}

</style>

</head>
<body>
	회원가입 요청됨
	<hr color="red">
	가입한 id:<%= id %><br><!--출력  -->
	가입한 pw:<%= pw %><br><!--출력  -->
	가입한 name:<%= name %><br><!--출력  -->
	가입한 tel:<%= tel %><br><!--출력  -->
</body>
</html>