<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="page-wrapper">
	<!--这里的错误信息放回其实应该加上argumentSeparator="、"属性，因为默认的腾讯返回的错误信息的内容中是由逗号分隔的。-->
	错误信息：<spring:message code="${message}" arguments="${args}"></spring:message>
</div>
