<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String w=request.getParameter("won");
	int won=Integer.parseInt(w);
	int sum=0;
	
	while(true){
		if(won<1283){
			break;
		}
		else
		{
			sum++;
		}
	}
	
%><%= sum %>