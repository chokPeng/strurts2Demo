<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息界面</title>
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
<form action="userInfo">
<span>用户名 </span>
<input type="text" value="${sessionScope.CURRENT_USER.userName}" name="userName"><br>
<span>用户密码</span>
<input type="text" value="${sessionScope.CURRENT_USER.password}" name="password"><br>
<span>真实姓名</span>
<input type="text" value="${sessionScope.CURRENT_USER.realName}" name="realName"><br>
<span>用户性别</span>
<input type="text" value="${sessionScope.CURRENT_USER.sex}" name="sex"><br>
<span>家庭地址</span>
<input type="text" value="${sessionScope.CURRENT_USER.address}" name="address"><br>
<span>电子邮箱</span>
<input type="text" value="${sessionScope.CURRENT_USER.email}" name="email"><br>
<span>个人爱好</span>
<input type="text" value="${sessionScope.CURRENT_USER.favorite}" name="favorite"><br>
<span>验证问题</span>
<input type="text" value="${sessionScope.CURRENT_USER.question}" name="question"><br>
<span>验证答案</span>
<input type="text" value="${sessionScope.CURRENT_USER.answer}" name="answer"><br>
<input type="submit" height="10" value="提交"/>
</form>
</div>
</body>
</html>