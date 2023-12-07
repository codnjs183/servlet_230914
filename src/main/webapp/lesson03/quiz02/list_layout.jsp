<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멜롱 - 아이유</title>

<!-- Bootstrap CDN 주소 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<style>
	header {height:100px;}
	.content {min-height:500px;}
	footer {height:80px;}
	#singerInfo {height:200px; vertical-align: middle; }
	#singerPhoto {height:180px; padding:20px;}

</style>
</head>
<body>
	<div id="wrap" class="container">
		<header class="d-flex align-items-center">
			<jsp:include page="header.jsp"/>
		</header>
		<nav>
			<jsp:include page="menu.jsp"/>
		</nav>
		<section class="content py-4">
			<%-- 가수 정보 --%>
			<div id="singerInfo" class="border border-success align-middle">
				<jsp:include page="singer.jsp"/>
			</div>
			<br>
			<%-- 곡 목록 영역 --%>
			<h4>곡 목록</h4>
			<table class="table text-center">
				<thead>
					<tr>
						<th>no</th>
						<th>제목</th>
						<th>앨범</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</section>
		<footer>
			<jsp:include page="footer.jsp"/>
		</footer>
	</div>
</body>
</html>