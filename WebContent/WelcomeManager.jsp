<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员管理界面</title>
</head>
<style>
body{background:url(image/dog.jpg)
}
</style>
<body align="center">
<div>	
		<span class="red">${sessionScope.CURRENT_MANAGER.managerName}管理员，欢迎您</span>;
		<span class="red"><a href="userReg.jsp">添加新用户</a></span>
		<span class="red"><a href="queryUser.jsp">查询用户</a></span>
		<span class="red"><a href="DeleteUser.jsp">删除用户</a></span>
</div>
</body>
</html>