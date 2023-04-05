<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function () {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id=json.id
					pw=json.pw
					name=json.name
					tel=json.tel
					$('#result').append(json)
				}
			})
		})
		
		$('#b11').click(function () {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id=json.id
					pw=json.pw
					name=json.name
					tel=json.tel
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					$('#result').append(json)
				}
			})
		})
		
		$('#b2').click(function () {
			$('#result').empty()
			$.ajax({
				url: "json2.jsp",
				success: function(json) {
					$('#result').append(json)
				}
			})
		})
		
		$('#b3').click(function() {
			$.ajax({
				url: "json3",
				dataType : "json",
				success: function(json) {
					no = json.no
					content = json.content
					$('#result').append(no + " " + content + "<br>")
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$.ajax({
				url: "json4",
				dataType : "json",
				success: function(json) {
					no = json[0].no
					content = json[0].content
					$('#result').append(no + " " + content + "<br>")
				} //success
			}) //ajax
		})//b4
	})
</script>
</head>
<body>
<button id="b1">controller에서 JSON(텍스트)을 받아오기</button>
<button id="b11">controller에서 JSON(table)을 받아오기</button>
<button id="b2">controller에서 JSON array을 받아오기</button>
<!-- url:json3, bbsvo에 값을 하나 넣어서 json으로 받아와서 출력 -->
<button id="b3">controller에서 JSON3을 받아오기</button>
<!-- url:json4, bbsvo에 2개가 들어간 arraylist를 만들어서 json array으로 받아와서 출력 -->
<button id="b4">controller에서 JSON array4을 받아오기</button>
<hr>
<div id="result"></div>
</body>
</html>