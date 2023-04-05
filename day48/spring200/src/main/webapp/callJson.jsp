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
				url: "json.jsp",
				success: function(json) {
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
		
		$('#b3').click(function () {
			$('#result').empty()
			$.ajax({
				url: "json3.jsp",
				success: function(json) {
					$('#result').append(json)
				}
			})
		})
		
		$('#b4').click(function () {
			$('#result').empty()
			$.ajax({
				url: "json4.jsp",
				success: function(json) {
					$('#result').append(json)
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">JSON을 받아오기</button>
<button id="b2">JSON array을 받아오기</button>
<button id="b3">JSON3을 받아오기</button>
<button id="b4">JSON array4을 받아오기</button>
<hr>
<div id="result"></div>
</body>
</html>