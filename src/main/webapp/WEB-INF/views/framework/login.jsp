<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>logining......</title>
    <link href="favicon.ico" rel="shortcut icon" />
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style=" background: url(${pageContext.request.contextPath}/images/loginBackground.jpg) no-repeat center center fixed; background-size: 100%;">
 
 	<c:out value="${msg}"></c:out>
	<!-- 
		1、Why使用form标签？
		可以快速的开发出表单的页面，而且可以更方便的进行表单值的回显
	 -->
	 <form:form action="${pageContext.request.contextPath}/login" method="POST" modelAttribute="userForm">
    <div class="modal-dialog" style="margin-top: 10%;">
        <div class="modal-content">
            <div class="modal-header">
 
                <h4 class="modal-title text-center" id="myModalLabel">登录</h4>
            </div>
            <div class="modal-body" id = "model-body">
                <div class="form-group">
 
 					用户名：<form:input path="userName" class="form-control" title="用户名" autocomplete="off"/>
<!--                     <input type="text" class="form-control"placeholder="用户名" autocomplete="off"> -->
                </div>
                <div class="form-group">
 					密&nbsp;&nbsp;码：<form:password path="password" class="form-control" title="密码" autocomplete="off"/>
<!--                     <input type="password" class="form-control" placeholder="密码" autocomplete="off"> -->
                </div>
            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary form-control">登录</button>
                </div>
                <div class="form-group">
                    <button type="button" class="btn btn-default form-control">注册</button>
                </div>
 
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
	</form:form> 
</body>
</html>