<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员页面</title>
</head>
<body>
<style>
body{
width:100%;
background:url(image/dog.jpg);
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;
}
</style>
</head>
<body align="center">
<div style="color:red">
<form action="ManagerInfo">
<span>管理员名 </span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.managerName}" name="manager.managerName"><br>
<span>管理员密码</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.password}" name="manager.password"><br>
<span>真实姓名</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.realName}" name="manager.realName"><br>
<span>管理员性别</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.sex}" name="manager.sex"><br>
<span>家庭地址</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.address}" name="manager.address"><br>
<span>电子邮箱</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.email}" name="manager.email"><br>
<span>电话号码</span>
<input type="text" value="${sessionScope.CURRENT_MANAGER.phoneNumber}" name="manager.phoneNumber"><br>
<input type="submit" height="10" value="提交"/>
</form>
</div>
</body>
</html>