<%@page import="com.multi.tastezip.CsPostsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {

	}) // $
</script>
</head>
<body>
	<br>
	<a href="1_mainIndex.jsp">
		<button style="background: pink;">게시글 목록으로 돌아가기</button>
	</a>
	<br> 게시물의 post_id는 ${vo.post_id} 입니다.
	<br>
	<br> 작성자 : ${vo.user_id}
	<br> 카테고리 : ${vo.category}
	<br> 선호 음식 카테고리 : ${vo.favorite_food_cg}
	<br>
	<br>
	<table>
		<tr>
			<td>title</td>
			<td>${vo.title}</td>
		</tr>
		<tr>
			<td>content</td>
			<td>${vo.content}</td>
		</tr>
		<tr>
			<td>update_date</td>
			<td>${vo.update_date}</td>
		</tr>
	</table>
	
	<hr color="green">
	
	<div id="result">
		<!-- for-each를 이용해 댓글 목록을 프린트!! -->
	</div>
</body>
</html>