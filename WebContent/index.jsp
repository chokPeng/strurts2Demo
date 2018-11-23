<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>
</head>
<body>
	<div class="itop_body">
		<div class="itop_left" f1">欢迎光临好东东买卖网</div>
		<div class="itop_right" f1>
		<div id="header">		
			<sx:div id="tsdiv" updateFreq="1000" href="UserLogin.action">
			</sx:div>
		</div>
		<a href="http://localhost:8080/digital/UserLogin">hhh</a>
		<font color="red">${message}</font><!-- 用于显示请求 -->
		</div>
	</div>
</body>
</html>