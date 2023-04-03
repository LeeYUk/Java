<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		//alert("월요일")
		$('#b1').click(function() {
			$.ajax({
				url : "movie",
				data : {
					title : $('#title').val(),
					price : $('#price').val()
				},
				success : function() {
					alert("성공")
					alert(x)
					$("#result").append(x+<"br">)
				},
				error : function() {
					alert("실패")
				}
			})
		})
			$('#b2').click(function() {
			$.ajax({
				url : "fruit",
				success : function() {
					alert("성공")
					alert(x)
					$("#result").append(x+<"br">)
				},
				error : function() {
					alert("실패")
				}
			})
		})
			$('#b3').click(function() {
			$.ajax({
				url : "tour",
				success : function() {
					alert("성공")
					alert(x)
					$("#result").append(x+<"br">)
				},
				error : function() {
					alert("실패")
				}
			})
		})
	})
</script>
</head>
<body>
영화제목:<input id="title"><br>
영화관람표:<input id="price">
<button id="b1">예매 확인</button><br>
<button id="b2">과일목록 가지고 오기</button><br>
<button id="b3">여행목록 가지고 오기</button><br>
<hr>
<div id="result"></div>
</body>
</html>