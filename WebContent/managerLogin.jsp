<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录界面</title>
</head>
<body>
<div class="login_b f1">
<p class="title f1" >管理员登录</p>
<div class="login_d f1">
<form name="managerLoginForm" action="managerLogin.action" method="post">
<table width="350" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="100" height="10" align="right" valign="middle">用户名:</td>
		<td width="250" align="left" valign="middle">
		<input name="managerName" type="text" class="login_input"/></td>
	</tr>
	<tr>
		<td width="100" height="10" align="right" valign="middle">密码：</td>
		<td height="10" align="left" valign="middle">
		<input name="password" type="password" class="login_input"></td>
	</tr>
	<tr>
		<td height="50" colspan="2" align="center" valign="middle">
		<input type="submit" height="10" value="登录"></td>
	</tr>
</table>
</form>						
</div>
</div>
</body>
</html>