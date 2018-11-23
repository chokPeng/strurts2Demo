<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户界面</title>
</head>
<style type="text/css">
body{
background:url(image/dog.jpg)
}
</style>
<body align="center">
<form name="queryform" action="QueryUser" method="post">
<span>输入您要查询的用户名</span>
	<input name="userName" type="text" width=140px>
	<input type="submit" value="确定">
</form>						
</body>
</html>