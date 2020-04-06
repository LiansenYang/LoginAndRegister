<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${msg}"></c:out>
	<!-- 
		1、Why使用form标签？
		可以快速的开发出表单的页面，而且可以更方便的进行表单值的回显
	 -->
	 <form:form action="${pageContext.request.contextPath}/login" method="POST" modelAttribute="userForm">
	 	 用户名：<form:input path="userName" /><br/>
	 	 密码：<form:password path="password"/>
	 	 <input type="submit" value="提交">
	 </form:form>
</body>
</html>