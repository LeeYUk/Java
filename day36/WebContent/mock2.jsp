<%@page import="milti.MockDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="milti.MockVO2"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    	MockDAO2 dao=new MockDAO2();
    	dao.insert(bag);
    %>