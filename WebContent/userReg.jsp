<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %><!-- 加载struts2标签库 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册界面</title>
</head>
<body >
	<div class=reg_c fl ah">
	<s:form action="userRegister" method="post" name="frm">
		<table width="300" align="left" style="text-align:center;">
		<s:textfield name="user.userName" label="登录名称" style="width:220px;"/>
		<s:password name="user.password" label="登录密码" style="width:220px;"/>
		<s:password name="repassword" label="确认密码" style="width:220px;"/>
		<s:password name="user.realName" label="真实姓名" style="width:220px;"/>
		<s:password name="user.address" label="通信地址" style="width:220px;"/>
		<s:password name="user.email" label="电子邮件" style="width:220px;"/>
		<s:submit value="注册" align="center"></s:submit>
		</table>
	</s:form>
	</div>
</body>
</html>