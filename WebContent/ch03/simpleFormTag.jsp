<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%><!-- 加载Struts标签库 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h3>注册登记表</h3>
	<s:form action="register" method="post">		<!-- 表单标签 -->
		<s:textfield name="user.userName" label="姓名"></s:textfield>
		<s:password name="user.password" label="口令"></s:password>
		<s:select name="user.degree" label="学历" list="{'高中及以下','大学本科','研究生及以上'}"></s:select>
		<s:radio name="user.sex" label="性别" list="{'男','女'}"></s:radio>
		<s:textarea name="user.xieyi" label="注册协议" ></s:textarea>
		<s:submit value="提交"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>
	</center>
</body>
</html>