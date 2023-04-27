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
		$("#result").empty();
        $.ajax({
            url : "list",
            success : function(data) {
            	$('#result').append(data)
            },
            error:function(request, status, error){
                alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
            } // error
        }); // ajax
	}); // $
</script>
</head>
<body>
	<h1>맛.zip 회원 커뮤니티</h1>
	<br>
	<%
		if (session.getAttribute("user_id") == null) {
	%>
	<hr color="green">
	<h3>회원 로그인이 필요합니다.</h3>
	<br>
	<form action="login" method="get">
		회원 ID : <input name="user_id" value=""><br> 비밀번호 : <input
			name="user_pw" value=""><br>
		<button type="submit">로그인</button>
	</form>

	<hr color="green">
	<h3>회원가입이 필요하다면 아래 항목을 입력해주세요.</h3>
	<br>
	<form action="join" method="get">
		회원 ID : <input name="user_id" value=""><br> 
		회원명 : <input name="username" value=""><br> 
		비밀번호 : <input name="user_pw" value=""><br>
		<button type="submit">회원가입</button>
	</form>
	<br>
	<br>
	<%
		} else {
	%>
	<hr color="green">
	${user_id} 님이 로그인 중입니다.
	<br>
	<a href="2_PostCRUD.jsp">
		<button style="background: pink;">커뮤니티 게시물 글 작성하기</button>
	</a>
	<br>
	<%
		}
	%>
	<button id="b1">맛집리뷰</button>
	<button id="b2">맛집사진첩</button>
	<button id="b3">맛집꿀팁공유</button>
	<button id="b4">자유게시판</button>
	<button id="b5">질문과답변</button>
	<br>
	<div id="result" style="background: #d9c9ff"></div>
	<form action="one2" method="get">
		검색하고싶은 내용 : <input name="search" value="">
		<button type="submit">게시물 검색하기</button>
	</form>
</body>
</html>