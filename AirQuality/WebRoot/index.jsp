<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>

<body>
	<table border="1" cellspacing="0" cellpadding="5">
		<th colspan="7">空气质量检测信息库</th>
		<tr>
			<td colspan="7"><a href="add.jsp">添加空气质量信息</a></td>
		</tr>
		<tr>
			<td>序号</td>
			<td>区域</td>
			<td>监测时间</td>
			<td>PM10数据</td>
			<td>PM2.5数据</td>
			<td>监测站</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${sessionScope.airs}" var="airs">
			<tr>
				<td>${airs.id}</td>
				<td>${airs.district.name}</td>
				<td>${airs.monitor_time}</td>
				<td>${airs.pm10}</td>
				<td>${airs.pm25}</td>
				<td>${airs.monitoring_station}</td>
				<td><a href='delAir?id=${airs.id}'>删除</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="getAll?pageindex=1">首页</a>
	<a href="getAll?pageindex=${pageindex-1}">上一页</a>
	<a href="getAll?pageindex=${pageindex+1}">下一页</a>
	<a href="getAll?pageindex=${totalPageCount}">尾页</a> 当前页面:${pageindex}
</body>
</html>
