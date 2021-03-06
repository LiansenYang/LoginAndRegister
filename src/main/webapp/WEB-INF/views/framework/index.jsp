<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>Bootstrap 实例 - 边框表格</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">  
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>

<table class="table table-bordered">
	<caption>用户信息</caption>
	<thead>
		<tr>
			<th>用户ID</th>
			<th>用户名</th>
			<th>手机号</th>
			<th>email</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.users}" var="user">
			<tr>
				<td>${user.userid}</td>
				<td>${user.username}</td>
				<td>${user.phoneno}</td>
				<td>${user.email}</td>
		</c:forEach>
	</tbody>
</table>

</html>