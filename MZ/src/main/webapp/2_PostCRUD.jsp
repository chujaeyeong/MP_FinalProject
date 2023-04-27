<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>게시물등록 화면입니다. </h3>
<hr color="red">
<form action="insert" method="get">
	회원 ID : <input name="user_id" value="${user_id}"><br>
	게시판 카테고리 : 
		<select name="category">
		    <option value="맛집리뷰">맛집리뷰</option>
		    <option value="맛집사진첩">맛집사진첩</option>
		    <option value="맛집꿀팁공유">맛집꿀팁공유</option>
		    <option value="자유게시판">자유게시판</option>
		    <option value="질문과답변">질문과답변</option>
		</select><br>
	제목 : <input name="title" value=""><br>
	내용 : <input name="content" value="" size=100 maxlength=50><br>
	상호명 : <input name="store" value=""><br>
	음식 카테고리 : 
		<select name="favorite_food_cg">
		    <option value="한식">한식</option>
		    <option value="양식">양식</option>
		    <option value="중식">중식</option>
		    <option value="일식">일식</option>
		    <option value="아시안음식">아시안음식</option>
		</select><br>
	<button type="submit">게시물 작성하기</button>
</form>

</body>
</html>