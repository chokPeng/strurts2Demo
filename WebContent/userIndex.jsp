<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户默认界面</title>
</head>
<style>
body{
background:url(image/bridge.jpg) }</style>
<body align="center">
<span class="red">${sessionScope.CURRENT_USER.userName}用户，欢迎您进入个人向导页面</span>&nbsp;
<div class="itop_right f1">
	<a href="userinfo.jsp">
	<button>查看个人信息</button>
	</a>		
<div id="header">		
	<sx:div id="tsdiv" updateFreq="1000" href="userLogin"></sx:div>
</div>
		<font color="red">${message}</font><!-- 用于显示请求 -->
</div>
</body>
</html>