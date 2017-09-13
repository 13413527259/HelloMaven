<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
<form action="<%=request.getContextPath() %>/user/edit/${user.id }" method="post">
	<table border="1">
		<tr><th>id</th><th>name</th><th>age</th></tr>
		<tr>
			<td>${user.id }</td>
			<td><input type="text" name="name" value="${user.name }"></td>
			<td>${user.age }</td>
		</tr>
	</table>
	<h2 style="background-color: green;opacity: 0.6;"><input type="submit"></h2>
</form>
<h2 style="background-color: red;opacity: 0.6;"><a href="<%=request.getContextPath() %>/user/delete/${user.id }">删除我</a></h2>
</body>
</html>