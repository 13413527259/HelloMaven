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
<c:forEach items="${list}" var="item" varStatus="num">
	<h3
		 <c:if test="${num.index%2==0 }">
	 		style='background-color: red'
		 </c:if>
	>
	编号：${item.id }--姓名：${item.name}--age:${item.age}
	</h3>
</c:forEach>
</body>
</html>