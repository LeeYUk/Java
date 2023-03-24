<%@page import="milti.MockDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="milti.MockVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    	MockDAO dao=new MockDAO();
    	dao.insert(bag);
    %>