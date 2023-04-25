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
	회원 ID : <input name="user_id" value="hong"><br>
	게시판 카테고리 : 
		<select name="category">
		    <option value="맛집리뷰">맛집리뷰</option>
		    <option value="맛집사진첩">맛집사진첩</option>
		    <option value="맛집꿀팁공유">맛집꿀팁공유</option>
		    <option value="자유게시판">자유게시판</option>
		    <option value="질문과답변">질문과답변</option>
		</select><br>
	제목 : <input name="title" value=""><br>
	내용 : <input name="content" value=""><br>
	상호명 : <input name="store" value=""><br>
	<button type="submit">서버로 전송</button>
</form>

</body>
</html>