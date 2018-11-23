<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录界面</title>
</head>
<style>body{
 background:url(image/dog.jpg)}</style>

<body align="center">
<div  style="width:600px;margin-left:auto;margin-right:auto;color:#fefcfd">
<form name="loginform" action="userLogin.action" method="post">
<table width="350" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td width="100" height="10" align="right" valign="middle"><h3>用户名:</h3></td>
		<td width="250" align="left" valign="middle">
		<input name="userName" type="text" class="login_input"/></td>
	</tr>
	<tr>
		<td width="100" height="10" align="right" valign="middle"><h3>密 码:</h3></td>
		<td height="10" align="left" valign="middle">
		<input name="password" type="password" class="login_input"></td>
	</tr>
	<tr>
		<td height="50" colspan="2" align="center" valign="middle">
		<input type="submit" height="10" value="登录"></td>
	</tr>
	<tr>
		<td height="50" colspan="2" align="center" valign="middle">
		<a href="userReg.jsp">没有账号？点我注册</a></td>
	</tr>
</table>
</form>						
</div>
</body>
</html>