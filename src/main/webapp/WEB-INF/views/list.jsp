<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>

<title>Insert title here</title>
</head>
<body>
<table class="table"> 
	<tr>
	   <td>序号</td>
	   <td>名称</td>
	   <td>价格</td>
	   <td>生产日期</td>
	   <td>审核状态</td>
	</tr>
	<c:forEach items="${select }" var="item" varStatus="i">
	<tr>
	 <td>${i.count }</td>
	 <td>${item.name }</td>
	 <td>${item.price }</td>
	 <td>${item.dates }</td>
	 <td>${item.status.name }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>