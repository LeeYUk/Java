<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>  <!-- jsp문법 ProductVO bag= new ProductVO();  -->
    <jsp:setProperty property="*" name="bag"/> <!-- vo에 인자값 전달 -->
    
    <%
    	/*String id= request.getParameter("id");
    	String name= request.getParameter("name");
    	String content = request.getParameter("content");
   	    String price = request.getParameter("price");
   	    String company = request.getParameter("company");
   	    String img = request.getParameter("img");*/
    
    	/*ProductVO bag= new ProductVO();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setContent(content);
    	bag.setPrice(Integer.parseInt(price));
    	bag.setCompany(company);
    	bag.setImg(img);*/
    	
    	ProductDAO dao= new ProductDAO();
    	dao.insert(bag);	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	값넘어감
	<hr>
	
	id: <%=bag.getId() %> <br>
	name: <%=bag.getName() %> <br>
	content: <%=bag.getContent() %> <br>
	price: <%=bag.getPrice() %> <br>
	company: <%=bag.getCompany() %> <br>
	img:<img src="img/ <%=bag.getImg() %>"> <br>
</body>
</html>