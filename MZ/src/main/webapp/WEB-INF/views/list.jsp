<%@page import="com.multi.tastezip.CsPostsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border=1>
	<tr>
		<td class="top">post_id</td>
		<td class="top">category</td>
		<td class="top">favorite_food_cg</td>		
		<td class="top">title</td>
		<td class="top">user_id</td>
		<td class="top">created_date</td>
	</tr>

	<c:forEach items="${list}" var="bag">

		<tr>
			<td class="down">${bag.post_id}</td>
			<td class="down">${bag.category}</td>
			<td class="down">${bag.favorite_food_cg}</td>
			<td class="down"><a href="one1?post_id=${bag.post_id}">${bag.title}</a></td>
			<td class="down">${bag.user_id}</td>
			<td class="down">${bag.created_date}</td>
		</tr>

	</c:forEach>
</table>
